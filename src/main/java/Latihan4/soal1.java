package Latihan4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class soal1 {
    public static void main(String[] args) {
        FileOutputStream outStream = null;
        String info = "Ayo berlatih Stream";
        
        File outFile = new File("ujicobaOutputStream.txt");
        try {
            outStream = new FileOutputStream(outFile);
            outStream.write(info.getBytes());
            outStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
