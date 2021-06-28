
package projeuyg;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;




public class ProjeUyg {
    
    
    
    
    
    public static class musteri_ekle extends JFrame implements ActionListener
    {
        JLabel lbl_ad , lbl_soyad , lbl_mail , lbl_tel ,lbl_ad2 , lbl_soyad2 , lbl_mail2 , lbl_tel2  , lbl_arama , lbl_bakiye, lbl_arananhesap , lbl_ogrenciadi , lbl_ogrencinumarasi 
                ,  lbl_limit , lbl_guncelborc;
        JTextField txt_ad , txt_soyad , txt_mail , txt_tel , txt_ad2 , txt_soyad2 , txt_mail2 , txt_tel2 , txt_arama , txt_bakiye , txt_arananhesap , txt_ogrenciadi , txt_ogrencinumarasi
                , txt_limit , txt_guncelborc;
        JButton btnm_ekle , btnm_listele , btn_vadesizhesapac , btn_yatirimhesapac , hesap_ac , hesap_goruntule , islem_yap , hesap_ac2 , btn_kredikartiekle , islem_yap2;
        JTable musteri_list;
         BankaPersoneli bp;
         JTextArea hesap_bilgileri , musteri_bilgileri;
       
        public musteri_ekle()
        {
            
           
            // ata sinifin ctor unu cagiriyoruz , bir adet banka personeli aliyoruz eklenen musterilerin temsilcisi bu personel olacak ve asagida da
            // form elemanlarini ekliyoruz 
            super("Musteri Ekle");
            this.setBounds(300, 200, 900, 500);
            this.setVisible(true);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             bp = new BankaPersoneli("Berat" , "Kuzu" , "abcd@mail.com" , 1);
            
            
            lbl_ad = new JLabel("Adi");
            lbl_soyad = new JLabel("Soyadi");
            lbl_mail = new JLabel("Mail Adresi");
            lbl_tel = new JLabel("Telefon Numarasi");
            
            
            lbl_arama = new JLabel("Bilgilerini goruntulemek istediginiz musterinin eklenme sirasini giriniz not(sira 0 dan baslamaktadir)");
            lbl_arama.setBounds(10, 170, 900, 50);
            this.add(lbl_arama);
            
            lbl_ad.setBounds(20, 25, 100, 30);
            lbl_soyad.setBounds(20, 50, 100, 30);
            lbl_mail.setBounds(20, 75, 100, 30);
            lbl_tel.setBounds(20, 100, 100, 30);
            
            
            this.add(lbl_ad);
            this.add(lbl_soyad);
            this.add(lbl_mail);
            this.add(lbl_tel);
            
            
            
            txt_ad = new JTextField();
            txt_soyad = new JTextField();
            txt_mail = new JTextField();
            txt_tel = new JTextField();
            
            txt_ad.setBounds(130, 25, 100, 25);
            txt_soyad.setBounds(130, 50, 100, 25);
            txt_mail.setBounds(130, 75, 100, 25);
            txt_tel.setBounds(130, 100, 100, 25);
            
            txt_arama = new JTextField();
            txt_arama.setBounds(20, 225, 50, 25);
            this.add(txt_arama);
            
            this.add(txt_ad);  this.add(txt_soyad);  this.add(txt_mail);  this.add(txt_tel);
            
            
            btnm_ekle = new JButton("Musteri Ekle");
            btnm_ekle.setBounds(75, 130, 150, 25);
            btnm_ekle.addActionListener(this);
            
            this.add(btnm_ekle);           
          
            btnm_listele = new JButton("Musteri Goster");
            btnm_listele.setBounds(75, 225, 150, 25);
            this.add(btnm_listele);
            btnm_listele.addActionListener(this);
            
            txt_ad2 = new JTextField();
            txt_soyad2 = new JTextField();
            txt_mail2 = new JTextField();
            txt_tel2 = new JTextField();
            
            txt_ad2.setBounds(370, 25, 100, 25);
            txt_soyad2.setBounds(370, 50, 100, 25);
            txt_mail2.setBounds(370, 75, 100, 25);
            txt_tel2.setBounds(370, 100, 100, 25);
           
             txt_ad2.setEditable(false);   txt_soyad2.setEditable(false);    txt_mail2.setEditable(false);   txt_tel2.setEditable(false);
            
            this.add(txt_ad2);  this.add(txt_soyad2);  this.add(txt_mail2);  this.add(txt_tel2);
           
            
            
            
            lbl_ad2 = new JLabel("Adi");
            lbl_soyad2 = new JLabel("Soyadi");
            lbl_mail2 = new JLabel("Mail Adresi");
            lbl_tel2 = new JLabel("Telefon Numarasi");
            
            lbl_ad2.setBounds(260, 25, 100, 30);
            lbl_soyad2.setBounds(260, 50, 100, 30);
            lbl_mail2.setBounds(260, 75, 100, 30);
            lbl_tel2.setBounds(260, 100, 100, 30);
            
            
            this.add(lbl_ad2);
            this.add(lbl_soyad2);
            this.add(lbl_mail2);
            this.add(lbl_tel2);
            
            btn_vadesizhesapac = new JButton("Vadesiz Hesap Ac");
            btn_vadesizhesapac.setBounds(20, 270 , 150 , 25);
            btn_vadesizhesapac.addActionListener(this);
            btn_vadesizhesapac.setVisible(false);
            this.add(btn_vadesizhesapac);
            
            
            btn_yatirimhesapac = new JButton("Yatirim Hesabi Ac");
            btn_yatirimhesapac.setBounds(180, 270 , 150 , 25);
            btn_yatirimhesapac.addActionListener(this);
            btn_yatirimhesapac.setVisible(false);
            this.add(btn_yatirimhesapac);
            
            txt_bakiye = new JTextField();
            txt_bakiye.setBounds(120, 300, 100, 30);
            txt_bakiye.setVisible(false);
            this.add(txt_bakiye);
            
            hesap_ac = new JButton("hesap ac");
            hesap_ac.setBounds(25, 335, 100, 25);
            hesap_ac.setVisible(false);
            hesap_ac.addActionListener(this);
            this.add(hesap_ac);
            
            hesap_ac2 = new JButton("hesap ac");
            hesap_ac2.setBounds(150, 335, 100, 25);
            hesap_ac2.setVisible(false);
            hesap_ac2.addActionListener(this);
            this.add(hesap_ac2);
            
            lbl_bakiye = new JLabel("bakiye giriniz");
            lbl_bakiye.setBounds(25, 300, 75, 25);
            lbl_bakiye.setVisible(false);
            this.add(lbl_bakiye);
            
            
            hesap_goruntule = new JButton("hesap goruntule");
            hesap_goruntule.setBounds(700, 225, 150, 25);
            hesap_goruntule.setVisible(true);
            hesap_goruntule.addActionListener(this);
            this.add(hesap_goruntule);
            
            
            
            txt_arananhesap = new JTextField();
            txt_arananhesap.setBounds(630, 225, 25, 25);
            txt_arananhesap.setVisible(true);
            this.add(txt_arananhesap);
            
            
            lbl_arananhesap = new JLabel("aranan hesap sira no giriniz not : sira 0 dan baslar");
            lbl_arananhesap.setBounds(300, 225, 300, 25);
            lbl_arananhesap.setVisible(true);
            this.add(lbl_arananhesap);
            
            
            hesap_bilgileri = new JTextArea();
            hesap_bilgileri.setBounds(530, 250, 250, 55);
            hesap_bilgileri.setVisible(false);
            this.add(hesap_bilgileri);
            
            musteri_bilgileri = new JTextArea();
            musteri_bilgileri.setBounds(500, 30, 350, 75);
            musteri_bilgileri.setVisible(true);
            musteri_bilgileri.setEditable(false);
            this.add(musteri_bilgileri);
            
            islem_yap = new JButton("Islem Yap");
            islem_yap.addActionListener(this);
            islem_yap.setBounds(550,320,100,25);
            islem_yap.setVisible(false);
            this.add(islem_yap);
            
            
            lbl_ogrenciadi = new JLabel("Ad-Soyad");
            lbl_ogrenciadi.setBounds(500, 115, 100, 25);
            this.add(lbl_ogrenciadi);
            
            lbl_ogrencinumarasi = new JLabel("Ogrenci no");
            lbl_ogrencinumarasi.setBounds(500, 140, 100, 25);
            this.add(lbl_ogrencinumarasi);
            
            txt_ogrenciadi = new JTextField("Berat Kuzu");
            txt_ogrenciadi.setEditable(false);
            txt_ogrenciadi.setBounds(600, 115, 100, 25);
            this.add(txt_ogrenciadi);
            
            txt_ogrencinumarasi = new JTextField("19360859022");
            txt_ogrencinumarasi.setEditable(false);
            txt_ogrencinumarasi.setBounds(600, 140, 100, 25);
            this.add(txt_ogrencinumarasi);
            
            lbl_limit = new JLabel("Limit");
            lbl_limit.setBounds(340,300,75,25);
            lbl_limit.setVisible(false);
            this.add(lbl_limit);
            
            lbl_guncelborc = new JLabel("Guncel borc");
            lbl_guncelborc.setBounds(340,330,100,25);
            lbl_guncelborc.setVisible(false);
            this.add(lbl_guncelborc);
            
            txt_limit = new JTextField();
            txt_limit.setBounds(430, 300, 75, 25);
            txt_limit.setVisible(false);
            this.add(txt_limit);
            
            txt_guncelborc = new JTextField();
            txt_guncelborc.setBounds(430, 330, 75, 25);
            txt_guncelborc.setVisible(false);
            this.add(txt_guncelborc);
            
            btn_kredikartiekle = new JButton("Kredi Karti Ekle");
            btn_kredikartiekle.setBounds(340, 270, 150, 25);
            btn_kredikartiekle.setVisible(false);
            btn_kredikartiekle.addActionListener(this);
            this.add(btn_kredikartiekle);
            
            islem_yap2 = new JButton("Ekle");
            islem_yap2.setBounds(340, 360, 100, 25);
            islem_yap2.addActionListener(this);
            islem_yap2.setVisible(false);
            this.add(islem_yap2);
        }
        
