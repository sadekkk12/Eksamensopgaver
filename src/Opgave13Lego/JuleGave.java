package Opgave13Lego;

import java.util.Random;

//TODO kommentarer
// kigge nærmere på koden specifikt new julegave
public class JuleGave {
    boolean isSoft;
    boolean isRectangular;
    boolean doesRattle;

    public JuleGave(boolean isSoft, boolean isRectangular, boolean doesRattle){
        Random rng = new Random();
        this.isSoft = rng.nextBoolean();
        this.isRectangular = rng.nextBoolean();
        this.doesRattle = rng.nextBoolean();


    }
    public Boolean couldBeLego(){
        if (isSoft == false && isRectangular == true && doesRattle == true){
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        JuleGave gave1 = new JuleGave(false, true, false);
        System.out.println(gave1);


        }
        public String toString(){
        return "Disse egenskaber om julegaven er enten false eller true! \n" +
                "Soft: " + isSoft + "\n" +
                "Rectangular: " + isRectangular + "\n" +
                "doesRattle: " + doesRattle + "\n" +
                "Er julegaven LEGO: " + couldBeLego();
        }
    }

