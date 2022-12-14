package Latihan4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileOutputStream outStream = null;
        System.out.print("Isi file : ");
        String info = input.nextLine();
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(null);
        File outFile = chooser.getSelectedFile();
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
