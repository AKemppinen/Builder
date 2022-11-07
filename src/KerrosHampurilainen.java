import java.util.ArrayList;

public class KerrosHampurilainen {

    private boolean salaatti;
    private boolean pihvi;
    private boolean majoneesi;
    private boolean suolakurkku;
    private boolean juusto;


    public KerrosHampurilainen(boolean salaatti, boolean pihvi, boolean majoneesi, boolean suolakurkku, boolean juusto) {
        this.salaatti = salaatti;
        this.pihvi = pihvi;
        this.majoneesi = majoneesi;
        this.suolakurkku = suolakurkku;
        this.juusto = juusto;
    }

    public KerrosHampurilainen(ArrayList taytteet) {

        if (taytteet.contains("Salaatti")) {
            this.salaatti = true;
        }
        if (taytteet.contains("Majoneesi")) {
            this.majoneesi = true;
        }
        if (taytteet.contains("Suolakurkku")) {
            this.suolakurkku = true;
        }
        if (taytteet.contains("Juusto")) {
            this.juusto = true;
        }
        if (taytteet.contains("Pihvi")) {
            this.pihvi = true;
        }
    }

    @Override
    public String toString() {
        return "KerrosHampurilainen{" +
                "salaatti=" + salaatti +
                ", pihvi=" + pihvi +
                ", majoneesi=" + majoneesi +
                ", suolakurkku=" + suolakurkku +
                ", juusto=" + juusto +
                '}';
    }
}
