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
    Trailer trailer;
    int vægt;

    public Bil(int vægt){
        this.vægt = vægt;

    }
    public int getBilVægt(){
        return vægt;

    }
    //public int Totalvægt(){
      //  return this.vægt +this.trailer.getVægt();
   // }

    public static void main(String[] args) {
        Trailer trailer = new Trailer(3232);
        Bil bil = new Bil(1000);
        System.out.println(bil.getBilVægt());
        System.out.println(trailer.getVægt());
    }
}
