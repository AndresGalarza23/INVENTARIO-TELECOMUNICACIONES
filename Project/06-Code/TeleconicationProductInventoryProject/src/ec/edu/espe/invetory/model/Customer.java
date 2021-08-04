/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Customer {
    private Integer cedula;
    private String names;
    private String lastName;
    private String address;
    private Integer phone;

    public Customer() {
    }

    public Customer(Integer cedula, String names, String lastName, String address, Integer phone) {
        this.cedula = cedula;
        this.names = names;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
      
    }
 public Customer(BasicDBObject dBObjectInventory) {
        this.cedula= dBObjectInventory.getInt("Cedula");
        this.names =dBObjectInventory.getString("Names");
        this.lastName = dBObjectInventory.getString("Last Name");
        this.address = dBObjectInventory.getString("Address");
        this.phone = dBObjectInventory.getInt("Phone");
       
    }
    
    
    public BasicDBObject dbProductObjectInventory(){
        
        BasicDBObject dbProduct0bjectInventory = new BasicDBObject();
        
        dbProduct0bjectInventory.append("Cedula", this.getCedula());
        dbProduct0bjectInventory.append("Names", this.getNames());
        dbProduct0bjectInventory.append("LastName", this.getLastName());
        dbProduct0bjectInventory.append("Address", this.getAddress());
        dbProduct0bjectInventory.append("Phone", this.getPhone());
       
        
        return dbProduct0bjectInventory;
        
    }
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "cedula=" + cedula + ", names=" + names + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + '}';
    }
}
 

