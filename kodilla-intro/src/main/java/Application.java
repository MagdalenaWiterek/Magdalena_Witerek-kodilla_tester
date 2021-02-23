public class Application {
    String name = "Adam";
    double age = 40.5;
    double height = 178;

    public Application (String name,double age ,double height) {
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public static void main(String[] args) {
        Application person=new Application("Adam",40.5,178);

        if ( person.name != null) {
            if ( person.age> 30 && person.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}

