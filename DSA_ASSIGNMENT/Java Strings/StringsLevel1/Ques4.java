package StringsLevel1;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] z) {
        try {
            String text = null;
            System.out.println("Length of text: " + text.length());
        } catch (Exception e) {
            System.out.println("This line will not run because exception is unhandled above.");
        }

        System.out.println("\nHandling NullPointerException:");
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Tried to call a method on a null object.");
        }
    }
}

