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
        
        System.out.println("Enter Tax");
        double tax = sc.nextDouble();
        invoice.setTax(tax);

        double subTotal = (quantity * Double.parseDouble(object.get("salePrice").toString()));
        double total = subTotal + subTotal*(tax / 100);

        invoice.setTotal(total);
        System.out.println("Total to pay: "+ total);
        JSONObject invoiceJson = new JSONObject();
        invoiceJson.put("id", invoice.getId());
        invoiceJson.put("cedulaCustomer", invoice.getCedulaClient());
        invoiceJson.put("tax", invoice.getTax());
        invoiceJson.put("date", invoice.getDate());
        invoiceJson.put("total", invoice.getTotal());
    
    
    
    
    
    }
}
