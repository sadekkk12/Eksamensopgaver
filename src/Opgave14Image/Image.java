package Opgave14Image;

//TODO kommentarer
// TODO  boolean kan ikke slags string på
public class Image {
    String filename;
    int width;
    int height;
    public Image(String filename, int width, int height){
        this.filename = filename;
        this.width = width;
        this.height = height;
    }
    public boolean isKnownFileType(){
        if (this.filename.contains("gif")){
            return true;
        }else return false;
    }
    public boolean isPortrait(){
        if(height > width) {
            return true;

        }else
            return false;
    }
    public boolean isLandscape(){
        if (width > height){
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Image image1 = new Image("Snestorm.gif",100,50);
        Image image2 = new Image("Sadeksbillede", 100, 250);

        System.out.println(image1);
        System.out.println(image2);
    }
    public String toString(){
        return "Filename: " + filename + " " + " Width: " + width + " " + "Height " + height + "\n"
                + "This file is a known type: " + isKnownFileType() + "\n" +
                "isPortrait: " + isPortrait() + "\n" +
                "isLandscape: " + isLandscape() + "\n";
    }
}
