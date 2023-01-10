package Opgave5Card;

public class Card {
    /*
    1. lav en klasse "Card" med to attributter "suit og "value"
     - suit kan være "hearts", "diamonds", "clubs" eller "spades" - value kan være 1-13
     2. tilføj en metode "beats" der modtager et andet card og fortæller om dette korts værdi slår det andets værdi (ignorer suit)
     3. ret metoden så den også tager højde for suit - spades slår hearts, som slår diamond som slår clubs.
    // TODO LAVE KOMMENTAR
     */
    /*
    Suit suit;
    int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;

    }

    public int getSuitRanking(Suit suit) {
        int suitrank = 0;
        switch (suit) {
            case Spades -> suitrank = 4;
            case Hearts -> suitrank = 3;
            case Diamonds -> suitrank = 2;
            case Clubs -> suitrank = 1;
        }
        return suitrank;
    }


    private void beats(Card card) {
        if (this.suit.number > card.suit.number) {
            System.out.println("this card " + this.value + " " + this.suit + " beats " + card.value + " " + card.suit);
        } else if (card.suit.number > this.suit.number) {
            System.out.println("other card " + card.value + " " + card.suit + " beats " + this.value + " " + this.suit);
        } else {
            if (this.value > card.value) {
                System.out.println("this card " + this.value + " " + this.suit + " beats " + card.value + " " +  card.suit);
            } else if (this.value < card.value) {
                System.out.println("other card " + card.value + " " + card.suit + " beats " + this.value + " " + this.suit);
            } else
                System.out.println("this card " + this.value + " " + this.suit + " is in a draw with " + card.value + " " + card.suit);
        }
    }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.Spades, 10);
        Card card2 = new Card(Suit.Clubs, 13);
        Card card3 = new Card(Suit.Diamonds, 2);
        Card card4 = new Card(Suit.Spades, 7);
        Card card5 = new Card(Suit.Spades, 8);
        card1.beats(card1); // draw
        card1.beats(card2); //beats
        card1.beats(card3); //beats
        card1.beats(card4); // beats
        card2.beats(card1); // other card beats
        card2.beats(card2); // draw
        card2.beats(card3); // other card beats
        card2.beats(card4);  // other card beats
        card4.beats(card1); // other card beats
        card4.beats(card2); // beats
        card4.beats(card3); // beats
       card4.beats(card4); // draw
       card5.beats(card1); // other card beats
        //  card5.beats(card4);
    }



    public String toString() {
        return Suit.values().toString() + value;
    }
}

     */
/*if (getSuitRanking(this.suit) > getSuitRanking(card.suit)) {
        System.out.println("this card " + this.value + " " + this.suit + " beats " + card.value + " " + card.suit);
        } else if (getSuitRanking(card.suit) > getSuitRanking(this.suit)) {
        System.out.println("other card " + card.value + " " + card.suit + " beats " + this.value + " " + this.suit);
        } else {

 */



   private int value;
    private Suit suit;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;

    }

    private boolean beats(Card card) {
        if (this.suit.number > card.suit.number) {
            return true;
        } else if (card.suit.number > this.suit.number) {
            return false;
            } else
                if (this.value > card.value) {
                    return true;
                }
                else if (card.value > this.value) {
                    return false;
                }
                else
                return false;

        }





    public static void main(String[] args) {
        Card card1 = new Card(Suit.Spades,10);
        Card card2 = new Card(Suit.Spades,10);
        Card card3 = new Card(Suit.Clubs, 13);
        Card card4 = new Card(Suit.Diamonds, 1);


        System.out.println(card1.beats(card2));
        System.out.println(card1.beats(card3));
        System.out.println(card3.beats(card4));

    }
}



