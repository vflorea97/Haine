package ro.mycode.Magazin.Elemente;

public class MateriePrima extends Elemente{

    public String provenienta;
    public int cantitate;
    public String denumire;

    public MateriePrima (){
        this.provenienta = "";
        this.cantitate = 0;
        this.denumire = "";
    }

    public MateriePrima (String provenienta, int cantitate, String denumire){
        this.provenienta = provenienta;
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    public String getProvenienta() {
        return provenienta;
    }

    public void setProvenienta(String provenienta) {
        this.provenienta = provenienta;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String afisare (){
        String text = "Materie prima:\n";
        text += "Provenieneta: " + this.provenienta + "\n";
        text += "Cantitate: " + this.cantitate + " g \n";
        text += "Denumire: " + this.denumire + "\n";
        return text;
    }
}
