
package projeuyg;

public class VadesizHesap extends BankaHesabi{
  
    
    String hesap_turu;
    public VadesizHesap(double bakiye)
    {
        super(bakiye);
        hesap_turu = "vadesiz";
    }
    
    
    public String getHesapTuru()
    {
        return hesap_turu;
    }
    
    public void paraTransferi(BankaHesabi gonderen, BankaHesabi alan , double miktar)
    {
        double gonderen_mevcut_bakiye = gonderen.getBakiye();
        gonderen.setBakiye(gonderen_mevcut_bakiye - miktar);
        
        double alan_mevcut_bakiye = alan.getBakiye();
        alan.setBakiye(alan_mevcut_bakiye + miktar);
        
    }
    
    
    public void krediKartiBorcOdeme(KrediKarti borclukart , double odenecek_miktar)
    {
        double guncel_borc = borclukart.get_guncel_borc();    
        borclukart.setGuncelBorc(guncel_borc - odenecek_miktar);  // kartin borc miktarini duzenledik 
        this.setBakiye(super.getBakiye() - odenecek_miktar);  // burada ata class dan bakiye bilgisini cektik ve vadesiz hesapla borc odemesi yaptık 
        System.out.println("borcunuz odenmistir");
        
    }
    
    public String toString()
    {
        return "hesap turu " + hesap_turu +  " " + "\n" + super.toString();
    }
    
    
    
}
