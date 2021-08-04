/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.model;
import com.mongodb.BasicDBObject;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Product {
    
    private Integer id;
    private String name;
    private String brand;
    private double purchasePrice;
    private double salePrice;
    private Integer quantity;
    private Integer idProvider;

    public Product(Integer id, String name, String brand, double purchasePrice, double salePrice, Integer quantity, Integer idProvider) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.idProvider = idProvider;
    }
    
     public Product(BasicDBObject dBObjectInventory) {
        this.id = dBObjectInventory.getInt("Id");
        this.name =dBObjectInventory.getString("Name");
        this.brand = dBObjectInventory.getString("Brand");
        this.purchasePrice = dBObjectInventory.getDouble("Purchase Price");
        this.salePrice = dBObjectInventory.getDouble("Sale Price");
        this.quantity = dBObjectInventory.getInt("Quantity");
        this.idProvider = dBObjectInventory.getInt("ID Provide");
    }
    
    
    public BasicDBObject dbProductObjectInventory(){
        
        BasicDBObject dbProduct0bjectInventory = new BasicDBObject();
        
        dbProduct0bjectInventory.append("ID", this.getId());
        dbProduct0bjectInventory.append("Name", this.getName());
        dbProduct0bjectInventory.append("Brand", this.getBrand());
        dbProduct0bjectInventory.append("Purchase Price", this.getPurchasePrice());
        dbProduct0bjectInventory.append("Sale Price", this.getSalePrice());
        dbProduct0bjectInventory.append("Quantity", this.getQuantity());
        dbProduct0bjectInventory.append("ID Provide", this.getIdProvider());
        
        return dbProduct0bjectInventory;
        
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Integer idProvider) {
        this.idProvider = idProvider;
    }
   
    
    
    
}
