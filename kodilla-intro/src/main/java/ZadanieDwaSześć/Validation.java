package ZadanieDwaSześć;

public class Validation {

    public static void main(String[] args) {
        User user = new User("Adam", 40.5, 175);
        System.out.println(user.name+ user.age+""+ user.height);
        user.main();
    }
}



