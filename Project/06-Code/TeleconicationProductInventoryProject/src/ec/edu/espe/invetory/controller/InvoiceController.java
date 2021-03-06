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
import ec.edu.espe.invetory.model.Invoice;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class InvoiceController {

    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    DefaultTableModel model = new DefaultTableModel();
    DBCursor cursor = null;

    public InvoiceController() {
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("InventoryProduct");
            collection = DataBase.getCollection("Invoice");
            System.out.println("successful connection");
        } catch (UnknownHostException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean sale(Integer idS, Integer quantityS) {

        Double quantity;

        DBObject find = new BasicDBObject("ID", new BasicDBObject("$eq", idS));

        document.put("ID", idS);
        cursor = collection.find(document);

        while (cursor.hasNext()) {

            DBObject obj = cursor.next();
            quantity = (double) obj.get("Sale Price");

            double Sale = quantity * quantityS;

            DBObject updatedSale = new BasicDBObject().append("$set", new BasicDBObject().append("Price", Sale));
            collection.update(find, updatedSale, false, true);

        }

        return true;
    }

    public boolean add(String date, Integer id, Integer cedula, String name, Integer quantity) {
        ;
        ArrayList<Invoice> invoice = new ArrayList<>();
        double totalPrice = 0;

        invoice.add(new Invoice(date, id, cedula, name, quantity, totalPrice));
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

    public void searchId(Integer ids, JTable TblSearchInvoice) {

        DBObject find = new BasicDBObject("ID", new BasicDBObject("$eq", ids));
        try (DBCursor cursor = collection.find(find)) {

            DBCursor cursor1 = collection.find(find);
            DBCursor cursor2 = collection.find(find);
            DBCursor cursor3 = collection.find(find);
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Date");
            model.addColumn("Cedula");

            while (cursor.hasNext()) {

                model.addRow(new Object[]{cursor.next().get("ID"), cursor1.next().get("Name"),
                    cursor2.next().get("Date"), cursor3.next().get("Cedula")});

                TblSearchInvoice.setModel(model);

            }
        }

    }

    public void searchCedula(Integer cedulas, JTable tblSearchInvoice) {

        DBObject find = new BasicDBObject("Cedula", new BasicDBObject("$eq", cedulas));
        try (DBCursor cursor = collection.find(find)) {
            DBCursor cursor1 = collection.find(find);
            DBCursor cursor2 = collection.find(find);
            DBCursor cursor3 = collection.find(find);
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Date");
            model.addColumn("Cedula");
            while (cursor.hasNext()) {

                model.addRow(new Object[]{cursor.next().get("ID"), cursor1.next().get("Name"),
                    cursor2.next().get("Date"), cursor3.next().get("Cedula")});

                tblSearchInvoice.setModel(model);

            }
        }

    }

    public void display(JTable tblProducts) {

        DBCursor cursor = collection.find();
        DBCursor cursor1 = collection.find();
        DBCursor cursor2 = collection.find();
        DBCursor cursor3 = collection.find();

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Date");
        model.addColumn("Cedula");

        while (cursor.hasNext()) {

            model.addRow(new Object[]{cursor.next().get("ID"), cursor1.next().get("Name"),
                cursor2.next().get("Date"), cursor3.next().get("Cedula")});

            tblProducts.setModel(model);
        }
    }

}
