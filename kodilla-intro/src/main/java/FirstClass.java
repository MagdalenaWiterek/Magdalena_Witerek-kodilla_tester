public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 500);
        System.out.println(notebook.weight + ""+ notebook.price);
        notebook.checkPrice();

        Notebook heavyNotebook=new Notebook ("3000g", 2500);
        System.out.println(heavyNotebook.weight+ "" +heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook= new Notebook ("1200g", 900);
        System.out.println(oldNotebook.weight + "" +oldNotebook.price);
        oldNotebook.checkPrice();


    }
}