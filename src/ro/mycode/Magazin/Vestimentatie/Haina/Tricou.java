package ro.mycode.Magazin.Vestimentatie.Haina;

import ro.mycode.Magazin.Elemente.Maneca;
import ro.mycode.Magazin.Elemente.Tors;

public class Tricou extends Haina {

    private Maneca maneca;
    private Tors tors;

    public Tricou (){
        this.maneca = new Maneca();
        this.tors = new Tors();
    }

    public Tricou(String material, String gen, int pret, String culoare, String marime, String tip, String sezon, Maneca maneca, Tors tors) {
        super(material, gen, pret, culoare, marime, tip, sezon);
        this.maneca = maneca;
        this.tors = tors;
    }

    public Maneca getManeca() {
        return maneca;
    }

    public void setManeca(Maneca maneca) {
        this.maneca = maneca;
    }

    public Tors getTors() {
        return tors;
    }

    public void setTors(Tors tors) {
        this.tors = tors;
    }

    @Override
    public String afisare (){
        String text = "Tricou: \n";
        text += super.afisare();
        text += this.maneca.afisare() + "\n";
        text += this.tors.afisare() + "\n";
        return text;
    }
}
