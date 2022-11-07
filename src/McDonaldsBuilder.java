
public class McDonaldsBuilder {

    private boolean salaatti;
    private boolean pihvi;
    private boolean majoneesi;
    private boolean suolakurkku;
    private boolean juusto;

    public void salaatti(boolean salaatti) {
        this.salaatti = salaatti;
    }

    public void pihvi(boolean pihvi) {
        this.pihvi = pihvi;
    }

    public void majoneesi(boolean majoneesi) {
        this.majoneesi = majoneesi;
    }

    public void suolakurkku(boolean suolakurkku) {
        this.suolakurkku = suolakurkku;
    }

    public void juusto(boolean juusto) {
        this.juusto = juusto;
    }

    public KerrosHampurilainen getBurger() {
        return new KerrosHampurilainen(salaatti, pihvi, majoneesi, suolakurkku, juusto);
    }
}
