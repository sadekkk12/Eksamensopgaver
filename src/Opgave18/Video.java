package Opgave18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Video extends Media{
    private String aspectRatio;
    public Video(String name, int duration, String aspectRatio){
        super(name, duration);
        this.aspectRatio = aspectRatio;
    }
    public String toString(){
        return super.toString() + "\n" + "aspectratio:" + aspectRatio;
    }
    public static void main (String[] args) throws FileNotFoundException {
        File f = new File("src/Opgave18/mediainfo.txt");  // filens placering
        PrintStream filewriter = new PrintStream(f);  // skriver ind til filen f
        Scanner scanner = new Scanner(f);   // prøver at læse fra filen nu

        Audio audio1 = new Audio("audio1", 12, -10.4);
        Audio audio2 = new Audio("audio2", 5, -4);
        Audio audio3 = new Audio("audio3", 10, -12.4);
        Video video1 = new Video("video1", 25, "16:9");
        Video video2 = new Video("video2", 20, "6:9");
        Video video3 = new Video("video3", 15, "16:9");
        ArrayList<Media> media = new ArrayList<>();
        media.addAll(List.of(audio1,audio2,audio3,video1,video2,video3));
        for (Media m: media){
            System.out.println(m);

            for (Media print: media){
                filewriter.println(print);
            }
        }
        while (scanner.hasNextLine()){   // her udskriver vi linjerne i textfilen så længe der er en ny linje
            System.out.println(scanner.nextLine());  // printer nextLine
        }



    }
}
