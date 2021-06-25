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
public class Buy {
   private String productNameBuy;
   private Float priceBuy;
   private  int amountBuy;
   private String brandSale;
   private int IdSale;

    public Buy(String productNameBuy, Float priceBuy, int amountBuy, String brandSale, int IdSale) {
        this.productNameBuy = productNameBuy;
        this.priceBuy = priceBuy;
        this.amountBuy = amountBuy;
        this.brandSale = brandSale;
        this.IdSale = IdSale;
    }

    @Override
    public String toString() {
        return "Buy{" + "productNameBuy=" + productNameBuy + ", priceBuy=" + priceBuy + ", amountBuy=" + amountBuy + ", brandSale=" + brandSale + ", IdSale=" + IdSale + '}';
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
     * @return the brandSale
     */
    public String getBrandSale() {
        return brandSale;
    }

    /**
     * @param brandSale the brandSale to set
     */
    public void setBrandSale(String brandSale) {
        this.brandSale = brandSale;
    }

    /**
     * @return the IdSale
     */
    public int getIdSale() {
        return IdSale;
    }

    /**
     * @param IdSale the IdSale to set
     */
    public void setIdSale(int IdSale) {
        this.IdSale = IdSale;
    }
   
}
