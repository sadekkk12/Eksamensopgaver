package Opgave2Film;

import java.time.Year;

public class Film {
    /*
    1. lav en klasse ''Opgave2.Film'' med attributterne for filmtitel og udgivelsesår
    2. tilføj en konstruktør der modtager en filmtitel og et udgivelsesår
     og en anden konstruktør der kun modtager en filmtitel og selv sætter udgivelsåret til det aktuelle år
     3. tilføj en klasse Opgave2.Producer, og giv Opgave2.Film klassen mulighed for at "koble" en producter til en film.
     */
    String filmtitel;
    int udgivelsesår;
    Producer producer;

    public Film(String filmtitel, int udgivelsesår) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String filmtitel) {

        this.filmtitel = filmtitel;
        this.udgivelsesår = Year.now().getValue();

    }
    public void setProducer(Producer producer) {
        this.producer = producer;

    }
    public static void main(String[] args) {
        Film SadeksFilm = new Film("Sadekfilm", 2022);
        SadeksFilm.setProducer(new Producer("Jimmy"));
        Film ToresFilm = new Film("Torefilm", 2023);
        ToresFilm.setProducer(new Producer("Sadek"));
        Film SadekThisyearfilm = new Film("Sadekthisyear");
        SadekThisyearfilm.setProducer(new Producer("Tore"));
        Film ToreThisyearfilm = new Film("Torethisyear");
        ToreThisyearfilm.setProducer(new Producer("Sadek"));

        System.out.println(SadeksFilm);
        System.out.println(ToresFilm);
        System.out.println(SadekThisyearfilm);
        System.out.println(ToreThisyearfilm);

    }

    public String toString() {
        return "Titel: " + filmtitel + ", Opgave2.Producer: " + producer + ", Udgivelsesår: " + udgivelsesår;
    }
}
