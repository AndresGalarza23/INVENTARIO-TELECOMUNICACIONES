/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.invetory.model.Provider;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class ProviderManagement {
    
    
      public void inputProvider() throws IOException, ParseException, org.json.simple.parser.ParseException {
        String data = FileManager.read("data/Provider.json");
        Provider provider = new Provider();
        JSONArray array = (JSONArray) new JSONParser().parse(data);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        String id = sc.nextLine();
        provider.setId(id);
        
         System.out.println("Enter Name");
        String name = sc.nextLine();
        provider.setName(name);

        System.out.println("Enter Adress");
        String adress = sc.nextLine();
        provider.setAddress(adress);

        System.out.println("Enter Phone");
        String phone = sc.nextLine();
        provider.setPhoneNumber(phone);

        JSONObject providerJson = new JSONObject();
        providerJson.put("id", provider.getId());
        providerJson.put("name", provider.getName());
        providerJson.put("adress", provider.getAddress());
        providerJson.put("phone", provider.getPhoneNumber());
        array.add(providerJson);
        FileManager.writeRecord("data/Provider.json", array.toJSONString());
    }
        
        
        
        
        
        
        
        
    
    
    
    }
}
