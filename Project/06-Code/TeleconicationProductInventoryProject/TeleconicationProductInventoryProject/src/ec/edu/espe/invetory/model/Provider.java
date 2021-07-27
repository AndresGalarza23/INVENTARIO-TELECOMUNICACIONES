/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.model;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class Provider {
    
    private String id;
    private String name;
    private String phoneNumber;
    private String address;

    public Provider() {
    }
    
     public Provider(String id, String name, String phone, String direction) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phone;
        this.address = direction;
    }
     
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
     public String getPhoneNumber() {
        return phoneNumber;
    }
     
     public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     
    
}
