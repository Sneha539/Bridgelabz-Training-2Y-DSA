package ArrayLevel1;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0.0;
        int i = 0;

        while (true){
            System.out.print("Enter Number : ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }
            if (i == 10) {
                break;
            }

            arr[i] = num;
            i++;
        }

        for (int n = 0; n < i; n++) {
            sum += arr[n];
            System.out.println("Number " + (i + 1) + ": " + arr[i]);
        }

        System.out.println("Total = " + sum);
    }

}
