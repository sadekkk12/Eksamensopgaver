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
    public boolean isKnownFileType() {
        if (filename.contains("gif")){
            return true;
        } else
            return false;
       /* boolean matches = false;
        String[] Filetypes = {"gif", "jpeg", "jpg", "png", "webp", "bmp"};
        for (String s : Filetypes) {
            if (s.contains(this.filename)) {
                matches = true;
                break;
            }
        }
        return matches;

        */
    }
    public boolean isPortrait(){
        return height > width;
    }
    public boolean isLandscape(){
        return width > height;
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
