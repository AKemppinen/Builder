import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        McDonaldsBuilder builder = new McDonaldsBuilder();
        builder.juusto(true);
        builder.pihvi(true);
        builder.salaatti(true);
        builder.majoneesi(true);
        builder.suolakurkku(true);


        ArrayList<String> taytteet = new ArrayList<String>();
        taytteet.add("Salaatti");
        taytteet.add("Pihvi");
        taytteet.add("Majoneesi");
        taytteet.add("Suolakurkku");
        taytteet.add("Juusto");
        HesburgerBuilder builder2 = new HesburgerBuilder();
        builder2.setTaytteet(taytteet);

        KerrosHampurilainen mcDonaldsBurger = builder.getBurger();
        KerrosHampurilainen hesburgerBurger = builder2.getBurger();

        System.out.println(mcDonaldsBurger);
        System.out.println(hesburgerBurger);

    }

}