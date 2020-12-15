package Inne;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = Integer.valueOf(weight.replace("g", ""));
        this.price = price;
        this.year = year;


    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println(" This notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println(" This price is good");
        } else {
            System.out.println(" This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println(" This notebook is very light");
        } else if (this.weight > 600 && this.weight < 3000) {
            System.out.println("This notebook is light");
        } else {
            System.out.println("This notebook is not very heavy");

        }
    }

    public void checkYear() {
        if (this.year <= 1998 && this.price > 2000) {
            System.out.println("This notebook is lame");
    } else if (this.year > 2018 && this.price < 1000) {
            System.out.println("This notebook is super !!");
        } else {
            System.out.println("This notebook ok");


        }
    }
}
