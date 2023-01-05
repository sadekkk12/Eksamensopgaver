package Opgave2Film;

public class Producer {
String navn; // navne attribut til produceren
public Producer(String navn){ // Konstruktør til produceren der indeholder navn.
    this.navn = navn;
}
public String toString(){ // Tostring så producerens navn præsenteres som vi ønsker.
    return navn;
}
}
