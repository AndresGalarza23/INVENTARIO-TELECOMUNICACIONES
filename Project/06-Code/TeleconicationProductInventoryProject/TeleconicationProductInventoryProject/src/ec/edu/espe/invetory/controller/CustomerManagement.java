/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class CustomerManagement {
   
     public JSONArray inputCustomer() throws IOException, ParseException {
        String data = FileManager.read("client.json");
        Scanner sc = new Scanner(System.in);
        JSONArray array = new JSONArray();
        JSONParser parser = new JSONParser();
        Customer customer = new Customer();
        array = (JSONArray) parser.parse(data);

        System.out.println("Enter Id");        
        String id = sc.nextLine();
        customer.setCedula(id);
        
        System.out.println("Enter Name");
        String name = sc.nextLine();
        customer.setNames(name);
        
        System.out.println("Enter Last Name");
        String lName = sc.nextLine();
        customer.setLastName(lName);
        
        System.out.println("Enter Adress");
        String adress = sc.nextLine();
        customer.setAddress(adress);        

        System.out.println("Enter Phone");
        String phone = sc.nextLine();
        customer.setPhone(phone); 
     }
     
     
     
     
     
}
