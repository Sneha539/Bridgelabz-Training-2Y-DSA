package StringsLevel1;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        int invalidIndex = text.length();
        try {
            System.out.println("Character at invalid index: " + text.charAt(invalidIndex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Tried to access index " + invalidIndex +
                    " but valid range is 0 to " + (text.length() - 1));
        }
    }
}
