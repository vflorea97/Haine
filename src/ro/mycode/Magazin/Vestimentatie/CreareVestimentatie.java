package ro.mycode.Magazin.Vestimentatie;

import ro.mycode.Magazin.Elemente.Elemente;

import java.util.ArrayList;

public class CreareVestimentatie {
    
    private ArrayList<Vestimentatie> vestimentatie;

    public CreareVestimentatie(ArrayList<Vestimentatie> vestimentatie){
        this.vestimentatie = vestimentatie;
    }

    public void addVestimentatie (Vestimentatie vestimentatie){
        this.vestimentatie.add(vestimentatie);
    }

    public void afisare (){
        for (int i = 0; i < vestimentatie.size(); i++){
            System.out.println(vestimentatie.get(i).afisare());
        }
    }
}
