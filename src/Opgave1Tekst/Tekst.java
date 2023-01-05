package Opgave1Tekst;

import java.util.ArrayList;


  /*
  opgave beskrivelse!
1. lav en klasse ´´tekst´´ med attributten ´´tekstLinjer´´ (det skal være en liste der kan indeholde tekststrenge )
2. tilføj en metode ´´tilføj´´, der kan tilføje en tekststregn til listen af tekstlinjer
3. tilføj en metode ´´findAntalUnikke´´, der returnerer antallet af unikke tekstlinker i listen

   */

public class Tekst {
    private ArrayList<String>Tekstlinjer; // Her oprettes attributten tekstlinjer i form af en arrayliste der kan holde strenge
    //Her defineres arraylisten,den bliver ikke deklareret eller initialiseret.Først skrives Arraylist efterfulgt af data type og navnet på arraylisten
    // DEL OPGAVE 1 FULFØRT!

    private void tilføj(String tilføjelse){ // Her oprettes metoden tilføj som kan tilføje tekstlinjer.
        //Denne metode er void, fordi vi ikke returnere noget. Inden i parantesen har vi metodes argument tilføjelse, som er en string.
        Tekstlinjer.add(tilføjelse); //Her tilføjer vi strengen (tilføjelse) i arraylisten tekstLinjer

    }
    private int findAntalUnikke(){ // her tilføjes metoden der finder antal unikke tekstlinjer, i metoden benyttes int, fordi vi vil have antal returneret.
        ArrayList<String>unikke = new ArrayList<>(); // oprettes arraylisten unikke, som indeholder alle de unikke tekstlinjer
        for (String s: Tekstlinjer){  // her kører et for loop.Hver String tekstlinje ''s'' i arraylisten tekstlinjer, skal køres igennem dette loop.
            if (!unikke.contains(s)) // hvert element i Tekstlinjer bliver kørt igennem loopet.
                // Hvis arraylisten unikke ikke inderholder elementet ''s'' fra arraylisten tekstlinjer, så tilføjes elementet til arraylisten unikke.
                unikke.add(s);
        }
        return unikke.size(); // her returneres størrelsen på arraylisten unikkes størrelse.

    }
    private int findAntalEnkeltstående() {
        ArrayList<String> unikke = new ArrayList<>();
        ArrayList<String> removedFromUnikke = new ArrayList<>();
        for (String s : Tekstlinjer) {
            if (!unikke.contains(s) && !removedFromUnikke.contains(s)) // hvis elementet i arraylisten tekstlinjer ikke er i unikke eller removedfrom unikke.
                // bliver den tilføjet i unikke
                unikke.add(s);
            else { // hvis unikke eller removedfromunikke indeholder elementet. Så bliver det removed fra unikke og tilføjet removed from unikke.
                unikke.remove(s);
                removedFromUnikke.add(s);
            }
        }
        return unikke.size(); // her returnes størrelsen på antal enkeltståendeunikke.
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