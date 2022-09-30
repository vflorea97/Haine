package ro.mycode.Magazin.Elemente;

import ro.mycode.Magazin.Elemente.Elemente;

import java.util.ArrayList;

public class CreareElement {

    private ArrayList<Elemente> elemente;

    public CreareElement(ArrayList<Elemente> elemente){
        this.elemente = elemente;
    }

    public void addElement (Elemente elemente){
        this.elemente.add(elemente);
    }

    public void afisare (){
        for (int i = 0; i < elemente.size(); i++){
            System.out.println(elemente.get(i).afisare());
        }
    }
}
