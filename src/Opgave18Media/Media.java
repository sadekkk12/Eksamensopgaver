package Opgave18Media;

public  class Media {
    private String name;
    private int duration;
    public Media(String name, int duration){
        this.name = name;
        this.duration = duration;

    }
    public String toString(){
        return  "name:" +name + "\n" + "duration: " + duration;
    }
}