         musteri yenimusteri;
         int musteri_sayisi = -1;
         int aranan_musteri= 0;
         int aranan_hesap = 0;
        @Override
        public void actionPerformed(ActionEvent ae) {
             
            if(ae.getSource().equals(btnm_ekle))
            {
                // musteri sinifini girilen text elemanlarina girilen bilgilerle ornekliyoruz 
                musteri_sayisi +=1;
                yenimusteri = new musteri(txt_ad.getText() , txt_soyad.getText() , txt_mail.getText() ,Integer.parseInt(txt_tel.getText()) );     //girilen bilgiler ile yeni bir musteri ornekliyoruz
                bp.getMusteriler().add(yenimusteri);    
                uyari u3 = new uyari("musteri eklenmistir");
            }
            else if(ae.getSource().equals(btnm_listele))
            {
                aranan_musteri = Integer.parseInt(txt_arama.getText());
                // arraylist e eklediğimiz musterilerin bilgilerini çekiyoruz 
                 txt_ad2.setText(bp.getMusteriler().get(aranan_musteri).getAd());
                 txt_tel2.setText(bp.getMusteriler().get(aranan_musteri).getTel());
                 txt_mail2.setText(bp.getMusteriler().get(aranan_musteri).getMail());
                 txt_soyad2.setText(bp.getMusteriler().get(aranan_musteri).getSoyad());
                 btn_vadesizhesapac.setVisible(true);
                 btn_yatirimhesapac.setVisible(true);
                 musteri_bilgileri.setText(bp.getMusteriler().get(aranan_musteri).toString());
                 btn_kredikartiekle.setVisible(true);
                 
            }
            else if(ae.getSource().equals(btn_vadesizhesapac))
            {
                txt_bakiye.setVisible(true);
                hesap_ac.setVisible(true);
                lbl_bakiye.setVisible(true);
            }
            else if(ae.getSource().equals(btn_yatirimhesapac))
            {
                txt_bakiye.setVisible(true);
                hesap_ac2.setVisible(true);
                lbl_bakiye.setVisible(true);
            }
            else if(ae.getSource().equals(hesap_ac))
            {
                //girilen bakiye bilgisiyle yeni bir vadesiz hesap acıyoruz
                double bakiye = Double.parseDouble(txt_bakiye.getText());
                bp.getMusteriler().get(aranan_musteri).hesapEkle("vadesiz", bakiye );
                
                JFrame bilgi = new JFrame("bilgilendirme");
                bilgi.setVisible(true);
                bilgi.setBounds(400, 300, 400, 150);
                JLabel lbl_bilgi = new JLabel("hesabiniz acilmistir");
                bilgi.setLayout(null);
                lbl_bilgi.setBounds(20, 25, 200, 25);
                bilgi.add(lbl_bilgi);
                
                txt_bakiye.setVisible(false);
                 hesap_ac.setVisible(false);
                lbl_bakiye.setVisible(false);
                hesap_goruntule.setVisible(true);
                
               
            }
            else if(ae.getSource().equals(hesap_ac2))
            {
                //girilen bakiye bilgisiyle yeni bir yatirim hesabi aciyoruz
                 double bakiye = Double.parseDouble(txt_bakiye.getText());
                bp.getMusteriler().get(aranan_musteri).hesapEkle("yatirim", bakiye );
                
                uyari u2 = new uyari("Yatirim hesabiniz acilmistir");
                
                 txt_bakiye.setVisible(false);
                 hesap_ac2.setVisible(false);
                lbl_bakiye.setVisible(false);
                hesap_goruntule.setVisible(true);
            }
            else if(ae.getSource().equals(hesap_goruntule))
            {
                
                hesap_bilgileri.setVisible(true);
                islem_yap.setVisible(true);
                aranan_hesap = Integer.parseInt(txt_arananhesap.getText());
                hesap_bilgileri.setText(bp.getMusteriler().get(aranan_musteri).get_hesaplar().get(aranan_hesap).toString());  
              
                
            }
            else if(ae.getSource().equals(islem_yap))
            {
                // goruntulenen hesap vadesiz hesap ise islemYap sinifi , yatirim hesabi ise islemyapYatirim sinifi ornekleniyor. 
                if(bp.getMusteriler().get(aranan_musteri).get_hesaplar().get(aranan_hesap) instanceof VadesizHesap)
                {
                    islemYap iy = new islemYap(bp ,aranan_musteri , aranan_hesap);
                }
                if(bp.getMusteriler().get(aranan_musteri).get_hesaplar().get(aranan_hesap) instanceof YatirimHesabi)
                {
                    musteri m1 = bp.getMusteriler().get(aranan_musteri);
                    islemyapYatirim iy = new islemyapYatirim(bp , m1 , aranan_musteri , aranan_hesap);
                }
                
            }
            else if(ae.getSource().equals(btn_kredikartiekle))
            {
                // componentler gorunur hale geliyor
                lbl_limit.setVisible(true);
                lbl_guncelborc.setVisible(true);
                txt_limit.setVisible(true);
                txt_guncelborc.setVisible(true);
                islem_yap2.setVisible(true);
            }
            else if(ae.getSource().equals(islem_yap2))
            {
                // girilen bilgiler ile kredi karti ekleniyor 
                yenimusteri.krediKartiEkle(Double.parseDouble(txt_limit.getText()), Double.parseDouble(txt_guncelborc.getText()));
                uyari uy5 = new uyari("Kredi karti eklenmistir");
            }
            else
                ;
            
            
          
            
            
        }
       
        
    }
    
    
    public static class uyari extends JFrame 
    {
        
