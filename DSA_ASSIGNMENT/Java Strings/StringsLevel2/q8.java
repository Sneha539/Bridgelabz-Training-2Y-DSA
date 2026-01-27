package StringsLevel2;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of student " + (i + 1) + ":");
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " has invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " can vote");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote");
            }
        }
    }
}
