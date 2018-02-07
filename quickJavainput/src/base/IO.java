package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Andre Cristhian Barreto Donayre
 *
 */

public  final class IO {

    private static String DataReaded = null;
    
    public static String lineIn() {

        InputStreamReader isn = new InputStreamReader(System.in);
        BufferedReader Bf = new BufferedReader(isn); 
        try {
            DataReaded = Bf.readLine();// Read everything

        } catch (IOException io) {
            System.out.println("[Error on LineInput:Can't Read this type of data]");
        }
        return DataReaded;
    }
}
