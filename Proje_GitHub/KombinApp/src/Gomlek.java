import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Gomlek extends Ustluk {
    @Override
    public String altlikGetir(String renk){
        return okuRenkGetir(renk) + " Pantolon";
    }
}