package Opgave2Film;

import java.time.Year;

public class Film {
    /*
    1. lav en klasse ''Opgave2.Film'' med attributterne for filmtitel og udgivelsesår
    2. tilføj en konstruktør der modtager en filmtitel og et udgivelsesår
     og en anden konstruktør der kun modtager en filmtitel og selv sætter udgivelsåret til det aktuelle år
     3. tilføj en klasse Opgave2.Producer, og giv Opgave2.Film klassen mulighed for at "koble" en producter til en film.
     */
    String filmtitel; // her oprettes attributterne filmtitel og udgivelsesår som skal bruges i konstruktøren.
    int udgivelsesår;
    Producer producer; //TODO hvad ville man kalde det her? /terminologi

    public Film(String filmtitel, int udgivelsesår) {  // her oprettes den første konstruktør
        this.filmtitel = filmtitel;  //TODO hvad kalder man det?? initialisere??
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String filmtitel) { // her oprettes den anden konstruktør som har kræver en manuael indtastning af filmtitel
        // mens udgivelsesår automatisk er sat til det nuværende år
        this.filmtitel = filmtitel;
        this.udgivelsesår = Year.now().getValue();  // Her sættes udgivelsesår til det aktuelle år.
        // Year.now() altså det aktuelle år og så getValue(), hvor vi henter dens værdi.
    }

    public void setProducer(Producer producer) { // Her opretter vi setProducer metoden således at vi kan tilknytte en producer til filmene.
        this.producer = producer; // her fortæller vi hvilken værdi produceren skal have/??instialisere??
        // som så er attributten vi har deklareret øverste, som er taget fra klassen Opgave2.Producer.
    }

    public static void main(String[] args) {
        Film SadeksFilm = new Film("Sadekfilm", 2022); //oprettelsen af film med to parametre
        SadeksFilm.setProducer(new Producer("Jimmy")); // tilknytning af producer
        Film ToresFilm = new Film("Torefilm", 2023); //oprettelsen af film med to parametre
        ToresFilm.setProducer(new Producer("Sadek")); // tilknytning af producer
        Film SadekThisyearfilm = new Film("Sadekthisyear"); //opretetlsen af film med ET parameter og det aktuelle år
        SadekThisyearfilm.setProducer(new Producer("Tore")); // tilknytning af producer
        Film ToreThisyearfilm = new Film("Torethisyear"); //opretetlsen af film med ET parameter og det aktuelle år
        ToreThisyearfilm.setProducer(new Producer("Sadek")); // tilknytning af producer

        System.out.println(SadeksFilm);
        System.out.println(ToresFilm);
        System.out.println(SadekThisyearfilm);
        System.out.println(ToreThisyearfilm);

    }

    public String toString() { //her laves en toString metode, som viser hvordan de forskellige informationer skal præsenteres på skærmen.
        //man kunne PRINTF istedet //TODO kig ind til det.
        return "Titel: " + filmtitel + ", Opgave2.Producer: " + producer + ", Udgivelsesår: " + udgivelsesår;
    }
}
