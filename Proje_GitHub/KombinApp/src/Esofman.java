public class Esofman extends Giyim implements Altlik{
    @Override
    public String ustlukGetir(String renk){
        String[] ustlukler = {"Sweat","Tshirt"};
        int randomSayi = (int)(Math.random()*2);
        return okuRenkGetir(renk) +" "+ ustlukler[randomSayi];
    }
    @Override
    public String AyakkabiGetir(String renk){
        return okuRenkGetir(renk) + " Spor Ayakkabı";
    }

}
