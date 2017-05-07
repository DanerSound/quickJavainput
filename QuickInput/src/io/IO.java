package io;

import java.io.*;

/**
 * @author Andre Cristhian Barreto Donayre
 * questa classe mi semplifica le operazione di IO con un metodo singolo metdo da chiamare
 * abbiamo un dato di tipo generico che alla occorenza va cambiamo (eseguito cast)
 * in un dato di tipo di interesse
 */

public  final class IO {

    private static String DataReaded = null;
    

    public static String lineIn() {

        InputStreamReader isn = new InputStreamReader(System.in); // cioè sta dicendo che ti arrivera roba da fuori il sistema 
        BufferedReader Bf = new BufferedReader(isn); // la roba che arriva va messa dentro un buffer
        try {

            DataReaded = Bf.readLine(); // legge il dato da tastiera

        } catch (IOException io) {
            System.out.println("errore Io");
        }
        return DataReaded;
    }

}
