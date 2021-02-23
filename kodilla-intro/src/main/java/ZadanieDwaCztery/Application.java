package ZadanieDwaCztery;


import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.add(6);
        grades.add(4);
        grades.add(5);
        grades.add(3);
        grades.add(2);
        grades.add(3);
        grades.add(5);



        System.out.println(Arrays.toString(grades.grades));
        grades.lastAddedGrades();
        System.out.println("Ostatnio dodaną oceną jest:"+grades.lastAddedGrades());

        grades.getAverage();
        System.out.println("Średnia ocen wynosi:"+grades.getAverage());



    }




    }



