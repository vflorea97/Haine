package ro.mycode.Magazin.Elemente;

public class Tors extends Elemente {

    private Ata ata1;
    private Ata ata2;
    private MateriePrima materiePrima;


    public Tors(){
        this.ata1 = new Ata();
        this.ata2 = new Ata();
        this.materiePrima = new MateriePrima();
    }

    public Tors(int lungime, Ata ata1, Ata ata2, MateriePrima materiePrima){
        super(lungime);
        this.ata1 = ata1;
        this.ata2 = ata2;
        this.materiePrima = materiePrima;
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

    public MateriePrima getMateriePrima() {
        return materiePrima;
    }

    public void setMateriePrima(MateriePrima materiePrima) {
        this.materiePrima = materiePrima;
    }

    @Override
    public String afisare (){
        String text = "Tors: \n";
        text += super.afisare();
        text += "-" + this.ata1.afisare() + "\n";
        text += "-" + this.ata2.afisare() + "\n";
        text += "-" + this.materiePrima.afisare() + "\n";
        return text;
    }
}
