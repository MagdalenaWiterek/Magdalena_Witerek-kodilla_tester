package DwaSiedemIDwaOsiem.ZadanieDwaOsiem;

import java.util.Scanner;

public class Colors {
    @org.jetbrains.annotations.NotNull
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first letter (B,Y, G ,P):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "Black" ;
                case "Y":
                    return "Yellow" ;
                case "G":
                    return "Green" ;
                case "P":
                    return "Pink" ;
                default:
                    System.out.println("Wrong color.Try again.");
            }
        }
    }
}

