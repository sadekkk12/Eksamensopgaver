package Opgave14Image;

//TODO kommentarer
// TODO  boolean kan ikke slags string på
public class Image {
    String filename;
    int width;
    int height;

    public Image(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType() {
        boolean fileFormat = false;
        String[] fileNameSplit = filename.split("\\.");
        //TODO try catch eksempel
        try {
            switch (fileNameSplit[1]) {
                case "gif", "jpeg", "png" -> fileFormat = true;
                default -> fileFormat = false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mangler filtype");
            return false;
        }

        return fileFormat;
    }

    public boolean isPortrait() {
        return height > width;
    }

    public boolean isLandscape() {
        return width > height;
    }

    public static void main(String[] args) {
        Image image1 = new Image("Snestorm.gif", 100, 50);
        Image image2 = new Image("Sadeksbillede", 100, 250);

        System.out.println(image1);
        System.out.println(image2);
        System.out.printf("Dette er billede 1 %s og dett er billedets bredde %d", image1.filename, image1.width); // printf
    }

    public String toString() {
        return "Filename: " + filename + "," + " Width: " + width + ", Height " + height + "\n"
                + "This file is a known type: " + isKnownFileType() + "\n" +
                "isPortrait: " + isPortrait() + "\n" +
                "isLandscape: " + isLandscape() + "\n";
    }
}
