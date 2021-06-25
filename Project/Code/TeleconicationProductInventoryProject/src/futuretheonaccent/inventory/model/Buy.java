/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.model;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Buy { // this classdoes not exist in the diagram
   private String productNameBuy;
   private Float priceBuy;
   private int amountBuy;
   private String brandBuy;
   private int IdBuy;

    public Buy(String productNameBuy, Float priceBuy, int amountBuy, String brandBuy, int IdBuy) {
        this.productNameBuy = productNameBuy;
        this.priceBuy = priceBuy;
        this.amountBuy = amountBuy;
        this.brandBuy = brandBuy;
        this.IdBuy = IdBuy;
    }

    @Override
    public String toString() {
        return "Buy{" + "productNameBuy=" + productNameBuy + ", priceBuy=" + priceBuy + ", amountBuy=" + amountBuy + ", brandBuy=" + brandBuy + ", IdBuy=" + IdBuy + '}';
    }

    /**
     * @return the productNameBuy
     */
    public String getProductNameBuy() {
        return productNameBuy;
    }

    /**
     * @param productNameBuy the productNameBuy to set
     */
    public void setProductNameBuy(String productNameBuy) {
        this.productNameBuy = productNameBuy;
    }

    /**
     * @return the priceBuy
     */
    public Float getPriceBuy() {
        return priceBuy;
    }

    /**
     * @param priceBuy the priceBuy to set
     */
    public void setPriceBuy(Float priceBuy) {
        this.priceBuy = priceBuy;
    }

    /**
     * @return the amountBuy
     */
    public int getAmountBuy() {
        return amountBuy;
    }

    /**
     * @param amountBuy the amountBuy to set
     */
    public void setAmountBuy(int amountBuy) {
        this.amountBuy = amountBuy;
    }

    /**
     * @return the brandBuy
     */
    public String getBrandBuy() {
        return brandBuy;
    }

    /**
     * @param brandBuy the brandBuy to set
     */
    public void setBrandBuy(String brandBuy) {
        this.brandBuy = brandBuy;
    }

    /**
     * @return the IdBuy
     */
    public int getIdBuy() {
        return IdBuy;
    }

    /**
     * @param IdBuy the IdBuy to set
     */
    public void setIdBuy(int IdBuy) {
        this.IdBuy = IdBuy;
    }



   
}
