public class Notebook {
    String weight;
    int price;
    public Notebook (String weight, int price) {
     this.weight =weight;
     this.price= price;

    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println(" This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println(" This price is good");
        } else {
            System.out.println(" This notebook is expensive");
        }
    }
    public void checkWeight(){
        if (this.weight < 600) {
            System.out.println(" This notebook is very light");

        }
    }

}
