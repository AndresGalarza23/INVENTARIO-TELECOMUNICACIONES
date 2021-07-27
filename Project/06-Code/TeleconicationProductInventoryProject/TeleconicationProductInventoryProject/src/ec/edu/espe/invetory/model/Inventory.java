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
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getPurchasePrice() {
        return purchasePrice;
    }
    
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
    public double getSalePrice() {
        return salePrice;
    }
    
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantityMinimumStock() {
        return quantityMinimumStock;
    }
    
    public void setQuantityMinimumStock(int quantityMinimaStock) {
        this.quantityMinimumStock = quantityMinimaStock;
    }
    
    public int getIdProvider() {
        return idProvider;
    }
    
    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }
    
}
