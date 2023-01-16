package Prøveeksamen2;

import java.util.ArrayList;

public class Beer {
    private String name;
    private int alchoholPercentage;
    private int price;
    public Beer(String name){
        this.name = name;
    }

    public void setAlchoholPercentage(int alchoholPercentage){
        if (alchoholPercentage > 0 && alchoholPercentage < 100){
            this.alchoholPercentage = alchoholPercentage;

        } else {
            System.out.println("alchoholP not valid");

        }
    }
    public void setPrice(int price){
        if (price > 0){
            this.price = price;
        }
    }
    public int getPrice() {
        return price;
    }
    public static void main(String[] args){
        Beer beer1 = new Beer("Carlsberg");
        beer1.setPrice(150);
        beer1.setAlchoholPercentage(25);
        Beer beer2 = new Beer("Carlsberg");
        beer2.setAlchoholPercentage(120);
        beer2.setPrice(100);
        Beer beer3 = new Beer("Carlsberg");
        beer3.setPrice(25);
        beer3.setAlchoholPercentage(25);
        ArrayList<Beer> beerArrayList = new ArrayList<>();
        beerArrayList.add(beer1);
        beerArrayList.add(beer2);
        beerArrayList.add(beer3);
        int prisgennemsnit =0;
        for (Beer beerloop: beerArrayList){
            prisgennemsnit += beerloop.getPrice();
        }
        System.out.println(prisgennemsnit/beerArrayList.size());
        System.out.printf("this beers name is from %s and it has a alcoholpercantage of %d  and its price is %d", beer2.name, beer2.alchoholPercentage, beer2.price);

    }

    }
