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
import ec.edu.espe.invetory.model.Provider;
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
public class ProviderController {
    
     DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public ProviderController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("InventoryProduct");
            collection = DataBase.getCollection("Provider");
            System.out.println("successful connection");
        }catch(UnknownHostException ex){
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);            
        }
   
    }
    
     public boolean add(Integer id, String name, Integer phoneNumber, String address ){
        ArrayList<Provider> provider = new ArrayList<>();
        provider.add(new Provider(id, name, phoneNumber, address));
        for (Provider pueC : provider){
            collection.insert(pueC.dbProductObjectProvider());
            
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
    
      public boolean update(Integer ids, String names, Integer phoneNumber,String address){
        DBObject find = new BasicDBObject("ID", new BasicDBObject("$eq", ids));
       
        DBObject updated = new BasicDBObject().append("$set",new BasicDBObject().append("Name", names));
        DBObject updatedPhoneNumber = new BasicDBObject().append("$set", new BasicDBObject().append("Phone Number", phoneNumber));
        DBObject updatedAddress = new BasicDBObject().append("$set", new BasicDBObject().append("Address", address));
         
       
        collection.update(find, updated,false,true);
        collection.update(find, updatedPhoneNumber, false, true);
        collection.update(find, updatedAddress, false, true);
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
