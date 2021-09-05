/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.invetory.model.Customer;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
    
}
            
      