        public uyari(String mesaj)
        {
            // kullaniciyi bilgilendirmek istedigimizde bu classin ornegini aliyoruz 
            super("uyari");
            this.setVisible(true);
                this.setBounds(400, 300, 400, 150);
                JLabel lbl_bilgi = new JLabel(mesaj);
                this.setLayout(null);
                lbl_bilgi.setBounds(20, 25, 200, 25);
                this.add(lbl_bilgi);
        }
    }
    
    
    
    public static class islemyapYatirim extends JFrame implements ActionListener
    {
        // yatirim hesabi ile islem yapmak istedigimizde secilen hesabin paracek ve para ekle ozelliklerinin kullanilabilmesi gerekiyor 
        
        BankaPersoneli bp;
        musteri m1;
        JButton btn_parayatir , btn_paracek , btn_islemyap1, btn_islemyap2;
        JTextField jtf_miktar;
        JLabel lbl_bakiye;
        int musteri_sira , hesap_sira;
        public islemyapYatirim(BankaPersoneli bp , musteri m1 , int musteri_sira  ,  int hesap_sira)
        {
            super("Banka islemleri");
            this.bp = bp;
            this.m1 = m1;
            this.musteri_sira = musteri_sira;
            this.hesap_sira = hesap_sira;
            
            
            this.setBounds(300, 200, 600, 400);
            this.setVisible(true);
            this.setLayout(null);
            
            btn_parayatir = new JButton("para ekle");
            btn_parayatir.setBounds(50, 30, 200, 25);
            btn_parayatir.addActionListener(this);
            this.add(btn_parayatir);
            
            btn_paracek = new JButton("para cek");
            btn_paracek.setBounds(280, 30, 200, 25);
            btn_paracek.addActionListener(this);
            this.add(btn_paracek);
            
            btn_islemyap1 = new JButton("islem yap");
            btn_islemyap1.setBounds(50, 130, 100, 25);
            btn_islemyap1.addActionListener(this);
            btn_islemyap1.setVisible(false);
            this.add(btn_islemyap1);
            
            btn_islemyap2 = new JButton("islem yap");
            btn_islemyap2.setBounds(150, 130, 100, 25);
            btn_islemyap2.addActionListener(this);
            btn_islemyap2.setVisible(false);
            this.add(btn_islemyap2);
            
            jtf_miktar = new JTextField();
            jtf_miktar.setBounds(220, 100, 100, 30);
            jtf_miktar.setVisible(false);
            this.add(jtf_miktar);
            
            lbl_bakiye = new JLabel("bakiye giriniz");
            lbl_bakiye.setBounds(180, 100, 75, 25);
            lbl_bakiye.setVisible(false);
            this.add(lbl_bakiye);
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if(ae.getSource().equals(btn_paracek))
            {
                // bu butona tiklandiginda btn_islemyap2 , jtf_miktar , lbl_bakiye elemanlarini gorunur yapiyoruz 
                btn_islemyap2.setVisible(true);
                jtf_miktar.setVisible(true);
                lbl_bakiye.setVisible(true);
                
            }
            else if(ae.getSource().equals(btn_parayatir))
            {
                btn_islemyap1.setVisible(true);
                jtf_miktar.setVisible(true);
                lbl_bakiye.setVisible(true);
            }
            else if(ae.getSource().equals(btn_islemyap1))
            {
                // girilen miktar degerini double a cast edip parametre olarak aldıgımız musterinin yatirim hesabina ulasıp para ekle 
                // methodunu kullanıyoruz daha sonrasında bilgilendirme icin uyarı sınıfından bir ornek alıyoruz 
                double miktar = Double.parseDouble(jtf_miktar.getText());
                m1.getYatirimHesabi(hesap_sira).paraEkle(miktar); 
                uyari u4 = new uyari("islem yapilmistir");
            }
            else if(ae.getSource().equals(btn_islemyap2))
            {
                // burada yukaridakinden farkli olarak musterinin paracek methodunu kullaniyoruz 
                double miktar = Double.parseDouble(jtf_miktar.getText());
                m1.getYatirimHesabi(hesap_sira).paraCek(miktar);
                uyari u4 = new uyari("islem yapilmistir");
                
            }
            
            
            
        }
        
    }
    
    
    
