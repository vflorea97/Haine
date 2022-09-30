package ro.mycode.Magazin.Elemente;

public class Buzunar extends Elemente {

    private Ata ata;
    private MateriePrima materiePrima;
    private String inchidere;
    private int numar;

    public Buzunar (){
        this.ata = new Ata();
        this.materiePrima = new MateriePrima();
        this.inchidere = "";
        this.numar = 0;
    }

    public Buzunar(Ata ata, MateriePrima materiePrima, String inchidere, int numar) {
        this.ata = ata;
        this.materiePrima = materiePrima;
        this.inchidere = inchidere;
        this.numar = numar;
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

    public String getInchidere() {
        return inchidere;
    }

    public void setInchidere(String inchidere) {
        this.inchidere = inchidere;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String afisare (){
        String text = "Buzunar: \n";
        text += "-" + this.ata.afisare() + "\n";
        text += "-" + this.materiePrima.afisare();
        text += "Inchidere: " + this.inchidere + "\n";
        text += "Numar: " + this.numar + "\n";
        return text;
    }

}
