package Opgave8AgeCalc;

public class DateAgeCalculator {
    /*
    1. lav en klasse DateAgeCalculator der har to attributer: yourAge og dateAge
    2. tilføj en metode til at beregne den lavest acceptable dateAge ud fra formlen: lowest = yourAge/2+7
    3. tilføj en metode til at returnere hvorvidt date er for ung eller ej
     */
    // TODO Kommenter
    //TODO lav den med scanner version
    //TODO fix loop
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int acceptableDateAge() {
        return yourAge / 2 + 7;

    }

    public boolean forUngEllerEj() {
        if (dateAge >= acceptableDateAge()) {
            System.out.println("huraaaaayyy");
            return true;
        }
        else {
            System.out.println("Hun er lidt for ung!");
        }
        return false;
    }


        public static void main (String[]args){
            DateAgeCalculator potentialDate1 = new DateAgeCalculator(24, 24);
            DateAgeCalculator potentialDate2 = new DateAgeCalculator(24, 18);
            System.out.println(potentialDate1.acceptableDateAge());
            System.out.println(potentialDate2.acceptableDateAge());
            System.out.println(potentialDate1.forUngEllerEj());
            System.out.println(potentialDate2.forUngEllerEj());

        }
    }


