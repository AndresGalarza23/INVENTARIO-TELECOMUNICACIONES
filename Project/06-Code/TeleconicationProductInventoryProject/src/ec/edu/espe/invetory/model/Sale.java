/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Sale {

    private String date;
    private Integer id;
    private String name;
    private Integer quantity;

    public Sale(String date, Integer id, String name, Integer quantity) {
        this.date = date;
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public Sale(BasicDBObject dBObjectInventory) {
        this.id = dBObjectInventory.getInt("Id");
        this.name = dBObjectInventory.getString("Name");
        this.date = dBObjectInventory.getString("Date");

    }

    public BasicDBObject dbProductObjectProvider() {

        BasicDBObject dbProduct0bjectInvioce = new BasicDBObject();

        dbProduct0bjectInvioce.append("ID", this.getId());
        dbProduct0bjectInvioce.append("Name", this.getName());
        dbProduct0bjectInvioce.append("date", this.getDate());

        return dbProduct0bjectInvioce;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
