import java.util.*;

public class NumberSort {
    public static void main(String[] args) {
        //instantiate scanner input class
        Scanner input = new Scanner(System.in);
        // prompt user to enter three numbers
        System.out.println("Please enter three numbers.");
        // number inputs
        System.out.print("Enter 1st number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter 3rd number: ");
        double num3 = input.nextDouble();
        // use method to sort numbers
        displaySortedNumbers(num1, num2, num3);

        input.close();
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // store the three numbers into an array
        double[] numbers = {num1, num2, num3};
        // sort the numbers in increasing order
        Arrays.sort(numbers);
        // DISPLAY results
        System.out.printf("Numbers in increasing order: %.2f, %.2f, %.2f%n", numbers[0], numbers[1], numbers[2]);
    }
}
