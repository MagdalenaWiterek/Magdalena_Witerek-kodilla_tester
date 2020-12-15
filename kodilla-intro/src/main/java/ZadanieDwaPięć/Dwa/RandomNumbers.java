package ZadanieDwaPięć.Dwa;

import java.util.Random;

public class RandomNumbers {




    public static void main(String[] args) {

        int i = 1;
        int suma = 0;
        int min;
        int max;
        int a;
        Random r = new Random();
        min = r.nextInt(31);
        max = min;
        suma += max;

        do {
            a = r.nextInt(31);
            System.out.println(a + ",");
            if (max <= a) max = a;
            if (a <= min) min = a;
            suma += a;
            i++;
        } while (suma < 5000);
        System.out.println();
        System.out.println("Największa liczba to:" + max + ",");
        System.out.println("Najmniejsza liczba to: " + min + ",");

    }
    public static int maxNumber(int max){
        return max;

    }
    public static int minNumber(int min){
        return min;
    }
}





