/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.model;

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
    
}
