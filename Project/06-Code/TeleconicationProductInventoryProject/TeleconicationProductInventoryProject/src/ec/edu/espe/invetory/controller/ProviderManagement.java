/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import java.util.Date;



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
        System.out.println("Enter ID Invoice");
        String id = sc.nextLine();
        invoice.setId(id);

        Date date = new Date();
        System.out.println(date);
        invoice.setDate(date.toString());
    
        System.out.println("Enter Cedula Customer");
        String cedulaCustomer = sc.nextLine();
        invoice.setCedulaClient(cedulaCustomer);
        
    
    
    
    
    
    }
}
