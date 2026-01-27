package StringsLevel1;
import java.util.*;

public class Ques9 {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char) (ch - 32);
            manual += ch;
        }

        String builtin = text.toUpperCase();

        boolean same = true;
        if (manual.length() != builtin.length()) same = false;
        else {
            for (int i = 0; i < manual.length(); i++) {
                if (manual.charAt(i) != builtin.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }
        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtin);
        System.out.println("Equal? " + same);
    }
}