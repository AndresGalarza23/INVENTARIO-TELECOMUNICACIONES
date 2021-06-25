/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Product {
    
     private String productName;
   private Float price;
   private  int amount;
   private String brand;
   private int id;
   
   
      public Product(String productName, Float price, int amount, String brand, int id) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.brand = brand;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + getProductName() + ", price=" + getPrice() + ", amount=" + getAmount() + ", brand=" + getBrand() + ", id=" + getId() + '}';
    }
 
  
   
   
    public void enterdate(){
 }
    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }


   
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
    

