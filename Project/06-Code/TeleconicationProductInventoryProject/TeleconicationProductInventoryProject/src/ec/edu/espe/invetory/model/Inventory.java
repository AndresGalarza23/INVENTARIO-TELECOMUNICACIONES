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
public class Inventory {
    
    private String id;
    private String name;
    private String description;
    private double purchasePrice;
    private double salePrice;
    private int quantity;
    private int quantityMinimumStock;
    private int idProvider;

    public Inventory() {
    }
    
    public Inventory (String id, String name, String description, double purchasePrice, double salePrice, int quantity, int quantityMinimaStock, int idProvider) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.quantityMinimumStock = quantityMinimaStock;
        this.idProvider = idProvider;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
