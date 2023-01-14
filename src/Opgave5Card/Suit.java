package Opgave5Card;

public enum Suit {
    Spades(4),
    Hearts(3),
    Diamonds(2),
    Clubs(1);

    int number;

    Suit(int number) {
        this.number = number;
    }
}
