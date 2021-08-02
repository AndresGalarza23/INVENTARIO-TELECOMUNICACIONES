/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import ec.edu.espe.invetory.model.Invoice;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class InvoiceManagement {
    
     public void inputInvoice(JSONObject object, int quantity) throws IOException, ParseException, org.json.simple.parser.ParseException {
        String data = FileManager.read("data/Invoice.json");
        Invoice invoice = new Invoice();
        JSONArray array = (JSONArray) new JSONParser().parse(data);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID Invoice");
        String id = sc.nextLine();
        invoice.setId(id);
        
        
    
    
    
    
    
    
    
    
    
    
    
    
}
