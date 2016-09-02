/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00030_nsaltosdelines;

import Funciones.MyListArgs;
import Funciones.MySintaxis;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

/**
 *
 * @author miguel
 */
public class saltosDeLinea 
{    
    BufferedWriter   bw                        ;
    String           IN                  = ""  ;
    String          OUT                  = ""  ;
    String          DIR                  = ""  ;    
    String        NORMA                  = ""  ;    
    String  NORMA_LINES[]                = null;
    int     NORMA_INDEX                  = 0   ;
    int               i                  = 0   ; 
    BufferedReader brL;
    
    saltosDeLinea(String[]args)
    {
        String        ConfigFile         = ""  ;     
        BufferedImage bi                 = null;

        MyListArgs    Param         ;
        BufferedReader bf           ;

        Param      = new MyListArgs(args)                  ;
        ConfigFile = Param.ValueArgsAsString("-CONFIG", "");

        if (!ConfigFile.equals(""))
        {
            Param.AddArgsFromFile(ConfigFile);
        }//fin if

        String Sintaxis   = "-IN:str -OUT:str [-NORMA:str]";
        MySintaxis Review = new MySintaxis(Sintaxis, Param);

        IN               = Param.ValueArgsAsString ( "-IN"   , "" );
        OUT              = Param.ValueArgsAsString ( "-OUT"  , "" );
        NORMA            = Param.ValueArgsAsString ( "-NORMA", "" );
        
        i = 0;   
        File tmp = new File(OUT);
        if(tmp.isDirectory() & !OUT.endsWith(".*"))
        {
            tmp.mkdirs();
        }  
        
        //abrir buffer de escritura      
        bw = Archivos.newBuffer(OUT);
        if(!NORMA.equals(""))
        
        try
        {
            brL = new BufferedReader(new FileReader(NORMA));
        }catch(Exception e){}
        
        if(new File(IN).isDirectory())
        {
            //System.out.println("DIR");
            DIR = IN;
        }
    }
    public void process()
    { 
        File            files =  null;
        String         []temp =  null;
        String          value =  null;
                
        float             tmp;
        
        if(!DIR.equals("")&i==0)
        {
            files = new File(DIR);
            temp  = files.list();  
            IN = DIR+File.separator+temp[0] ;
            i++;
        }    
        
        BufferedReader br = null;
        if(!IN.endsWith(".DS_Store")&!IN.endsWith(".thumbs"))
        {
            if(!this.NORMA.equals(""))
            {
                try{
                    value = brL.readLine();
                }catch(Exception e){}
                System.out.println("****VALUE = "+value);
            }
            try
            {
                br = new BufferedReader(new FileReader(IN));
                System.out.println(IN);
            }catch(Exception e){}
            String line;
            float empty = 0;
            try
            {
                while ((line = br.readLine()) != null) 
                {
                    if (line.trim().isEmpty()) 
                    {
                        empty++;
                    }
                }
            }catch(Exception e){}

            //Archivos.escribeArchivo(OUT+File.separator+IN.substring(IN.lastIndexOf(File.separator)), String.valueOf(empty));
            //System.out.println("saltos = "+empty);
            String salida = new File(IN).getName()+" ";
            if(this.NORMA.equals(""))
            {
                salida += empty;
                System.out.println("+++++++value");
            }
            else
            {
                System.out.println("EMPTY = "+empty);
                System.out.println("------VALUE = "+value);
                //System.out.println("INDEX2 "+this.NORMA_INDEX);
                tmp     = 100/Float.parseFloat(value);
                salida  = String.valueOf(empty*tmp);
                System.out.println("SALIDA = "+salida);
                this.NORMA_INDEX++;
            }
            
            
            Archivos.addLine(bw, salida);
        }
        if(!DIR.equals(""))
        {
            files = new File(DIR);
            temp  = files.list();          
            while(i < temp.length) 
            {
                IN = DIR+File.separator+temp[i] ;
                //System.out.println("i = "+i);
                //System.out.println("-IN = "+IN);
                i++;
                process();
            }
        }
        Archivos.saveFile(bw);
        
    }
}
