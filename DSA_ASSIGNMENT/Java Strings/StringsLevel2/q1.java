package StringsLevel2;
import java.util.Scanner;

public class q1 {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] chars = text.toCharArray();
        int len = 0;
        for (char c : chars) {
            len++;
        }
        System.out.println("Length: " + len);
    }
}
