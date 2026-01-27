import java.util.*;

public class Selection_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++)
            scores[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[min])
                    min = j;
            }
            int temp = scores[min];
            scores[min] = scores[i];
            scores[i] = temp;
        }

        for (int s : scores)
            System.out.print(s + " ");
    }
}
