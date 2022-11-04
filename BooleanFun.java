import java.util.Scanner;
public class BooleanFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int myAge = input.nextInt();

        System.out.println("Current age: " + myAge);

        //convert these into something more complete using if statements
        // System.out.println("Can rent a car: " + (myAge >= 25));
        if (myAge >= 25) {
            System.out.println("You can rent a car!");
        }
        else {
            System.out.println("You cannot rent a car :(");
        }

        if (myAge >= 65) {
            System.out.println("You can get a senior discount!");
        }
        else {
            System.out.println("Sorry, you are too young for a discount.");
        }

        if (myAge <= 12) {
            System.out.println("You can order from the children's menu!");
        }
        else {
            System.out.println("Sorry, you are too old to order from the children's menu");
        }

        int futureAge = myAge + 1;
        System.out.println("On your next birthday out you will be: " + futureAge); //complete this code, don't do math in sout

        //further modification: prompt user for input and then print what they are able to do based on their age
        //and print their age on their next birthd

    }
}

