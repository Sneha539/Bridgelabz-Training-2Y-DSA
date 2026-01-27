package StringsLevel1;
import java.util.*;

public class Ques3 {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        char[] Array = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            Array[i] = s1.charAt(i);
        }

        char[] builtInArray = s1.toCharArray();

        System.out.print("User-defined char array: ");
        for (char c : Array) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in toCharArray():  ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}