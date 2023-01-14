package Opgave10BMI;

/*
1. lav en klasse BMI der har to attributer: height and weight
2. lav en metode calculate, der berenger BMI ud fra de to værdier BMI = vægt/ height*height
3. lav tre metoder: isunderweight, isoverweight og isnormalweight der returnere true
 hvis BMI er henholdsvis under 18,5 over 25 eller derimellem
 */
public class BMI {
    private double height;
    private int weight;

    public BMI(double height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public double BMIberegner() {
        double BMI;
        BMI = weight / (height * height);

        return BMI;
    }

    public boolean isUnderWeight() {
        return BMIberegner() < 18.5;
    }

    public boolean isNormalWeight() {
        return BMIberegner() > 18.5 && BMIberegner() <= 25;
    }

    public boolean isOverWeight() {
        return BMIberegner() > 25;
    }


    public static void main(String[] args) {
        BMI person1 = new BMI(1.65, 85);
        person1.BMIberegner();
        System.out.println(person1.BMIberegner());
        System.out.println("this person is underweight: " + person1.isUnderWeight());
        System.out.println("this person is normalweight: " + person1.isNormalWeight());
        System.out.println("this person is overweight: " + person1.isOverWeight());
        System.out.println("-----");
        System.out.printf("\nthis person is:\n" +
                "   is underweight: %s\n" +
                "   is normalweight: %s\n" +
                "   is overweight: %s\n", person1.isUnderWeight(), person1.isNormalWeight(), person1.isOverWeight());

    }
}
