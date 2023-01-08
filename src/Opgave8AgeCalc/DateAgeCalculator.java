package Opgave8AgeCalc;

import java.util.Scanner;

public class DateAgeCalculator {
    /*
    1. lav en klasse DateAgeCalculator der har to attributer: yourAge og dateAge
    2. tilføj en metode til at beregne den lavest acceptable dateAge ud fra formlen: lowest = yourAge/2+7
    3. tilføj en metode til at returnere hvorvidt date er for ung eller ej
     */
    // TODO Kommenter
    //TODO lav den med scanner version, find ud af hvordan
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int acceptableDateAge() {
        return yourAge / 2 + 7;

    }

    public void forUngEllerEj() {

            if (dateAge >= acceptableDateAge()) {
                System.out.println("Hvis du er " + yourAge + " og din date er " + dateAge + " så er hun gammel nok, hurray");
            } else {
                System.out.println("Hvis du er " + yourAge + " og din date er " + dateAge + " så er hun for ung! prøv igen!");
            }
    }


        public static void main (String[]args){
          // Scanner scanner = new Scanner(System.in);
            //System.out.println("Dette er en date age calculator!");
            //System.out.println("indtast din alder!");
            //int yourAge = scanner.nextInt();
            //System.out.println("indtast din dates alder!");
            //int dateAge = scanner.nextInt();

            DateAgeCalculator potentialDate1 = new DateAgeCalculator(26, 24);
            DateAgeCalculator potentialDate2 = new DateAgeCalculator(24, 18);
            System.out.println(potentialDate1.acceptableDateAge());
            System.out.println(potentialDate2.acceptableDateAge());
            potentialDate2.forUngEllerEj();
            potentialDate1.forUngEllerEj();


        }
    }


