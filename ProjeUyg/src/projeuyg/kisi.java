
package projeuyg;


public class kisi {
    
    
    private String ad , soyad , email ;
    private int telefon_numarasi;
    
    public kisi(String ad , String soyad , String email , int telefon_numarasi)
    {
        this.ad = ad;    this.soyad = soyad;  this.email = email;   
        this.telefon_numarasi = telefon_numarasi;
        
    }
    
    public String getAd()
    {
        return ad;
    }
    
    public String getTel()
    {
        return String.valueOf(telefon_numarasi);
    }
    
    public String getSoyad()
    {
        return soyad;
    }
    
    public String getMail()
    {
        return email;
    }
    
   
    
    public String toString()
    {
        return "Ad : " + ad + " Soyad : " + soyad + "\n email : " + email + "\n telefon muarasi : " + String.valueOf(telefon_numarasi);
    }
    
}
