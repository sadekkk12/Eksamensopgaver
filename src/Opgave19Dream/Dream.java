package Opgave19Dream;

import java.util.ArrayList;
import java.util.List;

public class Dream {
    private String date;
    private int duration;
    private String type;

    public Dream(String date, int duration, String type) {
        this.date = date;
        this.duration = duration;
        this.type = type;


    }

    public int getDuration() {
        return duration;
    }

    public boolean isPleasant() {
        if (type.equals("tør") && duration > 10) {
            return true;

        } else if (type.equals("mareridt")) {
            return false;

        } else if (type.equals("våd") && duration < 10) {
            return true;

        } else return false;
    }

    public static void main(String[] args) {
        Dream dream1 = new Dream("2022", 9, "tør");
        Dream dream2 = new Dream("2022", 15, "tør");
        Dream dream3 = new Dream("2022", 5, "våd");
        Dream dream4 = new Dream("2022", 11, "tør");
        Dream dream5 = new Dream("2022", 8, "mareridt");
        Dream dream6 = new Dream("2022", 15, "mareridt");
        ArrayList<Dream> dreams = new ArrayList<>();
        dreams.addAll(List.of(dream1, dream2, dream3, dream4, dream5, dream6));
        for (int i = 0; i < dreams.size(); i++) {
            System.out.printf("Drøm nummer #%d, er en %s drøm og varer i %d minutter. Drømmen var pleasant: %s", i + 1,
                    dreams.get(i).type, dreams.get(i).duration, dreams.get(i).isPleasant() + "\n");
        }
        //TODO har brug for hjælp til den sidste


    }
}
