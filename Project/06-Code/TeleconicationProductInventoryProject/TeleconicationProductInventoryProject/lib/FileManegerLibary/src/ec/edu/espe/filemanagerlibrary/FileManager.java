/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanagerlibrary;

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
}