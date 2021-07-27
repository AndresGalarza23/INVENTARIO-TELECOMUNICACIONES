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
public class Customer {
    
    private String cedula;
    private String names;
    private String lastName;
    private String address;
    private String phone;

    public Customer() {
    }
    
    public Customer(String cedula, String names, String lastName, String address, String phone) {
        this.cedula = cedula;
        this.names = names;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }
    
    public String getCedula() {
        return cedula;
    }
   
}
