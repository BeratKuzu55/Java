
package projeuyg;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends kisi{
    
    
    private int personelId; 
    private ArrayList<musteri> musteriler;
    
    public BankaPersoneli(String ad , String soyad , String email , int telefon_numarasi)
    {
        super(ad , soyad , email , telefon_numarasi);
        musteriler = new ArrayList<musteri>();
        Random rnd = new Random();
        this.personelId = rnd.nextInt(100);
    }
    
    public ArrayList<musteri> getMusteriler()
    {
        return musteriler;
    }
    
    
    public void musteri_ekle(musteri m)
    {
        musteriler.add(m); 
    }
    
    
}
