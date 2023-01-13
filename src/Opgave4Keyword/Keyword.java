package Opgave4Keyword;

import java.util.ArrayList;

public class Keyword {
    /*
    1. lave en klasse "keyword" med to attributter: name og description.
    2. tilføj en metode ´´see also´´ attribut, så et keyword eventuelt kan henvise til flere andre keywords.
     tilføj også en metode til at tilføje disse henvisninger.
     3. lav en udskriftsmetode der udskriver word og definition, og hvis der er andre keywords, skriv "see also"
     og en kort liste af disse keywords.
     */
    //TODO kigge på den her opgave og dens svar.. usikker
    //TODO se kommentarer igennem
    String name;
    String description;
    ArrayList<String> seeAlso;
public Keyword(String name, String description){
    this.name = name;
    this. description = description;
}
public Keyword(String name){
    this.name = name;
}
public void addSeeAlso(String seeAlso){
this.seeAlso.add(seeAlso);
}

    public static void main(String[] args) {
        Keyword kw = new Keyword("Cake", "a cake is a baked dessert");
        kw.seeAlso = new ArrayList<>();
        kw.addSeeAlso("Pudding");
        kw.addSeeAlso("chocolate");
        kw.addSeeAlso("Cherry");
        System.out.println(kw);

    }
    public String toString(){
    return "(word: " + this.name + ", definition: " + this.description + ") See also " + this.seeAlso;
    }
}
