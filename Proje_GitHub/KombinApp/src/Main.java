import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        Pantolon pantolon = new Pantolon();
        Esofman esofman = new Esofman();
        Tshirt tshirt = new Tshirt();
        Sweat sweat = new Sweat();
        Gomlek gomlek = new Gomlek();
        CasualAyakkabi casualAyakkabi = new CasualAyakkabi();
        SporAyakkabi sporAyakkabi = new SporAyakkabi();//Nesnelerim burada

        JFrame jframe = new JFrame("Kombin Application");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(700, 400);//Jframe Burada

        //Anamenu tasarım start
        JPanel anamenu = new JPanel();
        anamenu.setSize(700, 400);
        JLabel lblKiyafet, lblrenk;

        lblrenk = new JLabel("Renk Seçiniz");
        lblrenk.setBounds(180, 68, 150, 30);
        lblrenk.setFont(new Font("Calibri", Font.BOLD, 16));

        lblKiyafet = new JLabel("Ürünün Türünü Girin");
        lblKiyafet.setBounds(180, 36, 150, 30);
        lblKiyafet.setFont(new Font("Calibri", Font.BOLD, 16));

        String[] kiyafetler = {"Sweat", "Tshirt", "Gömlek", "Pantolon", "Eşofman", "Casual Ayakkabı", "Spor Ayakkabı",};//kullanıcıdan seçmesini istediğimiz
        JComboBox cboxKiyafet = new JComboBox(kiyafetler);                                                              //türleri hazırladık
        cboxKiyafet.setBounds(340, 40, 150, 20);

        String[] renkler = {"Beyaz", "Siyah", "Lacivert", "Haki", "Kahverengi", "Mavi", "Gri", "Bordo","Krem","Hardal"}; //Kullanıcadan Seçmesini istediğimiz
        JComboBox cboxRenk = new JComboBox(renkler);                                                      //renk seçeneklerini hazırladık
        cboxRenk.setBounds(340, 70, 150, 20);

        JButton kombinGetirBtn = new JButton("Kombin Getir");
        kombinGetirBtn.setBounds(360, 200, 150, 30);

        JButton rastgeleGetirBtn = new JButton("Kendimi şanslı hissediyorum");
        rastgeleGetirBtn.setBounds(150, 200, 200, 30);

        JButton kayitliKombinlerBtn = new JButton("Kayıtlı kombinler");
        kayitliKombinlerBtn.setBounds(150, 240, 200, 30);

        JButton cikis = new JButton("Çıkış");
        cikis.setBounds(360, 240, 150, 30);


        anamenu.setLayout(null);
        anamenu.add(lblKiyafet);
        anamenu.add(cboxKiyafet);
        anamenu.add(lblrenk);
        anamenu.add(cboxRenk);
        anamenu.add(kombinGetirBtn);
        anamenu.add(rastgeleGetirBtn);
        anamenu.add(kayitliKombinlerBtn);
        anamenu.add(cikis);
        //Anamenu Tasarımı End

        //Kombin Sayfası Tasarımı Başlangıç
        JPanel kombinPage = new JPanel();
        kombinPage.setLayout(null);
        kombinPage.setSize(700, 400);

        JLabel gelenGiyim, gelenRenk, urun1, urun2, urun3, rastUrun1, rastUrun2, rastUrun3, rastGelenRenk, rastGelenGiyim;

        gelenGiyim = new JLabel();
        gelenGiyim.setBounds(350,50,170,30);
        gelenGiyim.setFont(new Font("Calibri", Font.BOLD, 20));

        gelenRenk = new JLabel();
        gelenRenk.setBounds(250,50,100,30);
        gelenRenk.setFont(new Font("Calibri", Font.BOLD, 20));

        urun1 = new JLabel();
        urun1.setBounds(250,90,300,30);
        urun1.setFont(new Font("Calibri", Font.BOLD, 20));

        urun2 = new JLabel();
        urun2.setBounds(250,130,300,30);
        urun2.setFont(new Font("Calibri", Font.BOLD, 20));

        urun3 = new JLabel();
        urun3.setBounds(250,170,300,30);
        urun3.setFont(new Font("Calibri", Font.BOLD, 20));

        JButton yenile,aSayfaGet,kaydetmeEkrani;
        yenile = new JButton("Yenile");
        yenile.setBounds(30,250,200,30);

        aSayfaGet = new JButton("Anasayfaya Dön");
        aSayfaGet.setBounds(240,250,200,30);

        kaydetmeEkrani = new JButton("Kombini  kaydet");
        kaydetmeEkrani.setBounds(450,250,200,30);

        kombinPage.add(aSayfaGet);
        kombinPage.add(yenile);
        kombinPage.add(kaydetmeEkrani);

        kombinPage.add(urun1);
        kombinPage.add(gelenRenk);
        kombinPage.add(gelenGiyim);
        kombinPage.add(urun2);
        kombinPage.add(urun3);

        kombinPage.setVisible(false);
        // Kombin sayfası Tasarımı Bitiş


        //Kombin sayfası tasarımı 2
        JPanel kombinPage2 = new JPanel();
        kombinPage2.setLayout(null);
        kombinPage2.setSize(700,400);

        rastGelenGiyim = new JLabel();
        rastGelenGiyim.setBounds(350,50,170,30);
        rastGelenGiyim.setFont(new Font("Calibri", Font.BOLD, 20));

        rastGelenRenk = new JLabel();
        rastGelenRenk.setBounds(250,50,100,30);
        rastGelenRenk.setFont(new Font("Calibri", Font.BOLD, 20));

        rastUrun1 = new JLabel();
        rastUrun1.setBounds(250,90,300,30);
        rastUrun1.setFont(new Font("Calibri", Font.BOLD, 20));

        rastUrun2 = new JLabel();
        rastUrun2.setBounds(250,130,300,30);
        rastUrun2.setFont(new Font("Calibri", Font.BOLD, 20));

        rastUrun3 = new JLabel();
        rastUrun3.setBounds(250,170,300,30);
        rastUrun3.setFont(new Font("Calibri", Font.BOLD, 20));

        JButton yenile2,aSayfaGet2,kaydetmeEkrani2;
        yenile2 = new JButton("Yenile");
        yenile2.setBounds(30,250,200,30);

        aSayfaGet2 = new JButton("Anasayfaya Dön");
        aSayfaGet2.setBounds(240,250,200,30);

        kaydetmeEkrani2 = new JButton("Kombini  kaydet");
        kaydetmeEkrani2.setBounds(450,250,200,30);

        kombinPage2.add(aSayfaGet2);
        kombinPage2.add(yenile2);
        kombinPage2.add(kaydetmeEkrani2);

        kombinPage2.add(rastGelenRenk);
        kombinPage2.add(rastGelenGiyim);
        kombinPage2.add(rastUrun1);
        kombinPage2.add(rastUrun2);
        kombinPage2.add(rastUrun3);

        kombinPage2.setVisible(false);
        //Kombin sayfası tasarımı 2 bitiş

        //Kayıtlı kombinler sayfası başlangıç

        JPanel kombinPage3 = new JPanel();
        kombinPage3.setLayout(null);
        kombinPage3.setSize(700, 400);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(100, 100, 150, 30);


        JLabel kayitliKombin;
        kayitliKombin = new JLabel();
        kayitliKombin.setBounds(100, 50, 500, 30);

        JButton aSayfaGet3, sil;

        aSayfaGet3 = new JButton("Ana sayfa");
        aSayfaGet3.setBounds(100,270,100,30);

        sil = new JButton("Sil");
        sil.setBounds(500,270,100,30);

        kombinPage3.add(kayitliKombin);
        kombinPage3.add(comboBox);
        kombinPage3.add(aSayfaGet3);
        kombinPage3.add(sil);
        kombinPage3.setVisible(false);

        //Kayıtlı kombinler sayfası bitiş


        //Kombin kaydetme sayfalari başlangıç

        JPanel kombinIsmi = new JPanel();
        kombinIsmi.setLayout(null);
        kombinIsmi.setSize(700, 400);
        kombinIsmi.setVisible(false);

        JLabel label1 = new JLabel();
        label1.setText("Kombininize isim verin");
        label1.setBounds(270,100,200,30);

        JButton kaydet1 = new JButton("Kombini kaydet");
        kaydet1.setBounds(270,200,150,30);

        JButton iptal = new JButton("İptal");
        iptal.setBounds(270,250,150,30);

        JTextField textField1 = new JTextField();
        textField1.setBounds(270,150,150,25);

        kombinIsmi.add(iptal);
        kombinIsmi.add(textField1);
        kombinIsmi.add(label1);
        kombinIsmi.add(kaydet1);


        JPanel kombinIsmi2 = new JPanel();
        kombinIsmi2.setLayout(null);
        kombinIsmi2.setSize(700, 400);
        kombinIsmi2.setVisible(false);

        JLabel label2 = new JLabel();
        label2.setText("Kombininize isim verin");
        label2.setBounds(270,100,200,30);

        JButton kaydet2 = new JButton("Kombini kaydet");
        kaydet2.setBounds(270,200,150,30);

        JButton iptal2 = new JButton("İptal");
        iptal2.setBounds(270,250,150,30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(270,150,150,25);

        kombinIsmi2.add(iptal2);
        kombinIsmi2.add(textField2);
        kombinIsmi2.add(label2);
        kombinIsmi2.add(kaydet2);

        //Kombin kaydetme sayfalari bitiş

        aSayfaGet.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                anamenu.setVisible(true);
                kombinPage.setVisible(false);
            }
        }); //Anasayfaya geri dönme metodunun işlev kazandığı bölüm

        kombinGetirBtn.addActionListener(new ActionListener() {//Bu metod kullanıcı butona bastığı zaman kullanıcın girdiği veriler kullanılarak oluşturduğumuz
            @Override                                 // nesneler kullanılarak uygun kombinler üretilir.
            public void actionPerformed(ActionEvent e) {
                String renk = (String)cboxRenk.getSelectedItem();
                String giyim = (String) cboxKiyafet.getSelectedItem();
                urun3.setText( pantolon.aksesuarGetir());
                if(giyim == "Pantolon"){
                    urun1.setText( pantolon.ustlukGetir(renk) );
                    urun2.setText( pantolon.AyakkabiGetir(renk) );
                    gelenRenk.setText(renk);
                    gelenGiyim.setText(giyim);
                }

                else if (giyim == "Eşofman") {
                    gelenRenk.setText(renk);
                    gelenGiyim.setText(giyim);
                    urun1.setText(esofman.ustlukGetir(renk));
                    urun2.setText(esofman.AyakkabiGetir(renk));
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    gelenRenk.setText(renk);
                    gelenGiyim.setText(giyim);
                    String altlik = sweat.altlikGetir(renk);
                    urun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");

                    if(sayi<0)
                        urun2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        urun2.setText(esofman.AyakkabiGetir(renk));
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    gelenRenk.setText(renk);
                    gelenGiyim.setText(giyim);
                    String altlik = tshirt.altlikGetir(renk);
                    urun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        urun2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        urun2.setText( esofman.AyakkabiGetir(renk) );
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    gelenRenk.setText(renk);
                    gelenGiyim.setText(giyim);
                    urun1.setText( gomlek.altlikGetir(renk) );
                    urun2.setText( gomlek.ayakkabiGetir(renk) );
                }  // Gömlek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    gelenRenk.setText(renk );
                    gelenGiyim.setText( giyim );
                    urun2.setText( casualAyakkabi.altlikGetir(renk) );
                    urun1.setText( casualAyakkabi.ustlukGetir(renk));
                } // Casual Ayakkabı seçilirse
                else{
                    gelenRenk.setText(renk );
                    gelenGiyim.setText( giyim);
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    urun2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        urun1.setText(pantolon.ustlukGetir(renk));
                    else
                        urun1.setText(esofman.ustlukGetir(renk));
                }//Spor ayakkabı seçilirse
                anamenu.setVisible(false);
                kombinPage.setVisible(true);
            }
        });
        yenile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String renk = gelenRenk.getText();
                String giyim = gelenGiyim.getText();
                urun3.setText( pantolon.aksesuarGetir());
                if(giyim == "Pantolon"){
                    urun1.setText( pantolon.ustlukGetir(renk) );
                    urun2.setText( pantolon.AyakkabiGetir(renk) );
                }
                else if (giyim == "Eşofman") {
                    urun1.setText(esofman.ustlukGetir(renk));
                    urun2.setText(esofman.AyakkabiGetir(renk));
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    String altlik = sweat.altlikGetir(renk);
                    urun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        urun2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        urun2.setText(esofman.AyakkabiGetir(renk));
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    String altlik = tshirt.altlikGetir(renk);
                    urun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        urun2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        urun2.setText( esofman.AyakkabiGetir(renk) );
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    urun1.setText( gomlek.altlikGetir(renk) );
                    urun2.setText( gomlek.ayakkabiGetir(renk) );
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    urun2.setText( casualAyakkabi.altlikGetir(renk) );
                    urun1.setText( casualAyakkabi.ustlukGetir(renk));
                } // Casual Ayakkabı seçilirse
                else{
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    urun2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                       urun1.setText(pantolon.ustlukGetir(renk));
                    else
                        urun1.setText(esofman.ustlukGetir(renk));
                }//Spor ayakkabı seçilirse
            }
        });

        rastgeleGetirBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String renk = rastGelenRenk.getText();
                String giyim = rastGelenGiyim.getText();
                int random = r.nextInt(7);
                int random2 = r.nextInt(10);
                rastUrun3.setText( pantolon.aksesuarGetir());
                String[] renks = {"Beyaz","Siyah","Lacivert","Haki","Kahverengi","Mavi","Gri","Bordo","Krem","Hardal"};
                String[] giyims = {"Sweat","Tshirt","Gömlek","Pantolon","Eşofman","Casual Ayakkabı","Spor Ayakkabı"};
                renk = renks[random2];
                giyim = giyims[random];

                if(giyim == "Pantolon"){
                    rastUrun1.setText( pantolon.ustlukGetir(renk) );
                    rastUrun2.setText( pantolon.AyakkabiGetir(renk) );
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }
                else if (giyim == "Eşofman") {
                    rastUrun1.setText(esofman.ustlukGetir(renk));
                    rastUrun2.setText(esofman.AyakkabiGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    String altlik = sweat.altlikGetir(renk);
                    rastUrun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        rastUrun2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        rastUrun2.setText(esofman.AyakkabiGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    String altlik = tshirt.altlikGetir(renk);
                    rastUrun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        rastUrun2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        rastUrun2.setText( esofman.AyakkabiGetir(renk) );
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    rastUrun1.setText( gomlek.altlikGetir(renk) );
                    rastUrun2.setText( gomlek.ayakkabiGetir(renk) );
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    rastUrun2.setText( casualAyakkabi.altlikGetir(renk) );
                    rastUrun1.setText( casualAyakkabi.ustlukGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                } // Casual Ayakkabı seçilirse
                else{
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    rastUrun2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        rastUrun1.setText(pantolon.ustlukGetir(renk));
                    else
                        rastUrun1.setText(esofman.ustlukGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }//Spor ayakkabı seçilirse

                anamenu.setVisible(false);
                kombinPage2.setVisible(true);

            }

});
        yenile2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String renk = rastGelenRenk.getText();
                String giyim = rastGelenGiyim.getText();
                int random = r.nextInt(7);
                int random2 = r.nextInt(10);
                rastUrun3.setText( pantolon.aksesuarGetir());
                String[] renks = {"Beyaz","Siyah","Lacivert","Haki","Kahverengi","Mavi","Gri","Bordo","Krem","Hardal"};
                String[] giyims = {"Sweat","Tshirt","Gömlek","Pantolon","Eşofman","Casual Ayakkabı","Spor Ayakkabı"};
                renk = renks[random2];
                giyim = giyims[random];
                if(giyim == "Pantolon"){
                    rastUrun1.setText( pantolon.ustlukGetir(renk) );
                    rastUrun2.setText( pantolon.AyakkabiGetir(renk) );
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }
                else if (giyim == "Eşofman") {
                    rastUrun1.setText(esofman.ustlukGetir(renk));
                    rastUrun2.setText(esofman.AyakkabiGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                } //Esofman Seçilirse

                else if (giyim == "Sweat") {
                    String altlik = sweat.altlikGetir(renk);
                    rastUrun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        rastUrun2.setText(pantolon.AyakkabiGetir(renk));
                    else
                        rastUrun2.setText(esofman.AyakkabiGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                } // Sweat Seçilirse

                else if (giyim == "Tshirt"){
                    String altlik = tshirt.altlikGetir(renk);
                    rastUrun1.setText(altlik);
                    int sayi = altlik.indexOf("Esofman");
                    if(sayi<0)
                        rastUrun2.setText( pantolon.AyakkabiGetir(renk) );
                    else
                        rastUrun2.setText( esofman.AyakkabiGetir(renk) );
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }// Tshirt Seçilirse

                else if (giyim == "Gömlek") {
                    rastUrun1.setText( gomlek.altlikGetir(renk) );
                    rastUrun2.setText( gomlek.ayakkabiGetir(renk) );
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }  // Gömelek Seçilirse

                else if (giyim == "Casual Ayakkabı") {
                    rastUrun2.setText( casualAyakkabi.altlikGetir(renk) );
                    rastUrun1.setText( casualAyakkabi.ustlukGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                } // Casual Ayakkabı seçilirse
                else{
                    String altgiy = sporAyakkabi.altlikGetir(renk);
                    rastUrun2.setText( altgiy );
                    int say = altgiy.indexOf("Eşofman");
                    if (say<0)
                        rastUrun1.setText(pantolon.ustlukGetir(renk));
                    else
                        rastUrun1.setText(esofman.ustlukGetir(renk));
                    rastGelenRenk.setText(renk);
                    rastGelenGiyim.setText(giyim);
                }//Spor ayakkabı seçilirse
            }
        });

        aSayfaGet2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                anamenu.setVisible(true);
                kombinPage2.setVisible(false);
            }});

        kaydetmeEkrani.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                kombinPage.setVisible(false);
                kombinIsmi.setVisible(true);
            }
        });

        kaydet1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("kombinler.txt");

                if (!file.exists()) {    //Dosya yoksa
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

                try {
                    FileWriter fileWriter = new FileWriter(file,true);

                    fileWriter.write("("+textField1.getText()+")\n"+gelenRenk.getText()+" "+gelenGiyim.getText()+" - "+urun1.getText()+" - "+urun2.getText()+" - "+urun3.getText()+"\n");
                    fileWriter.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textField1.setText("");
                kombinPage.setVisible(true);
                kombinIsmi.setVisible(false);
            }
        });

        kaydet2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("kombinler.txt");

                if (!file.exists()) {    //Dosya yoksa
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                try {
                    FileWriter fileWriter = new FileWriter(file,true);

                    fileWriter.write("("+textField2.getText()+")\n"+rastGelenRenk.getText()+" "+rastGelenGiyim.getText()+" - "+rastUrun1.getText()+" - "+rastUrun2.getText()+" - "+rastUrun3.getText()+"\n");
                    fileWriter.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                textField2.setText("");
                kombinPage2.setVisible(true);
                kombinIsmi2.setVisible(false);
            }
        });

        kaydetmeEkrani2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                kombinPage2.setVisible(false);
                kombinIsmi2.setVisible(true);
            }
        });

        kayitliKombinlerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                anamenu.setVisible(false);
                kombinPage3.setVisible(true);
                File file = new File("kombinler.txt");

                int lineNumber = 0;
                try
                {
                    BufferedReader reader = null;
                    reader = new BufferedReader(new FileReader(file));
                    String satir = reader.readLine();
                    while (satir!=null) {
                        if(satir.length()>0){
                            lineNumber++;
                        }
                        satir = reader.readLine();
                    }
                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    comboBox.removeAllItems();
                    for(int i=1;i<lineNumber;i++){
                        if ((i%2) != 0){
                            comboBox.addItem(bufferedReader.readLine());
                        }

                        else
                            bufferedReader.readLine();
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        iptal.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                textField1.setText("");
                kombinPage.setVisible(true);
                kombinIsmi.setVisible(false);
            }});

        iptal2.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                textField2.setText("");
                kombinPage2.setVisible(true);
                kombinIsmi2.setVisible(false);

            }});

        aSayfaGet3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kombinPage3.setVisible(false);
                anamenu.setVisible(true);
            }
        });

        comboBox.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {

                File file = new File("kombinler.txt");

                int lineNumber = 0;
                try
                {
                    BufferedReader reader = null;
                    reader = new BufferedReader(new FileReader(file));
                    String satir = reader.readLine();
                    while (satir!=null) {
                        if(satir.length()>0){
                            lineNumber++;
                        }
                        satir = reader.readLine();
                    }
                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    for(int i=0;i<lineNumber;i++){
                        String value = bufferedReader.readLine();
                        if(value.equals(comboBox.getSelectedItem())){
                            kayitliKombin.setText(bufferedReader.readLine());
                            break;
                        }
                    }


                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }

        });
        sil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("kombinler.txt");
                int lineNumber = 0;
                try
                {
                    BufferedReader reader = null;
                    reader = new BufferedReader(new FileReader(file));
                    String satir = reader.readLine();
                    while (satir!=null) {
                        if(satir.length()>0){
                            lineNumber++;
                        }
                        satir = reader.readLine();
                    }
                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                try {
                    ArrayList<String> arrayList = new ArrayList<>(lineNumber);
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    for(int i=0;i<lineNumber;i++){
                        arrayList.add(reader.readLine());
                    }
                    for(int k=0;k<lineNumber-2;k++){
                        if(comboBox.getSelectedItem().equals(arrayList.get(k))){
                                arrayList.remove(k);
                                arrayList.remove((k));
                                break;
                        }
                    }
                    comboBox.removeAllItems();
                    for(int i=0;i<lineNumber-2;i++){
                        if ((i%2) == 0 && comboBox.getItemCount() != (lineNumber-2)/2){
                            comboBox.addItem(arrayList.get(i));
                        }
                    }

                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    for (int t=0;t<lineNumber-2;t++){
                        bufferedWriter.write(String.valueOf(arrayList.get(t))+"\n");
                    }
                    bufferedWriter.close();

                    if (comboBox.getSelectedItem() == null)
                        kayitliKombin.setText("");

                }catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        cikis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jframe.setBounds(360,200,700,400);
        jframe.add(kombinIsmi);
        jframe.add(kombinIsmi2);
        jframe.add(kombinPage);
        jframe.add(kombinPage2);
        jframe.add(kombinPage3);
        jframe.add(anamenu);
        jframe.setVisible(true);
    }
}

