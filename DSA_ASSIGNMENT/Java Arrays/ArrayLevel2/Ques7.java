package ArrayLevel2;
import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            double w = input.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (m): ");
            double h = input.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
                continue;
            }

            double bmi = w / (h * h);

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.1f\t%.2f\t%.1f\t%s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
