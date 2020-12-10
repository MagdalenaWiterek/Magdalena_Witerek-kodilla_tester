public class User {
    private String names;
    private int ages;

    public User(String names, int ages) {
        this.names = names;
        this.ages = ages;
    }

    public String getNames() {
        return names;
    }

    public int getAges() {
        return ages;
    }


    public static void main(String[] args) {
        User betty = new User("Betty", 20);
        User meg = new User("Meg", 37);
        User jon = new User("Jon", 60);
        User marc = new User("Marc", 15);
        User eva = new User("Eva", 23);
        User pieter = new User("Pieter", 7);
        User[] user = {betty, meg, jon, marc, eva, pieter};
    }

    public Object sumAges(int[] user) {
        int result = 0;
        for (int i = 0; i < user.length; i++) {
            result = result + user[i];
        }
        int averages = result / 6;

        for (int i = 0; i < user.length; i++) {
            if (ages < averages) {
                System.out.println(names);
            }
        }
    }


}