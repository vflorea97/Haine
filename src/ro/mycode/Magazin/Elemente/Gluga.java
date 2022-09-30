package ro.mycode.Magazin.Elemente;

public class Gluga extends Elemente{

    private String puf;
    private Ata ata;
    private MateriePrima materiePrima;

    public Gluga(String puf, Ata ata, MateriePrima materiePrima) {
        this.puf = puf;
        this.ata = ata;
        this.materiePrima = materiePrima;
    }

    public Gluga (){
        this.puf = "";
        this.ata = new Ata();
        this.materiePrima = new MateriePrima();
    }

    public String getPuf() {
        return puf;
    }

    public void setPuf(String puf) {
        this.puf = puf;
    }

    @Override
    public String afisare (){
        String text = "";
        text += this.ata.afisare() + "\n";
        text +=this.materiePrima.afisare() + "\n";
        text += "Puf: " + this.puf + "\n";
        return text;
    }

}
