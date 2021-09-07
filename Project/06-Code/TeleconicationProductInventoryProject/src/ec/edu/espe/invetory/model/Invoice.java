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
public class Invoice {

    private String date;
    private Integer id;
    private Integer cedula;
    private String name;
    private Integer quantity;

    public Invoice(String date, Integer id, Integer cedula, String name, Integer quantity) {
        this.date = date;
        this.id = id;
        this.cedula = cedula;
        this.name = name;
        this.quantity = quantity;
    }



    public Invoice(BasicDBObject dBObjectInventory) {
        this.id = dBObjectInventory.getInt("Id");
        this.name = dBObjectInventory.getString("Name");
        this.date = dBObjectInventory.getString("Date");
        this.cedula = dBObjectInventory.getInt("Cedula");
    }
    

    public BasicDBObject dbProductObjectProvider() {

        BasicDBObject dbProduct0bjectInvioce = new BasicDBObject();

        dbProduct0bjectInvioce.append("ID", this.getId());
        dbProduct0bjectInvioce.append("Name", this.getName());
        dbProduct0bjectInvioce.append("Date", this.getDate());
        dbProduct0bjectInvioce.append("Cedula", this.getCedula());
        return dbProduct0bjectInvioce;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
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
