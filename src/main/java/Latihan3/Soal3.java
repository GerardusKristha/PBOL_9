package Latihan3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Soal3 {
    public static void main(String[] args) {
        FileInputStream inStream = null;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File inFile = new File(chooser.getSelectedFile().getAbsolutePath());
        try {
            inStream = new FileInputStream(inFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        int fileSize = (int)inFile.length();
        byte[] byteArray = new byte[fileSize];
        try {
            inStream.read(byteArray);
            for(int i=0;i<fileSize;i++){
                System.out.print((char)byteArray[i]);
            }
            inStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
