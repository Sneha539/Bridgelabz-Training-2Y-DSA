import java.util.*;

public class Counting_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++)
            ages[i] = sc.nextInt();

        int[] count = new int[9];

        for (int age : ages)
            count[age - 10]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0)
                ages[index++] = i + 10;
        }

        for (int age : ages)
            System.out.print(age + " ");
    }
}
