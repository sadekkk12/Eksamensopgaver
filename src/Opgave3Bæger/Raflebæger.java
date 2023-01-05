package Opgave3Bæger;

import java.util.Arrays;
import java.util.Random;

/*
1. Lav en klasse ''Raflebæger med en attribut for et antal terninger i bægeret og en konstruktør der angiver antallet af terninger
2. tilføj en metode ''ryst'' der ryster bægeret, og returnerer det samlede antal øjne.
3. tilføj en metode ´´se´´ der returnere listen af terningensøjne uden at ryste igen.
 */
public class Raflebæger {
    int antalTerninger; // her oprettes attributten antal terninger
    int[] terninger;    // oprette arraylisten terninger

    public Raflebæger(int antalTerninger) {  //her oprettes konstruktøren Raflebæger med paramereten int antalTerninger
        terninger = new int[antalTerninger]; // int arraylisten bliver assignet størrelsen  antallet af antalTerninger
        this.antalTerninger = terninger.length; // her bliver antalTerninger //TODO ??assignet?? længden af arrayet terninger
    }
    // det ville nogenlunde se sådan her ud
    // public Raflebæger (int 4){
    // terninger = new int[4]
    //this. antalterninger = 4

    public int ryst() { // her oprettes ryst metoden der ryster i bægeren og giver terningerne et tilfældigt nummer fra 1-6
        int antaløjne = 0; //her initialiserer vi antaløjne og giver den værdien 0
        Random rng = new Random(); // Her opretter vi en randomizer ved navn rng
        for (int i = 0; i < terninger.length; i++) { // for hvert element (I) skal forloopet køre så længe I er mindre end
            // antal terninger. Java starter på 0 og sætter en til efter hvert loop. det vil sige vi starter på 0 og slutter på 3. hvilket svarer til 4 elementer.
            // som er det antal terninger vi har i et bæger
            terninger[i] = rng.nextInt(1, 7); // her bliver elementet i terning assignet en random værdi mellem fra 1 og til 7.
            antaløjne += terninger[i]; // her overrider vi værdien på antal øjne så vi kan returnere værdien på øjnene efter bægeret er rystet.
            // antal øjne (0) = antal øjne(0) + random værdi = nye antaløjne


        }
        return antaløjne; // her returneres antal øjne efter terningen er blevet rystet

    }
    public int[] se(){  // her oprettes SE metoden der viser terningerne. det er mindeværdigt at der benyttes integer arraylist.
        return terninger;
    }

    public static void main(String[] args) {
        Raflebæger bæger = new Raflebæger(4); // her sættes antalTerninger værdien til 4
        System.out.println("Antal terninger: " + bæger.antalTerninger); //her udskrive antal tærninger som er 4
        for (int i = 1; i < 11; i++){ // int i = 1. dette loop kører mens i er mindre end 11. efter hvert loop sættes i++ på dvs 1 indtil vi når 10
            bæger.ryst(); // i hvert loop skal terningerne rystes og tildeles random øjneværdier
            System.out.println("Kast " + i + ": "+ Arrays.toString(bæger.se()) ); //her bliver terningerne udskrevet.
            // + i + viser hvilket nummer vi er på. derefter udskrives terning værdierne ved hjælp af se metoden i et ARRAYS.TOSTRING
        }
    }
}
