package StringsLevel2;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        int wordCount = 1;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') wordCount++;
        String[] manual = new String[wordCount];
        int start = 0, w = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                manual[w++] = word;
                start = i + 1;
            }
        }

        String[] builtin = text.split(" ");

        System.out.print("Manual: [");
        for (int i = 0; i < manual.length; i++) {
            System.out.print(manual[i]);
            if (i < manual.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.print("Built-in: [");
        for (int i = 0; i < builtin.length; i++) {
            System.out.print(builtin[i]);
            if (i < builtin.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}