
package projeuyg;

import java.util.Random;


public class BankaHesabi {
    
    private String iban; 
    private double bakiye;
    
    public BankaHesabi(double bakiye)
    {
        this.bakiye = bakiye;
        
        Random rnd = new Random();
        iban = "1000" + "0000" + "0000" + String.valueOf(rnd.nextInt(10000));
        
    }
    
    public double getBakiye()
    {
        return bakiye;
    }
    
    public void setBakiye(double bakiye)
    {
        this.bakiye = bakiye;
    }
    
     public String getIban()
    {
        return iban;
    }
    
    
    public String toString()
    {
        return "iban : " + iban + " bakiye : " + String.valueOf(bakiye);
    }
    
    
}
