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
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class ProductController {
    
     DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public ProductController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("InventoryProduct");
            collection = DataBase.getCollection("Product");
            System.out.println("successful connection");
        }catch(UnknownHostException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
    
    
}
