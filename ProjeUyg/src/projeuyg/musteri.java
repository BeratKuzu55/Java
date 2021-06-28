
package projeuyg;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JOptionPane;

public class musteri extends kisi
{
    private int musteriNumarasi;
    private ArrayList<BankaHesabi> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;
    
    public musteri(String ad , String soyad , String email , int telefon_numarasi)
    {
        super(ad , soyad , email , telefon_numarasi);
        
        hesaplar = new ArrayList<BankaHesabi>();
        krediKartlari = new ArrayList<KrediKarti>();
        
        Random rnd = new Random();
        
        musteriNumarasi=rnd.nextInt(500);
    }
    
    
    public String getMusteriNumarasi()
    {
        return String.valueOf(musteriNumarasi);
    }
    
    public VadesizHesap getVadesizHesap(int hesap_sira)
    {
        return (VadesizHesap)hesaplar.get(hesap_sira);   // vadesiz hesaptan yatirim hesabina transfer yaparken bu satirda 
        // sorun cikiyor 
    }
    
    public YatirimHesabi getYatirimHesabi(int hesap_sira)
    {
        return (YatirimHesabi)hesaplar.get(hesap_sira);
    }
    
    public BankaHesabi getBankaHesabi(int hesap_sira)
    {
        return hesaplar.get(hesap_sira);
    }
    
    public ArrayList<BankaHesabi> get_hesaplar()
    {
        return hesaplar;
    }
    
    public ArrayList<KrediKarti> getKrediKartlari()
    {
        return krediKartlari;
    }
    
    public String getHesapTuru(BankaHesabi hesap , int alan_hesap_sira)
    {
        if(this.hesaplar.get(alan_hesap_sira) instanceof VadesizHesap)
        {
            return "vadesiz";
        }
        else
        {
            return "yatirim";
        }
        
        
    }
    
    public void hesapEkle(String hesap_turu , double bakiye)
    {
        if(hesap_turu.equals("vadesiz") || hesap_turu.equals("Vadesiz") ||hesap_turu.equals("VADESİZ"))
        {
            VadesizHesap vadesizhesap = new VadesizHesap(bakiye);
            hesaplar.add(vadesizhesap);
        }
        
        if(hesap_turu.equals("yatirim") || hesap_turu.equals("yatırım") ||hesap_turu.equals("Yatirim") ||hesap_turu.equals("YATIRIM"))
        {
            YatirimHesabi yatirimhesabi = new YatirimHesabi(bakiye);
            hesaplar.add(yatirimhesabi);
        }       
        
        
    }
    
    
    public void krediKartiEkle(double limit , double guncel_borc )
    {
        KrediKarti kredikarti = new KrediKarti(limit , guncel_borc);
        krediKartlari.add(kredikarti);
        System.out.println("kredi kartiniz eklenmistir");
    }
    
    
    public void hesapSil(int hesap_sira)
    {
          double bakiye_kontrol = hesaplar.get(hesap_sira).getBakiye();
          
          if(bakiye_kontrol == 0.0)
          {
              hesaplar.remove(hesap_sira);  // parametre olarak gelecek sıradaki hesabi silecek
              System.out.println("hesabiniz silinmistir");
          }
          else if(bakiye_kontrol < 0.0)
          {
              System.out.println("borcunuz bulunmaktadir baska bir vadesiz hesaptan transfer yoluyla borcunuzu odeyiniz" + 
                      "\n borcunuz : " + String.valueOf(bakiye_kontrol));
          }
          else
          {
              System.out.println("lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
              JFrame jf = new JFrame("uyari");
              jf.setBounds(200, 100, 300, 150);
              
              JLabel lb = new JLabel("lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
             jf.setBounds(300,300,150,150);
             jf.setVisible(true);
             jf.add(lb);         
              
             
          }
          
    }
    
    
    public void krediKartiSil(int kart_sira)
    {
        double guncel_borc_kontrol = krediKartlari.get(kart_sira).get_guncel_borc();
        
        if(guncel_borc_kontrol == 0.0)
        {
            krediKartlari.remove(kart_sira);
        }
        else 
        {
            System.out.println("lütfen öncelikle borç ödemesi yapınız");
             JFrame jf = new JFrame("uyari");
              JLabel lb = new JLabel("lütfen öncelikle borç ödemesi yapınız");
             jf.setBounds(300,300,150,150);
             jf.setVisible(true);
             jf.add(lb); 
             System.out.println("kart silinmistir");
        }
        
    }
    
    
    
    public String toString()
    {
        return super.toString() + "\n " + "musteri numarasi " +  String.valueOf(musteriNumarasi) + " hesap sayisi " +
                String.valueOf(hesaplar.size());   
    }
    
    
    
}
