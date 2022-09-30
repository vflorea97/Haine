package ro.mycode.Magazin.Vestimentatie.Haina;

import ro.mycode.Magazin.Vestimentatie.Vestimentatie;

public class Haina extends Vestimentatie {

    private String marime;
    private String tip;
    private String sezon;

    public Haina (){
        this.marime = "";
        this.tip = "";
        this.sezon = "";
    }

    public Haina(String material, String gen, int pret, String culoare, String marime, String tip, String sezon) {
        super(material, gen, pret, culoare);
        this.marime = marime;
        this.tip = tip;
        this.sezon = sezon;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getSezon() {
        return sezon;
    }

    public void setSezon(String sezon) {
        this.sezon = sezon;
    }

    @Override
    public String afisare(){
        String text = "";
        text += super.afisare();
        text += "Marime: " + this.marime + "\n";
        text += "Tip: " + this.tip + "\n";
        text += "Sezon: " + this.sezon + "\n";
        return text;
    }
}
