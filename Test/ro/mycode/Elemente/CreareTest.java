package ro.mycode.Elemente;

import org.junit.jupiter.api.Test;
import ro.mycode.Magazin.Elemente.*;
import ro.mycode.Magazin.Vestimentatie.CreareVestimentatie;
import ro.mycode.Magazin.Vestimentatie.Haina.Geaca;
import ro.mycode.Magazin.Vestimentatie.Haina.Tricou;
import ro.mycode.Magazin.Vestimentatie.Vestimentatie;

import java.util.ArrayList;

class CreareTest {

    @Test
    void afisare() {

        Ata ata = new Ata(5,"Verde");
        MateriePrima materiePrima = new MateriePrima("Romania",2800,"Sintetic");
        Buzunar buzunar = new Buzunar(new Ata(3,"Negru"),new MateriePrima("Germania",200,"Sintetic"),"Fermoar",1);
        Maneca maneca = new Maneca(50,new Ata(5,"Negru"),new MateriePrima("China",200,"Sintetic"),"Simpla");
        Tors tors = new Tors(75,new Ata(5,"Negru"),new Ata(5,"Rosu"),new MateriePrima("Peru",800,"Sintetic"));
        Gluga gluga = new Gluga("Puf sintetic",ata,materiePrima);
        Tricou tricou = new Tricou(tors.getMateriePrima().denumire,"Masculin",80,"Verde","M","Masculin","Vara",maneca,tors);
        Geaca geaca = new Geaca(tors.getMateriePrima().denumire,"Feminin",550,"Crem","S","Geaca","Toamna-Iarna",ata,ata,maneca,tors,gluga,buzunar);

        ArrayList<Elemente> elementes = new ArrayList<>();
        elementes.add(buzunar);
        elementes.add(maneca);
        elementes.add(tors);

        ArrayList<Vestimentatie> vestimentatie = new ArrayList<>();
        vestimentatie.add(tricou);
        vestimentatie.add(geaca);

        CreareElement creareElement = new CreareElement(elementes);
        CreareVestimentatie creareVestimentatie = new CreareVestimentatie(vestimentatie);

        creareVestimentatie.afisare();
//        creareElement.afisare();


    }
}