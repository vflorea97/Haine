package ro.mycode.Magazin.Vestimentatie.Haina;

import ro.mycode.Magazin.Elemente.*;

public class Geaca extends Haina{

    private Ata ata1;
    private Ata ata2;
    private Maneca maneca;
    private Tors tors;
    private Gluga gluga;
    private Buzunar buzunar;

    public Geaca (){
     this.ata1 = new Ata();
     this.ata2 = new Ata();
     this.maneca = new Maneca();
     this.tors = new Tors();
     this.gluga = new Gluga();
     this.buzunar= new Buzunar();
    }

    public Geaca(String material, String gen, int pret, String culoare,
                 String marime, String tip, String sezon, Ata ata1, Ata ata2,
                 Maneca maneca, Tors tors, Gluga gluga, Buzunar buzunar) {
        super(material, gen, pret, culoare, marime, tip, sezon);
        this.ata1 = ata1;
        this.ata2 = ata2;
        this.maneca = maneca;
        this.tors = tors;
        this.gluga = gluga;
        this.buzunar = buzunar;
    }

    public Ata getAta1() {
        return ata1;
    }

    public void setAta1(Ata ata1) {
        this.ata1 = ata1;
    }

    public Ata getAta2() {
        return ata2;
    }

    public void setAta2(Ata ata2) {
        this.ata2 = ata2;
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

    public Gluga getGluga() {
        return gluga;
    }

    public void setGluga(Gluga gluga) {
        this.gluga = gluga;
    }

    public Buzunar getBuzunar() {
        return buzunar;
    }

    public void setBuzunar(Buzunar buzunar) {
        this.buzunar = buzunar;
    }

    @Override
    public String afisare(){
        String text = "Geaca: \n";
        text += super.afisare();
        text += this.ata1.afisare() + "\n";
        text += this.ata2.afisare() + "\n";
        text += this.maneca.afisare() + "\n";
        text += this.tors.afisare() + "\n";
        text += this.gluga.afisare() + "\n";
        text += this.buzunar.afisare() + "\n";
        return text;
    }
}
