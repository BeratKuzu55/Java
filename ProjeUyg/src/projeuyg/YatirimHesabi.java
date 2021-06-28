
package projeuyg;

public class YatirimHesabi extends BankaHesabi{
    
    private String hesap_turu;
    
    public YatirimHesabi(double bakiye)
    {
        super(bakiye);
        this.hesap_turu = "Yatirim Hesabi";
    }
    
    public void paraEkle(double miktar)
    {
        double mevcut_bakiye = super.getBakiye();
        super.setBakiye(mevcut_bakiye + miktar);
        
       
    }
    
    public void paraCek(double miktar)
    {
        double mevcut_bakiye = super.getBakiye();
        super.setBakiye(mevcut_bakiye - miktar);
    }
    
    public String toString()
    {
        return "hesap turu " + hesap_turu + "\n" + super.toString();
    }
    
    
}
