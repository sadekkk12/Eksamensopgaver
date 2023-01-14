package Opgave20;

import java.util.ArrayList;
import java.util.List;

public class User implements Dataobject {
    private int id;
    private String name;
    private String username;

    public User(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    public int getId() {
        return getId();
    }

    public String[] getData() {
        return getData();
    }

    public String toString() {
        return id + " " + name + " " + username;
    }


    public static void main(String[] args) {
        Student student1 = new Student(1, "sa", "sa@mail");
        Student student2 = new Student(2, "saa", "saa@mail");
        Student student3 = new Student(3, "saaa", "saaa@mail");
        User user1 = new User(1, "ha", "haa1");
        User user2 = new User(2, "haa", "haa1");
        User user3 = new User(3, "haaa", "haa1");
        ArrayList<Dataobject> objekter = new ArrayList<>(List.of(student1, student2, student3, user1, user2, user3));
        for (Dataobject objekt : objekter) {
            System.out.println(objekt);
        }

    }
}
