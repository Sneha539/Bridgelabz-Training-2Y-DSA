import java.util.*;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] stackL = new int[n];
        int[] stackH = new int[n];
        int top = -1;

        stackL[++top] = 0;
        stackH[top] = n - 1;

        while (top >= 0) {
            int high = stackH[top];
            int low = stackL[top--];

            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

            int t = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = t;

            int p = i + 1;

            if (p - 1 > low) {
                stackL[++top] = low;
                stackH[top] = p - 1;
            }
            if (p + 1 < high) {
                stackL[++top] = p + 1;
                stackH[top] = high;
            }
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}
