import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gals = 0;
        double mpg = 0;
        double gasPrice = 0;
        double costPer100Mi;
        double distanceLeft;
        boolean validCheck1 = false;
        boolean validCheck2 = false;
        boolean validCheck3 = false;

        do {
            System.out.print("Please enter the current number of gallons of gas you currently have: ");
            if (scan.hasNextDouble()) {
                gals = scan.nextDouble();
                scan.nextLine();
                if (gals >= 0) {
                    validCheck1 = true;
                } else {
                    System.out.println("You have entered an invalid number for gallons of gas.  Please enter a positive number.");
                }
            } else {
                scan.nextLine();
                System.out.println("You have entered an invalid number for gallons of gas.  Please enter a number.");
            }
        } while (!validCheck1);

        do {
            System.out.print("Please enter the fuel economy of your car in MPG: ");
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                scan.nextLine();
                if (mpg >= 0) {
                    validCheck2 = true;
                } else {
                    System.out.println("You have entered an invalid number for MPG.  Please enter a positive number.");
                }
            } else {
                scan.nextLine();
                System.out.println("You have entered an invalid number for MPG.  Please enter a number.");
            }
        } while (!validCheck2);

        do {
            System.out.print("Please enter the current gas price: ");
            if (scan.hasNextDouble()) {
                gasPrice = scan.nextDouble();
                scan.nextLine();
                if (gasPrice >= 0) {
                    validCheck3 = true;
                } else {
                    System.out.println("You have entered an invalid number for gas price.  Please enter a positive number.");
                }
            } else {
                scan.nextLine();
                System.out.println("You have entered an invalid number for gas price.  Please enter a number.");
            }
        } while (!validCheck3);

        costPer100Mi = mpg/gasPrice;
        distanceLeft = mpg*gals;

        System.out.printf("Cost per 100 miles in $: %12.2f", costPer100Mi);
        System.out.printf("\nDistance left in miles: %12.2f", distanceLeft);

    }
}