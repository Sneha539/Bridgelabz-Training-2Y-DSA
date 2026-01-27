package ArrayLevel1;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num < 0) {
                System.out.println("Number " + num + " is Negative");
            } else if (num == 0) {
                System.out.println("Number is Zero");
            } else { // Positive
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            }
        }

        // Compare first and last
        int first = arr[0];
        int last = arr[arr.length - 1];

        if (first == last) {
            System.out.println("First element (" + first + ") is equal to Last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than Last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than Last element (" + last + ").");
        }

        input.close();
    }
}
