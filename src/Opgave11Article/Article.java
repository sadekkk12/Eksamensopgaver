package Opgave11Article;

import java.util.ArrayList;

public class Article {
    String heading;
    String body;
    String author;
    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }
public String getLongestWord(){
    body = body.replaceAll("\\W", " ");  // Erstatter alt der ikke er [a-zA-Z0-9_] med mellemrum. fx punktum osv
        String[] bodyarray = body.split(" ");

        String longestword = bodyarray[0];
        for (String word: bodyarray){
            if (word.length() > longestword.length()){
                longestword = word;
            }
        }
    return longestword;
}
public ArrayList<String> getWords(){
    ArrayList<String> oneTimeWord = new ArrayList<>();
    body = body.replaceAll("\\W", " "); // Erstatter alt der ikke er [a-zA-Z0-9_] med mellemrum. fx punktum osv
        String[] words = body.split(" ");
        for (String word: words){
            if (!oneTimeWord.contains(word)){
                oneTimeWord.add(word);

            }
        }
    return oneTimeWord;

}
    public static void main(String[] args) {
        Article article1 = new Article("Eksamensforberedelse!","BMI er en forkortelse for Body Mass Index eller krops masseindeks." +
                "Du kan beregne dit BMI her. BMI kan kun bruges, hvis du er over 19 år og ikke er gravid.", "Sadek");
        System.out.println(article1.getLongestWord());
        System.out.println(article1.getWords());
    }



}
