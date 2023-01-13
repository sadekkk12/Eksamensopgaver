package Opgave1Tekst;

import java.util.ArrayList;


  /*
  opgave beskrivelse!
1. lav en klasse ´´tekst´´ med attributten ´´tekstLinjer´´ (det skal være en liste der kan indeholde tekststrenge )
2. tilføj en metode ´´tilføj´´, der kan tilføje en tekststregn til listen af tekstlinjer
3. tilføj en metode ´´findAntalUnikke´´, der returnerer antallet af unikke tekstlinker i listen

   */

public class Tekst {
    private ArrayList<String>Tekstlinjer;

    private void tilføj(String tilføjelse){

        Tekstlinjer.add(tilføjelse);

    }
    private int findAntalUnikke(){
        ArrayList<String>unikke = new ArrayList<>();
        for (String s: Tekstlinjer){
            if (!unikke.contains(s))
                unikke.add(s);
        }
        return unikke.size();

    }
    private int findAntalEnkeltstående() {
        ArrayList<String> unikke = new ArrayList<>();
        ArrayList<String> removedFromUnikke = new ArrayList<>();
        for (String s : Tekstlinjer) {
            if (!unikke.contains(s) && !removedFromUnikke.contains(s))

                unikke.add(s);
            else {
                unikke.remove(s);
                removedFromUnikke.add(s);
            }
        }
        return unikke.size();
    }
    public static void main(String[] args) {
        Tekst program = new Tekst(); //TODO hvad kalder man det her?
        program.Tekstlinjer = new ArrayList<>();  //TODO hvorfor skal man gøre det her for at få adgang?
        program.tilføj("Pikachu");
        program.tilføj("Hund");
        program.tilføj("Hund");

        System.out.println("Alle tekstlinjer:" + program.Tekstlinjer);
        System.out.println("Alle Unikke tekstlinjer:" + program.findAntalUnikke());
        System.out.println("Antal enkeltstående: " + program.findAntalEnkeltstående());


    }


    }