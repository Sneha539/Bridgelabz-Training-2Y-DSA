import java.util.*;

public class Heap_sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = n / 2 - 1; i >= 0; i--) {
            int root = i;
            while (2 * root + 1 < n) {
                int child = 2 * root + 1;
                if (child + 1 < n && arr[child] < arr[child + 1])
                    child++;
                if (arr[root] < arr[child]) {
                    int t = arr[root];
                    arr[root] = arr[child];
                    arr[child] = t;
                    root = child;
                } else break;
            }
        }

        for (int i = n - 1; i > 0; i--) {
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;

            int root = 0;
            while (2 * root + 1 < i) {
                int child = 2 * root + 1;
                if (child + 1 < i && arr[child] < arr[child + 1])
                    child++;
                if (arr[root] < arr[child]) {
                    t = arr[root];
                    arr[root] = arr[child];
                    arr[child] = t;
                    root = child;
                } else break;
            }
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}