    public static class islemYap extends JFrame implements ActionListener
    {
         // vadesiz hesap ile islem yapmak istedigimizde secilen hesabin para transferi ve kredikarti borcu ode ozelliklerinin kullanilabilmesi gerekiyor 
        // tabi kredi karti borcu ode ozelliginin kullanilabilmesi icin musterinin daha onceden bir kredi karti eklemis olmasi gerekir 
        JButton para_transferi , kredi_karti_borc_odeme , transfer_yap , borc_ode , kart_getir; 
        JTextField txt_gonderen_hesap_sira , txt_alan_hesap_sira , txt_transfer_miktar, txt_alanmusteri , txt_gonderenmusteri , txt_kartsirasi , txt_borc;
        JLabel lbl_gonderenhesap , lbl_alanhesap , lbl_miktar , lbl_alanmusteri , lbl_gonderenmusteri , lbl_kartsirasi , lbl_limit , lbl_borc;
        BankaPersoneli bp;
        int gonderen_musteri;
        int hesap_sira;
        public islemYap(BankaPersoneli bp , int gonderen_musteri , int hesap_sira)
        {
            super("Banka Islemleri");
            this.gonderen_musteri = gonderen_musteri;
            this.bp = bp;
            this.hesap_sira = hesap_sira;
            
            this.setBounds(300, 200, 600, 400);
            this.setVisible(true);
            this.setLayout(null);
            
            para_transferi = new JButton("Para Transferi");
            para_transferi.setBounds(50, 30, 200, 25);
            para_transferi.addActionListener(this);
            this.add(para_transferi);
            
            kredi_karti_borc_odeme = new JButton("Kart Borcu Odeme");
            kredi_karti_borc_odeme.setBounds(280, 30, 200, 25);
            kredi_karti_borc_odeme.addActionListener(this);
            this.add(kredi_karti_borc_odeme);
            
            txt_gonderen_hesap_sira = new JTextField();
            txt_alan_hesap_sira = new JTextField();
            txt_transfer_miktar = new JTextField();
            
            
            txt_gonderen_hesap_sira.setBounds(150, 100, 25, 25);
            this.add(txt_gonderen_hesap_sira);
            txt_alan_hesap_sira.setBounds(270, 100, 25, 25);
            this.add(txt_alan_hesap_sira);
            
            lbl_gonderenhesap = new JLabel("Gonderen hesap");
            lbl_gonderenhesap.setBounds(10, 100, 100, 25);
            this.add(lbl_gonderenhesap);
            lbl_alanhesap = new JLabel("Alan hesap");
            lbl_alanhesap.setBounds(180, 100, 100, 25);
            this.add(lbl_alanhesap);
            
            txt_transfer_miktar = new JTextField();
            txt_transfer_miktar.setBounds(380, 100, 75, 25);
            this.add(txt_transfer_miktar);
            
            lbl_miktar = new JLabel("Miktar");
            lbl_miktar.setBounds(310, 100, 70, 25);
            this.add(lbl_miktar);
            
            txt_gonderen_hesap_sira.setVisible(false);
            txt_alan_hesap_sira.setVisible(false);
            txt_transfer_miktar.setVisible(false);
            lbl_gonderenhesap.setVisible(false);
            lbl_alanhesap.setVisible(false);
            lbl_miktar.setVisible(false);
            
            transfer_yap = new JButton("Transfer Yap");
            transfer_yap.setBounds(50, 150, 150, 25);
            transfer_yap.addActionListener(this);
            transfer_yap.setVisible(false);
            this.add(transfer_yap);
            
            txt_gonderenmusteri = new JTextField();
            txt_gonderenmusteri.setBounds(220, 60, 25, 25);
            txt_gonderenmusteri.setVisible(false);
            this.add(txt_gonderenmusteri);
            txt_alanmusteri = new JTextField();
            txt_alanmusteri.setVisible(false);
            txt_alanmusteri.setBounds(465, 60, 25, 25);
            this.add(txt_alanmusteri);
            
            
            lbl_gonderenmusteri = new JLabel("gonderen musteri kayit sira");
            lbl_gonderenmusteri.setBounds(10, 60, 200, 25);
            lbl_gonderenmusteri.setVisible(false);
            this.add(lbl_gonderenmusteri);
            
            lbl_alanmusteri = new JLabel("alan musteri kayit sira");
            lbl_alanmusteri.setBounds(255, 60, 200, 25);
            lbl_alanmusteri.setVisible(false);
            this.add(lbl_alanmusteri);
            
            lbl_kartsirasi = new JLabel("Borclu kart sirasini giriniz : "  );
            lbl_kartsirasi.setBounds(300, 75, 200, 25);
            lbl_kartsirasi.setVisible(false);
            this.add(lbl_kartsirasi);
            
            
            txt_kartsirasi = new JTextField();
            txt_kartsirasi.setBounds(510, 75, 30, 25);
            txt_kartsirasi.setVisible(false);
            this.add(txt_kartsirasi);
            
            borc_ode = new JButton("Ode");
            borc_ode.setBounds(300, 180, 75, 25);
            borc_ode.addActionListener(this);
            borc_ode.setVisible(false);
            this.add(borc_ode);
            
            kart_getir = new JButton("kart getir");
            kart_getir.setBounds(300, 100, 110, 25);
            kart_getir.addActionListener(this);
            kart_getir.setVisible(false);
            this.add(kart_getir);
            
            lbl_borc = new JLabel("kart borcu : ");
            lbl_borc.setBounds(300,130,75,25);
            lbl_borc.setVisible(false);
            this.add(lbl_borc);
            
             txt_borc = new JTextField();
            txt_borc.setBounds(370,130,75,25);
            txt_borc.setVisible(false);
            txt_borc.setEditable(false);
            this.add(txt_borc);
            
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if(ae.getSource().equals(para_transferi))
            {
                // para transferi icin hangi musteriler arasında para transferi yapilacagi hangi hesaplar arasi transfer yapilacagi 
                //bilgilerinin girilmesi gerekmektedir. 
                txt_gonderen_hesap_sira.setVisible(true);
                txt_gonderen_hesap_sira.setText(String.valueOf(hesap_sira));
                txt_gonderen_hesap_sira.setEditable(false);
                txt_alan_hesap_sira.setVisible(true);
                txt_transfer_miktar.setVisible(true);
                lbl_gonderenhesap.setVisible(true);
                lbl_alanhesap.setVisible(true);
                lbl_miktar.setVisible(true);
                transfer_yap.setVisible(true);
                txt_gonderenmusteri.setVisible(true);
                txt_alanmusteri.setVisible(true);
                lbl_gonderenmusteri.setVisible(true);
                lbl_alanmusteri.setVisible(true);
                txt_gonderenmusteri.setText(String.valueOf(gonderen_musteri));
                txt_gonderenmusteri.setEditable(false);
                
            }
            else if(ae.getSource().equals(kredi_karti_borc_odeme))
            {
                lbl_kartsirasi.setVisible(true);
                txt_kartsirasi.setVisible(true);
                borc_ode.setVisible(true);
                kart_getir.setVisible(true);
               
            }
            else if(ae.getSource().equals(transfer_yap))
            {
                double miktar = Double.parseDouble(txt_transfer_miktar.getText());
                 
                
               musteri gonderen = bp.getMusteriler().get(Integer.parseInt(txt_gonderenmusteri.getText()));
               musteri alan = bp.getMusteriler().get(Integer.parseInt(txt_alanmusteri.getText()));
                
               VadesizHesap gonderenhesap = gonderen.getVadesizHesap(Integer.parseInt(txt_gonderen_hesap_sira.getText())); // sadece vadesiz hesaplar 
               //para transferi yapabildiginden gonderen hesabi VadesizHesap olarak aldim 
               
               // alan hesap hem vadesiz hesap hem de yatırım hesabı olabileceginden banka hesabı olarak aldım 
                BankaHesabi alanhesap = alan.getBankaHesabi(Integer.parseInt(txt_alan_hesap_sira.getText()));
                String alanHesapTur = alan.getHesapTuru(alanhesap, Integer.parseInt(txt_alan_hesap_sira.getText()));
               
                // gonderen hesabin para transferi methodunu kullanarak parametre hesapları ve miktar bilgisini girdim
                gonderen.getVadesizHesap(Integer.parseInt(txt_gonderen_hesap_sira.getText())).paraTransferi((BankaHesabi)gonderenhesap,(BankaHesabi) alanhesap, miktar);
                 
                           
              
               uyari u1 = new uyari("transfer yapilmistir");
               
            }
            else if(ae.getSource().equals(borc_ode))
            {
                
                int kart_sira = Integer.parseInt(txt_kartsirasi.getText());
                KrediKarti borclukart =  bp.getMusteriler().get(gonderen_musteri).getKrediKartlari().get(kart_sira);
                double borc = bp.getMusteriler().get(gonderen_musteri).getKrediKartlari().get(kart_sira).get_guncel_borc();
                bp.getMusteriler().get(gonderen_musteri).getVadesizHesap(hesap_sira).krediKartiBorcOdeme(borclukart, borc);
                uyari uy5 = new uyari("islem yapilmistir");
            }
            else if(ae.getSource().equals(kart_getir))
            {
                int kart_sira = Integer.parseInt(txt_kartsirasi.getText());
                double borc = bp.getMusteriler().get(gonderen_musteri).getKrediKartlari().get(kart_sira).get_guncel_borc();
                //lbl_borc.setText("kart borcu : " + String.valueOf(borc));
                lbl_borc.setVisible(true);
                txt_borc.setVisible(true);
                txt_borc.setText(String.valueOf(borc));
            }
            else 
                ;
            
        }
        
        
    }
    
    
   
    
    
