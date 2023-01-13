package Opgave15Square;
public class Square implements Shape {
    private int width;
    public Square(int width){
        this.width = width;

    }
    public int getWidth(){
        return width;
    }
    @Override
    public double getArea(){
        return width*width;
    }
}
