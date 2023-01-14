package Opgave9Motherboard;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Motherboard {
    SataDrive[] sataDrives = new SataDrive[4];


    public void printDrives() {
        for (SataDrive drive : sataDrives) {
            System.out.println(drive);
        }
    }

    public boolean addDrive(SataDrive drive) {
        for (int i = 0; i < sataDrives.length; i++) {
            if (sataDrives[i] == null) {
                sataDrives[i] = drive;
                return true;
            }


        }
        return false;

    }


    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();
        ArrayList<SataDrive> drives = new ArrayList<>();
        SataDrive drive1 = new SataDrive("drive1");
        SataDrive drive2 = new SataDrive("drive2");
        SataDrive drive3 = new SataDrive("drive3");
        SataDrive drive4 = new SataDrive("drive4");
        SataDrive drive5 = new SataDrive("drive5");
        drives.add(drive1);
        drives.add(drive2);
        drives.add(drive3);
        drives.add(drive4);
        drives.add(drive5);

        System.out.println(drives);
        for (SataDrive drive : drives) {
            if (motherboard.addDrive(drive)) {
                System.out.println("this drive:" + drive + " is now added");

            } else
                System.out.println("this drive: " + drive + " is not added");
        }
        motherboard.printDrives();
    }

}

