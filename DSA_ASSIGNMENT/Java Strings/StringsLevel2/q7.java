package StringsLevel2;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed += str.charAt(i);
        }
        System.out.println("Trimmed string: \"" + trimmed + "\"");
    }
}
