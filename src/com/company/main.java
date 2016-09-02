package com.company;

import Funciones.Archivos;
import Funciones.MyListArgs;
import Funciones.MySintaxis;
import org.apache.lucene.analysis.ngram.NGramTokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by UAEM on 01/09/2016.
 */
public class main {
    public static void main(String[] args) throws IOException {

        String        ConfigFile      = "";
        String        IN              = "";
        String        OUT             = "";
        int           SIZE            = 1;

        float informationQuatity[];
        MyListArgs Param            ;
        boolean bnd = false;

        Param      = new MyListArgs(args)                  ;
        ConfigFile = Param.ValueArgsAsString("-CONFIG", "");

        if (!ConfigFile.equals(""))
        {
            Param.AddArgsFromFile(ConfigFile);
        }//fin if

        String Sintaxis      = "-IN:str -OUT:str -SIZE:int";
        MySintaxis Review    = new MySintaxis(Sintaxis, Param);

        IN            = Param.ValueArgsAsString ( "-IN"          , "" );
        OUT           = Param.ValueArgsAsString ( "-OUT"         , "" );
        SIZE          = Param.ValueArgsAsInteger( "-SIZE"        , 1  );

        File path = new File(IN);
        String[]files = path.list();
String actual = "";
        System.out.println("IN = "+IN);
        for (int i = 0; i < files.length; i++) {

            actual = IN+File.separator+files[i];
            System.out.println("actualFILe = "+actual);
            String code = Archivos.leerArchivoTexto(actual);

            Reader reader = new StringReader(code);
            NGramTokenizer gramTokenizer = new NGramTokenizer(reader, SIZE, SIZE);

            CharTermAttribute charTermAttribute = gramTokenizer.addAttribute(CharTermAttribute.class);

            ArrayList<String> tokens = new ArrayList<>();

            //escritura de los archivos de slaida
            BufferedWriter bw = Archivos.newBuffer(OUT+File.separator+files[i]);
            while (gramTokenizer.incrementToken()) {
                String token = charTermAttribute.toString();
                //System.out.println(token);
                //tokens.add(token);
                Archivos.addLine(bw, token);
            }
            Archivos.saveFile(bw);

        }


    }
}
