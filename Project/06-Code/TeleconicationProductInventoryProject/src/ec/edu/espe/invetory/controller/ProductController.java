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
import ec.edu.espe.invetory.model.Product;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
    
    
     public boolean add(Integer id, String name, String brand, double purchasePrice, double salePrice, Integer quantity, Integer idProvider ){
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(id, name, brand, purchasePrice, salePrice, quantity, idProvider));
        for (Product pueC : inventory){
            collection.insert(pueC.dbProductObjectInventory());
            
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

       }
     
      public boolean delete(Integer id){
        document.put("ID",id);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
               
                
    }
 
       public boolean update(Integer ids, String names){
        DBObject find = new BasicDBObject("ID", new BasicDBObject("$eq", ids));
        DBObject updated = new BasicDBObject().append("$set",new BasicDBObject().append("Name", names));
        collection.update(find, updated,false,true);
        int input = JOptionPane.showConfirmDialog(null, "Update Record", "OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
    }
    public void display(JTextArea txtArea){
        
        DBCursor cursor = collection.find();
        
        try{
            while(cursor.hasNext()){
                txtArea.setText(txtArea.getText()+"\n" + cursor.next().toString());
                
                
            }
        } finally{
                 cursor.close();
                    
                    }
        }
}
