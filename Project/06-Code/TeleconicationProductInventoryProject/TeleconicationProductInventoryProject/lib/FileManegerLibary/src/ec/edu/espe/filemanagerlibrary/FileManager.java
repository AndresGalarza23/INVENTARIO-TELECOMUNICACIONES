/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanagerlibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class FileManager {
  public static FileManager fileManager;

    public FileManager() {
    }

    public static FileManager getInstance() {
        if (fileManager == null) {
            fileManager = new FileManager();
        }
        return fileManager;
    }
     public static boolean findRecord(String criteria, int column, String fileName) throws IOException {
        List<String> listTemporal = new ArrayList<>();
        BufferedReader reader = openFileForRead(fileName);
        String currentLine = reader.readLine();
        boolean find = false;
        while (currentLine != null) {
            String[] columns = currentLine.split(";");
            if (criteria.equals(columns[column])) {
                listTemporal.add(currentLine);
                find = true;
            }
            currentLine = reader.readLine();
        }
        return find;
    }
     
     
     public static String read(String fileName) throws IOException {
        String list = "";
        BufferedReader reader = openFileForRead(fileName);
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            list = list + currentLine;
        }
        return list;
    }
     
     public static FileReader readRecord(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        return fileReader;
    }
     
     public static void writeRecord(String fileName, String record) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(record);
        }
    }
     
     
}
