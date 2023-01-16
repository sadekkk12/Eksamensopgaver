package Prøveeksamen1;

import java.util.*;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getHouse() {
        return house;
    }

    public String getLastName() {
        return lastName;
    }

    public void setHouse(String house) {

            if (house.equals("gryffindor") || house.equals("hufflepuff") || house.equals("ravenclaw") || house.equals("slytherin")) {
                this.house = house;
            } else
                throw new InputMismatchException(house + " is not a house");

    }

    public static void main(String[] args) {
        HogwartsStudent student1 = new HogwartsStudent("simon", "har");
        student1.setHouse("gryffindor");
        HogwartsStudent student2 = new HogwartsStudent("simon2", "har2");
        student2.setHouse("hufflepuff");
        HogwartsStudent student3 = new HogwartsStudent("simon3", "har3");
        student3.setHouse("ravenclaw");
        ArrayList<HogwartsStudent> students = new ArrayList<>(List.of(student1, student2, student3));

        for (HogwartsStudent s : students) {
            System.out.printf("Students first name is %s and last name is %s. The students house is %s \n", s.getFirstName(), s.getLastName(), s.getHouse());
        }
    }
}