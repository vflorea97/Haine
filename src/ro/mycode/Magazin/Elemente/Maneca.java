package ro.mycode.Magazin.Elemente;

import ro.mycode.Magazin.Elemente.MateriePrima;

public class Maneca extends Elemente {

    private Ata ata;
    private MateriePrima materiePrima;
    private String broderie;

    public Maneca (){
        this.ata = new Ata();
        this.materiePrima = new MateriePrima();
        this.broderie = "";
    }

    public Maneca(int lungime, Ata ata, MateriePrima materiePrima,String broderie) {
        super(lungime);
        this.ata = ata;
        this.materiePrima = materiePrima;
        this.broderie = broderie;
    }


    public Ata getAta() {
        return ata;
    }

    public void setAta(Ata ata) {
        this.ata = ata;
    }

    public MateriePrima getMateriePrima() {
        return materiePrima;
    }

    public void setMateriePrima(MateriePrima materiePrima) {
        this.materiePrima = materiePrima;
    }

    public String getBroderie() {
        return broderie;
    }

    public void setBroderie(String broderie) {
        this.broderie = broderie;
    }

    @Override
    public String afisare (){
        String text = "Maneca: \n";
        text += super.afisare();
        text += "-" + this.ata.afisare() + "\n";
        text += "-" + this.materiePrima.afisare() + "\n";
        text += "Broderie: " + this.broderie + "\n";
        return text;
    }
}
