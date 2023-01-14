package Opgave20;

import java.util.ArrayList;

public class Student implements Dataobject {
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String[] getData() {
        return getData();
    }

    public String toString() {
        return id + " " + name + " " + email;
    }
}
