/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author THAYCACAC
 */
public class CountCopyManager {

    public static final Scanner in = new Scanner(System.in);

    public  static int countWordInFile(String fileSource, String word) {
        FileReader fr = null;

        try {
            fr = new FileReader(fileSource);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;
            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
                line = br.readLine();
            }
            return count;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return 0;
    }

    public static void getFileNameContainsWordInDirectory(String source, String word) {
        File folder = new File(source);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                if (countWordInFile(file.getAbsolutePath(), word) != 0) {
                    System.out.println("file name: " + file.getName());
                }
            }
        }
    }
     public static void countWordsInFile() {
        System.out.print("Enter Path: ");
        String path = in.nextLine();
        System.out.print("Enter Word: ");
        String word = in.nextLine();
        int count = countWordInFile(path, word);
        System.out.println("Count: " + count);
    }

    public static void getFilesWithWordInDirectory() {
        System.out.print("Enter Path: ");
        String path = in.nextLine();
        System.out.print("Enter Word: ");
        String word = in.nextLine();
        getFileNameContainsWordInDirectory(path, word);
    }
} 
