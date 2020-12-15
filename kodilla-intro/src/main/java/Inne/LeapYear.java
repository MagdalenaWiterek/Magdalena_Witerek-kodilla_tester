package Inne;

public class LeapYear {
    public static void main(String[] args) {
        int numberOfDaysInYear = 365;
        if ((numberOfDaysInYear % 4) == 1) {
            System.out.println("They year is not leap");
        } else if ((numberOfDaysInYear % 100) == 1 && (numberOfDaysInYear % 400) == 0) {
            System.out.println("The year is leap");
        } else {
            System.out.println("The year is leap");
        }
        if ((numberOfDaysInYear % 400) == 1) {
            System.out.println("They year is not leap");

        }
    }
}