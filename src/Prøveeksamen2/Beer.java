package Prøveeksamen2;

import java.util.ArrayList;

public class Beer {
    private String name;
    private int alchoholPercentage;
    private int price;
    public Beer(String name, int alchoholPercentage, int price) throws Exception {
        this.name = name;
        setAlchoholPercentage(alchoholPercentage);
        setPrice(price);
    }

    public void setAlchoholPercentage(int alchoholPercentage) throws Exception {
        if (alchoholPercentage > 0 && alchoholPercentage < 100){
            this.alchoholPercentage = alchoholPercentage;

        } else
            throw new Exception("Alchohol percantage needs to be between 0 and 100");

        }
    public void setPrice(int price) throws Exception {
        if (price >= 0){
            this.price = price;
        } else throw new Exception("Price cannot be negative");
    }
    public int getPrice() {
        return price;
    }
    public static void main(String[] args) throws Exception {
        Beer beer1 = new Beer("Carlsberg", 99,150);
        Beer beer2 = new Beer("Carlsberg",99,100);
      //  Beer beer3 = new Beer("Carlsberg");
       // beer3.setPrice(25);
       // beer3.setAlchoholPercentage(25);
        ArrayList<Beer> beerArrayList = new ArrayList<>();
        beerArrayList.add(beer1);
        beerArrayList.add(beer2);
       // beerArrayList.add(beer3);
        int prisgennemsnit =0;
        for (Beer beerloop: beerArrayList){
            prisgennemsnit += beerloop.getPrice();
        }
        System.out.println(prisgennemsnit/beerArrayList.size());
        System.out.printf("this beers name is from %s and it has a alcoholpercantage of %d  and its price is %d \n", beer1.name, beer1.alchoholPercentage, beer1.price);
        System.out.printf("this beers name is from %s and it has a alcoholpercantage of %d  and its price is %d", beer2.name, beer2.alchoholPercentage, beer2.price);

    }

    }
