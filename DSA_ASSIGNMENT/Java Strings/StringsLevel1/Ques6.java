package StringsLevel1;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\nHandling IllegalArgumentException:");
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e);
        }
    }
}
