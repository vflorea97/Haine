package ro.mycode.Magazin.Elemente;

public class Ata extends Elemente {

    private int grosime;
    private String culoare;

    public Ata (){
        this.grosime = 0;
        this.culoare = "";
    }
    public Ata (int grosime, String culoare){
        this.grosime = grosime;
        this.culoare = culoare;
    }

    public int getGrosime() {
        return grosime;
    }

    public void setGrosime(int grosime) {
        this.grosime = grosime;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String afisare (){
        String text = "Ata: \n";
        text += "Grosime: " + this.grosime + " mm \n";
        text += "Culoare: " + this.culoare + "\n";
        return text;
    }
}
