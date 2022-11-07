import java.util.ArrayList;

public class HesburgerBuilder {

    ArrayList<String> taytteet = new ArrayList<String>();

    public void setTaytteet(ArrayList<String> taytteet) {
        this.taytteet = taytteet;
    }

    public KerrosHampurilainen getBurger() {
        return new KerrosHampurilainen(taytteet);
    }
}
