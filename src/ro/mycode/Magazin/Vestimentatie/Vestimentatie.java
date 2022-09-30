package ro.mycode.Magazin.Vestimentatie;

import ro.mycode.Elemente.Croitorie;

public class Vestimentatie extends Croitorie {

    private String material;
    private String gen;
    private int pret;
    private String culoare;

    public Vestimentatie (){
        this.material = "";
        this.gen = "";
        this.pret = 0;
        this.culoare = "";
    }

    public Vestimentatie(String material, String gen, int pret, String culoare) {
        this.material = material;
        this.gen = gen;
        this.pret = pret;
        this.culoare = culoare;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String afisare(){
        String text = "";
        text += "Material: " + this.material + "\n";
        text += "Gen: " + this.gen + "\n";
        text += "Pret: " + this.pret + "\n";
        text += "Culoare: " + this.culoare + "\n";
        return text;
    }
}
