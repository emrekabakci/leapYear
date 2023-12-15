import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Year variable defined.
        int year;

        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Please enter the year : ");
        year = inp.nextInt();

        //Leap year calculated and printed.
        if (year % 100 == 0){

            if (year % 400 == 0){

                System.out.println(year + " is a leap year.");

            }else {

                System.out.println(year + " is not a leap year.");

            }
        } else if (year % 4 == 0) {

            System.out.println(year + " is a leap year.");

        }else {

            System.out.println(year + " is not a leap year");

        }
    }
}