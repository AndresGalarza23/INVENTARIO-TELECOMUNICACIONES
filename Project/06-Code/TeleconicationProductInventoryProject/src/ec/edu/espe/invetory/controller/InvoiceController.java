/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.invetory.model.Invoice;
import ec.edu.espe.invetory.model.Product;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class InvoiceController {
    
    
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject(); 
    
    public InvoiceController(){
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("InventoryProduct");
            collection = DataBase.getCollection("Invoice");
            System.out.println("successful connection");
        }catch(UnknownHostException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
      public boolean add(String date, Integer id, Integer cedula, String name, Integer quantity) {
        ArrayList<Invoice> invoice = new ArrayList<>();
        invoice.add(new Invoice(date,id,cedula,name,quantity));
        for (Invoice pueC : invoice) {
            collection.insert(pueC.dbProductObjectInvoice());

        }

        int input = JOptionPane.showConfirmDialog(null, "Successful Registration", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;

    }
      
      
         public boolean deleteCedula(Integer cedula) {
        document.put("Cedula", cedula);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;

    }
   
               public boolean deleteId(Integer id) {
        document.put("ID", id);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;

    }
         
}
            
      