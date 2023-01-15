package Opgave13Lego;

import java.util.Random;

//TODO kommentarer
// kigge nærmere på koden specifikt new julegave
public class JuleGave {
    boolean isSoft;
    boolean isRectangular;
    boolean doesRattle;


    public JuleGave() {
        Random rng = new Random();
        this.isSoft = rng.nextBoolean();
        this.isRectangular = rng.nextBoolean();
        this.doesRattle = rng.nextBoolean();

    }

    public JuleGave(boolean isSoft, boolean isRectangular, boolean doesRattle) {
        this.isSoft = isSoft;
        this.isRectangular = isRectangular;
        this.doesRattle = doesRattle;
    }

    public Boolean couldBeLego() {
        return !isSoft && isRectangular && doesRattle;
    }

    //TODO look up ternary operator return 10+10 ? true:false
    public static void main(String[] args) {
        JuleGave tilfældigGave = new JuleGave();
        System.out.println(tilfældigGave);


    }

    public String toString() {
        return "Disse egenskaber om julegaven er enten false eller true! \n" +
                "Soft: " + isSoft + "\n" +
                "Rectangular: " + isRectangular + "\n" +
                "doesRattle: " + doesRattle + "\n" +
                "Er julegaven LEGO: " + couldBeLego();
    }
}

