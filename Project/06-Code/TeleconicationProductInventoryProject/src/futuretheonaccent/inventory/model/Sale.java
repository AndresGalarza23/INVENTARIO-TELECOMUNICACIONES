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
public class Sale {
   private String productNameSale;
   private Float priceSale;
   private  int amountSale;
   private String brandSale;
   private int IdSale;

    @Override
    public String toString() {
        return "Sale{" + "productNameSale=" + productNameSale + ", priceSale=" + priceSale + ", amountSale=" + amountSale + ", brandSale=" + brandSale + ", IdSale=" + IdSale + '}';
    }

    public Sale(String productNameSale, Float priceSale, int amountSale, String brandSale, int IdSale) {
        this.productNameSale = productNameSale;
        this.priceSale = priceSale;
        this.amountSale = amountSale;
        this.brandSale = brandSale;
        this.IdSale = IdSale;
    }

    /**
     * @return the productNameSale
     */
    public String getProductNameSale() {
        return productNameSale;
    }

    /**
     * @param productNameSale the productNameSale to set
     */
    public void setProductNameSale(String productNameSale) {
        this.productNameSale = productNameSale;
    }

    /**
     * @return the priceSale
     */
    public Float getPriceSale() {
        return priceSale;
    }

    /**
     * @param priceSale the priceSale to set
     */
    public void setPriceSale(Float priceSale) {
        this.priceSale = priceSale;
    }

    /**
     * @return the amountSale
     */
    public int getAmountSale() {
        return amountSale;
    }

    /**
     * @param amountSale the amountSale to set
     */
    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
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
