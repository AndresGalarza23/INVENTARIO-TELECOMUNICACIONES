/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.ConnectionString;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.invetory.model.Product;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class ProductController {

    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    DBCursor cursor = null;
    DefaultTableModel model = new DefaultTableModel();

    public ProductController() {
        
    

        
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("InventoryProduct");
            // collection = DataBase.getCollection("Product");
            System.out.println("successful connection");
        } catch (UnknownHostException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean add(Integer id, String name, String brand, double purchasePrice, double salePrice, Integer quantity, Integer idProvider) {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(id, name, brand, purchasePrice, salePrice, quantity, idProvider));
        for (Product pueC : inventory) {
            collection.insert(pueC.dbProductObjectInventory());

        }

        int input = JOptionPane.showConfirmDialog(null, "Successful Registration", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;

    }

    public boolean delete(Integer id) {
        document.put("ID", id);
        collection.remove(document);
        int input = JOptionPane.showConfirmDialog(null, "Delete Record", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;

    }

    public boolean update(Integer ids, String names, String brands, double purchasePrices, double salePrices, Integer quantity, Integer idProvider) {
        DBObject find = new BasicDBObject("ID", new BasicDBObject("$eq", ids));
        DBObject updatedName = new BasicDBObject().append("$set", new BasicDBObject().append("Name", names));
        DBObject updatedBrand = new BasicDBObject().append("$set", new BasicDBObject().append("Brand", brands));
        DBObject updatedPurchasePrice = new BasicDBObject().append("$set", new BasicDBObject().append("Purchase Price", purchasePrices));
        DBObject updatedSalePrice = new BasicDBObject().append("$set", new BasicDBObject().append("Sale Price", salePrices));
        DBObject updatedQuantity = new BasicDBObject().append("$set", new BasicDBObject().append("Quantity", quantity));
        DBObject updatedIdProvider = new BasicDBObject().append("$set", new BasicDBObject().append("ID Provide", idProvider));

        collection.update(find, updatedName, false, true);
        collection.update(find, updatedBrand, false, true);
        collection.update(find, updatedPurchasePrice, false, true);
        collection.update(find, updatedSalePrice, false, true);
        collection.update(find, updatedQuantity, false, true);
        collection.update(find, updatedIdProvider, false, true);

        int input = JOptionPane.showConfirmDialog(null, "Update Record", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;
    }

    public void search(Integer ids, JTable tblProduct) {

        DBObject find = new BasicDBObject("ID", new BasicDBObject("$eq", ids));
        try (DBCursor cursor = collection.find(find)) {

            DBCursor cursor1 = collection.find();
            DBCursor cursor2 = collection.find();
            DBCursor cursor3 = collection.find();
            DBCursor cursor4 = collection.find();
            DBCursor cursor5 = collection.find();
            DBCursor cursor6 = collection.find();

            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Brand");
            model.addColumn("Purchase Price");
            model.addColumn("Sale Price");
            model.addColumn("Quantity");
            model.addColumn("ID Provider");
            while (cursor.hasNext()) {
                model.addRow(new Object[]{cursor.next().get("ID"), cursor1.next().get("Name"),
                    cursor2.next().get("Brand"), cursor3.next().get("Purchase Price"),
                    cursor4.next().get("Sale Price"), cursor5.next().get("Quantity"),
                    cursor6.next().get("ID Provide")});

                tblProduct.setModel(model);

            }
        }

    }

    public boolean sale(Integer idS, Integer quantityS) {

        Integer quantity;

        DBObject find = new BasicDBObject("ID", new BasicDBObject("$eq", idS));

        document.put("ID", idS);
        cursor = collection.find(document);

        while (cursor.hasNext()) {

            DBObject obj = cursor.next();
            quantity = (Integer) obj.get("Quantity");

            Integer Sale = quantity - quantityS;

            DBObject updatedSale = new BasicDBObject().append("$set", new BasicDBObject().append("Quantity", Sale));
            collection.update(find, updatedSale, false, true);

        }

        return true;
    }

    public void display(JTable tblProducts) {

        DBCursor cursor = collection.find();
        DBCursor cursor1 = collection.find();
        DBCursor cursor2 = collection.find();
        DBCursor cursor3 = collection.find();
        DBCursor cursor4 = collection.find();
        DBCursor cursor5 = collection.find();
        DBCursor cursor6 = collection.find();

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Brand");
        model.addColumn("Purchase Price");
        model.addColumn("Sale Price");
        model.addColumn("Quantity");
        model.addColumn("ID Provider");

        while (cursor.hasNext()) {

            model.addRow(new Object[]{cursor.next().get("ID"), cursor1.next().get("Name"),
                cursor2.next().get("Brand"), cursor3.next().get("Purchase Price"),
                cursor4.next().get("Sale Price"), cursor5.next().get("Quantity"),
                cursor6.next().get("ID Provide")});

            tblProducts.setModel(model);
        }
    }
}
