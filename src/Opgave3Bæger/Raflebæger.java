package Opgave3Bæger;

import java.util.Arrays;
import java.util.Random;

/*
1. Lav en klasse ''Raflebæger med en attribut for et antal terninger i bægeret og en konstruktør der angiver antallet af terninger
2. tilføj en metode ''ryst'' der ryster bægeret, og returnerer det samlede antal øjne.
3. tilføj en metode ´´se´´ der returnere listen af terningensøjne uden at ryste igen.
 */
public class Raflebæger {
    int antalTerninger;
    int[] terninger;

    public Raflebæger(int antalTerninger) {
        terninger = new int[antalTerninger];
        this.antalTerninger = terninger.length;
    }

    public int ryst() {
        int antaløjne = 0;
        Random rng = new Random();
        for (int i = 0; i < terninger.length; i++) {

            terninger[i] = rng.nextInt(1, 7);
            antaløjne += terninger[i];

        }
        return antaløjne;

    }

    public int[] se() {
        return terninger;
    }

    public static void main(String[] args) {
        Raflebæger bæger = new Raflebæger(4);
        System.out.println("Antal terninger: " + bæger.antalTerninger);
        for (int i = 1; i < 11; i++) {
            bæger.ryst();
            System.out.println("Kast " + i + ": " + Arrays.toString(bæger.se()));
        }
    }
}
