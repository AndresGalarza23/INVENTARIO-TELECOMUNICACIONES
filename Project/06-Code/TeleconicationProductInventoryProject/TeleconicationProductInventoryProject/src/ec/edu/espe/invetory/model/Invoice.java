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
public class Invoice {
    
    private static int counterIds = 1;
    private String id;
    private String date;
    private String cedulaClient;
    private double tax;
    private double total;

    public Invoice() {
    }
    
    public Invoice(String cedulaClient, double tax) {
        this();
      
        this.cedulaClient = cedulaClient;
        this.tax = tax;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getCedulaClient() {
        return cedulaClient;
    }
    
    public void setCedulaClient(String cedulaClient) {
        this.cedulaClient = cedulaClient;
    }
    
    public double getTax() {
        return tax;
    }
    
     public void setTax(double tax) {
        this.tax = tax;
    }
     
     public double getTotal() {
        return total;
    }
     
     public void setTotal(double total) {
        this.total = total;
    }
    
}
