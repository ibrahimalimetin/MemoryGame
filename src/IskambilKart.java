/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class IskambilKart {
    
    private int deger;
    private boolean tahmin = false;

    public IskambilKart(int deger) {
        this.deger = deger;
    }

    /**
     * @return the deger
     */
    public int getDeger() {
        return deger;
    }

    /**
     * @param deger the deger to set
     */
    public void setDeger(int deger) {
        this.deger = deger;
    }

    /**
     * @return the tahmin
     */
    public boolean isTahmin() {
        return tahmin;
    }

    /**
     * @param tahmin the tahmin to set
     */
    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }

    

    
}
