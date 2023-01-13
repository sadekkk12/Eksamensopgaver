package Opgave6Bil;


/*
1. lav to klasser: Bil og Trailer - og en attribut på bil så den (eventuelt) kan få en trailer tilkoblet
(et trailer objekt)
2. tilføj en vægt attribut til begge klasser og - en metode på bil der returnerer totalvægt
(bilen selv og dens evt trailer)
3. ret i Bil så den kun kan tilkobles en trailer hvis den samlede totalvægt ikke overskrider 3500kg
 */
//TODO lave færdig
// kommentarer
public class Bil {
    private Trailer trailer;
   private  int vægt;

    public Bil(int vægt){
        this.vægt = vægt;

    }
    public boolean connectTrailer(Trailer trailer){
        this.trailer = trailer;
        if (Totalvægt() > 3500){
            this.trailer = null;
            return false;
        }
        return true;
    }
    public int getBilVægt(){
        return vægt;

    }
    public int Totalvægt(){
       return this.trailer !=null ? trailer.getVægt() + vægt : vægt;
       // TODO kigger på ternary
    }

    public static void main(String[] args) {
        Trailer trailer = new Trailer(500);
        Bil bil = new Bil(3000);
        System.out.println(bil);
        if (!bil.connectTrailer(trailer)) {
            System.out.println("trailer ikke tilkoblet");
        }
        else if (bil.connectTrailer(trailer)){
            System.out.println("trailer er tilkoblet");
        }
        System.out.println(bil.connectTrailer(trailer));

    }
    public String toString(){
        return "Bilen vejer:" + getBilVægt() + " og total vægten er:" + Totalvægt();
    }
    }

