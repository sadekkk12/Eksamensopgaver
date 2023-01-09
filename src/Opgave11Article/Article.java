package Opgave11Article;

public class Article {
    String heading;
    String body;
    String author;
    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }


    public static void main(String[] args) {
        Article article1 = new Article("Eksamensforberedelse!","BMI er en forkortelse for Body Mass Index eller krops masseindeks." +
                "Du kan beregne dit BMI her. BMI kan kun bruges, hvis du er over 19 år og ikke er gravid.", "Sadek");
        System.out.printf("Dette er Artiklens heading: " + article1.heading +
                "\n" + "nedenfor er artiklens body:\n" + article1.body +
                "\n" + "Artiklen er skrevet af: " + article1.author);
    }


}
