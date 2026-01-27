package StringsLevel1;
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] z) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = input.nextInt();
        input.nextLine();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        try {
            System.out.println("Accessing invalid index: " + names[size]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Tried to access index "
                    + size + " but valid range is 0 to " + (size - 1));
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e);
        }
    }
}