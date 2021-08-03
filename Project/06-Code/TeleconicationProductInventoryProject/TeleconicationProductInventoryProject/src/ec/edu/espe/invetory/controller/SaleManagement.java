/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.invetory.model.Inventory;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class SaleManagement {
    
    
    public void sale() throws IOException, ParseException, java.text.ParseException {
        InvoiceManagement invoice = new InvoiceManagement();
        Scanner sc = new Scanner(System.in);
        String data = FileManager.read("data/Inventory.json");
        Inventory inventory = new Inventory();
        JSONArray array = (JSONArray) new JSONParser().parse(data);
        JSONObject jsonObject = new JSONObject();
        boolean flag = false;
        
           System.out.println("--Products availables--");
        for (int i = 0; i < array.size(); i++) {
            jsonObject = (JSONObject) array.get(i);
            System.out.println("ID: " + jsonObject.get("id").toString());
            System.out.println("Product Name: " + jsonObject.get("productName").toString());
            System.out.println("Quantity: " + jsonObject.get("quantity").toString());
            System.out.println("");
        }
        System.out.println("------------------------");

        System.out.println("Enter Id To sale:");
        String productId = sc.nextLine();
    
         for (int i = 0; i < array.size(); i++) {
            jsonObject = (JSONObject) array.get(i);
            if (jsonObject.get("id").toString().equals(productId)) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Enter the quantity:");
            int quant = sc.nextInt();
            if (quant > Integer.parseInt(jsonObject.get("quantity").toString())) {
                System.out.println("Available quantity exceeded");
            } else {
                array.remove(jsonObject);
                int total = Integer.parseInt(jsonObject.get("quantity").toString()) - quant;
                jsonObject.put("quantity", total);
                array.add(jsonObject);
                invoice.inputInvoice(jsonObject, quant);
                FileManager.writeRecord("data/Inventory.json", array.toJSONString());
            }
        }else{
            System.out.println("ID doesn't exist");
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
