package StringsLevel2;
import java.util.Scanner;

public class q3 {
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
        String[] words = new String[wordCount];

        int start = 0, w = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                words[w++] = word;
                start = i + 1;
            }
        }

        String[][] table = new String[wordCount][2];
        for (int i = 0; i < wordCount; i++) {
            int l = 0;
            try {
                while (true) {
                    words[i].charAt(l);
                    l++;
                }
            } catch (StringIndexOutOfBoundsException e) {
            }
            table[i][0] = words[i];
            table[i][1] = String.valueOf(l);
        }

        System.out.println("Word\tLength");
        for (int i = 0; i < wordCount; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
