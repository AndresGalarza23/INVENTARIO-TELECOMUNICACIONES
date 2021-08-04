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
public class Provider {
      private Integer id;
    private String name;
    private Integer phoneNumber;
    private String address;

    public Provider(Integer id, String name, Integer phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
      public Provider(BasicDBObject dBObjectInventory) {
        this.id = dBObjectInventory.getInt("Id");
        this.name =dBObjectInventory.getString("Name");
        this.phoneNumber = dBObjectInventory.getInt("Phone Number");
        this.address = dBObjectInventory.getString("Address");
       
    }
    
    
    public BasicDBObject dbProductObjectProvider(){
        
        BasicDBObject dbProduct0bjectProvider = new BasicDBObject();
        
        dbProduct0bjectProvider.append("ID", this.getId());
        dbProduct0bjectProvider.append("Name", this.getName());
        dbProduct0bjectProvider.append("Phone Number", this.getPhoneNumber());
        dbProduct0bjectProvider.append("Address", this.getAddress());
        
        return dbProduct0bjectProvider;
        
    }
    
    

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phoneNumber
     */
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}
