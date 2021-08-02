package ec.edu.espe.invetory.controller;

import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.invetory.model.Customer;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


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
        
         JSONObject client = new JSONObject();
        client.put("Id", customer.getCedula());
        client.put("Name", customer.getNames());
        client.put("Last Name", customer.getLastName());
        client.put("Adress", customer.getAddress());
        client.put("Phone", customer.getPhone());
        array.add(client);
        return array;
     }
     
     
     
     
     
    public void saveClient() throws IOException, ParseException {
        FileManager.writeRecord("client.json", inputCustomer().toJSONString());
    }
}


