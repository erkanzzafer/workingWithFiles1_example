/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package g.workingwithfiles1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author zafer
 */
public class WorkingWithFiles1 {

    public static void main(String[] args) {
        createFile();
        getFileInfo();
    }

    public static void createFile() {
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya  Oluşturuldu");
            } else {
                System.out.println("Dosya  zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya Adı " + file.getName());
        } else {

        }
    }

}
