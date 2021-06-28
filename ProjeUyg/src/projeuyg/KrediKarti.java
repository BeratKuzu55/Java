
package projeuyg;

import java.util.Random;

public class KrediKarti {
    
    private int kart_numarasi;
    private double limit; 
    private double guncel_borc; 
    private double kullanilabilir_limit;
    
    public KrediKarti(double limit , double guncel_borc)
    {
        this.guncel_borc = guncel_borc;
        this.limit = limit;
        
        Random rnd = new Random();
        kart_numarasi = rnd.nextInt(100);
        
        kullanilabilir_limit = limit - guncel_borc;
        
    }
    
    
    public double get_guncel_borc()
    {
        return guncel_borc;
    }
    
    public void setGuncelBorc(double guncel_borc)
    {
        this.guncel_borc = guncel_borc;
    }
    
    
    public double getLimit()
    {
        return limit;
    }
    
    
    public void setLimit(double limit)
    {
        this.limit = limit;
    }
    
    
    public String toString()
    {
        return "kart numarasi : " + String.valueOf(kart_numarasi) + " limit : " + String.valueOf(limit) + " guncel borc : " + String.valueOf(guncel_borc) + " kullanilabilir limit : " + String.valueOf(kullanilabilir_limit);
    }
    
}
