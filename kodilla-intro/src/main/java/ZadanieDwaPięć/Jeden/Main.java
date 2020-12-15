package ZadanieDwaPięć.Jeden;

public class Main {
    public static void main(String[] args) {
        User betty = new User("Betty", 20);
        User meg = new User("Meg", 37);
        User jon = new User("Jon", 60);
        User marc = new User("Marc", 15);
        User eva = new User("Eva", 23);
        User pieter = new User("Pieter", 7);
        User[] users = {betty, meg, jon, marc, eva, pieter};
       double average= getAverageAge(users);
       userAges(average,users);
    }
    public static double getAverageAge(User[] users){
        int result=0;
        for (int i=0; i<users.length; i ++){
            result=result+users[i].getAges();
        }
        double average=result/ users.length;
        return average;

    }
    public static void userAges(double average,User[]users){
        for(int i=0; i<users.length;i++){
            if (users[i].getAges()< average){
                System.out.println(users[i].getNames());
            }
        }
    }
}

