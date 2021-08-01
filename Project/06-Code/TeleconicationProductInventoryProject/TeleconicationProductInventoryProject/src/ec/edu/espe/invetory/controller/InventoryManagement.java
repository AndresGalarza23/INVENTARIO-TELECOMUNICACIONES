/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.invetory.model.Inventory;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class InventoryManagement {
   boolean flag = false;
        String data = FileManager.read("data/Inventory.json");
        String dataProviders = FileManager.read("data/Provider.json");
        Inventory inventory = new Inventory();
        JSONArray array = (JSONArray) new JSONParser().parse(data);
        JSONArray arrayProviders = (JSONArray) new JSONParser().parse(dataProviders);
        JSONObject jsonObject = new JSONObject();
    
    
    
}
