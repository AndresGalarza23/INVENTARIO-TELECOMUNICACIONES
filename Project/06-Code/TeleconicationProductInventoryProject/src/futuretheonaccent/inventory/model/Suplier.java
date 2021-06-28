/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Suplier {
    
    private String nameSuplier;
    private int RUC;

    public Suplier(String nameSuplier, int RUC) {
        this.nameSuplier = nameSuplier;
        this.RUC = RUC;
    }

    @Override
    public String toString() {
        return "Suplier{" + "nameSuplier=" + getNameSuplier() + ", RUC=" + getRUC() + '}';
    }

    /**
     * @return the nameSuplier
     */
    public String getNameSuplier() {
        return nameSuplier;
    }

    /**
     * @param nameSuplier the nameSuplier to set
     */
    public void setNameSuplier(String nameSuplier) {
        this.nameSuplier = nameSuplier;
    }

    /**
     * @return the RUC
     */
    public int getRUC() {
        return RUC;
    }

    /**
     * @param RUC the RUC to set
     */
    public void setRUC(int RUC) {
        this.RUC = RUC;
    }
    
    
    
}
