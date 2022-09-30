package ro.mycode.Elemente;

import ro.mycode.Magazin.Vestimentatie.Vestimentatie;

public class Croitorie {

    private String culoare;

    public String afisare(){
        String text = "Produsul: ";
        return text;
    }

    public void pret (int pret){
        System.out.println("Pretul este: ");
    }

    public Vestimentatie duplicare (){

        return new Vestimentatie();
    }
}
