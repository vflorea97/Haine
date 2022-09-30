package ro.mycode.Magazin.Elemente;

import ro.mycode.Elemente.Croitorie;

public class Elemente extends Croitorie {

    private int lungime;

    public Elemente (){
        this.lungime = 0;
    }

    public Elemente(int lungime) {
        this.lungime = lungime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    @Override
    public String afisare (){
        String text = "";
        text += "Lungime: " + this.lungime + " cm\n";
        return text;
    }
}