    public static void main(String[] args) {
       
        musteri_ekle m1 = new musteri_ekle();
        
       
        /*
        
        //Bu kısımda gui tasarımında kullanmadıgım methodların denemesini yaptım
        
        musteri musteri1 = new musteri("berat" , "kuzu" ," mail" , 1 );
        musteri1.krediKartiEkle(50, 40);
        musteri1.hesapEkle("vadesiz", 755);
        System.out.println(musteri1.getBankaHesabi(0).getBakiye());
        musteri1.hesapEkle("vadesiz", 400);
        
        
        musteri1.hesapSil(0);
        System.out.println(musteri1.getBankaHesabi(0).getBakiye());
        musteri1.getVadesizHesap(0).paraTransferi(musteri1.getBankaHesabi(0), musteri1.getBankaHesabi(1), 755);
        musteri1.hesapSil(0);
        System.out.println(musteri1.getBankaHesabi(0).getBakiye());
        // System.out.println(musteri1.getVadesizHesap(1).getHesapTuru()); hesap silindiginden bu kod calısmadı 
       // cunku artık 1 indisli hesap kalmadı 1 indisli hesap artik 0 indisli hesap oldu.
        
        
        musteri1.krediKartiEkle(1000.0, 50);
        KrediKarti borclukart = musteri1.getKrediKartlari().get(1);   // burada kredi kartlarını almamız gerek 
        borclukart.toString();
        musteri1.getVadesizHesap(0).krediKartiBorcOdeme(borclukart, 40);
        borclukart.toString();
        musteri1.getVadesizHesap(0).krediKartiBorcOdeme(borclukart, 10);
        borclukart.toString();
        System.out.println(borclukart.get_guncel_borc());
        musteri1.krediKartiSil(0);
       
        */
      
    }
    
}
