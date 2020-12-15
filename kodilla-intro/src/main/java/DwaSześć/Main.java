package DwaSześć;

public class Main {

    public static void main(String[] args) {
        Application application = new Application("Adam", 40.5, 175);
        System.out.println(application.name+application.age+""+application.height);
        application.main();
    }
}



