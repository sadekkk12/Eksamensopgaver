package Opgave7Names;

/*
1. lav en klasse ''Names'' der har tre attributter firstname,middlename og lastname
2. tilføj en constructor der modtager et fullname og selv spliter det op i de tre dele
men tager hensyn til at der måske ikke er et mellemnavn
3. tilføj en toString der skriver det fulde navn ud, men tager hensyn til at der måske ikke er et mellemnavn
 */
//TODO kommentarer
//TODO kigge igennem igen
public class Names {
    String firstName;
    String middleName;
    String lastName;

    public Names(String name) {
        String[] nameArray = name.trim().split(" ");
        firstName = nameArray[0];
        if (nameArray.length == 2) {
            lastName = nameArray[1];
        } else if (nameArray.length == 3) {
            middleName = nameArray[1];
            lastName = nameArray[2];
        }
    }

    public String toString() {
        String name = firstName;
        if (middleName != null) {
            name += " " + middleName + " " + lastName;
        } else if (middleName == null) {
            name += " " + lastName;
        }
        return name;
    }

    public static void main(String[] args) {
        Names Jafar = new Names("  Jafar Mr Gains");
        Names Jafar1 = new Names("Jafar Gains");
        System.out.println(Jafar);
        System.out.println(Jafar1);
    }
}

