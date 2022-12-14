package Latihan1;

import java.io.File;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class soal5 {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if (!file.exists()) {
            System.out.println("Maaf file tidak ditemukan");
        } else {
            System.out.println("File ditemukan");
            System.out.println("Nama File : " + file.getName()
                    + "\nFull Path : " + file.getAbsolutePath());
        }
    }
}
