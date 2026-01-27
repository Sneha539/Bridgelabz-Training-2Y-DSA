import java.util.*;
public class Merge_sort{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int size =1;size<n;size *= 2){
            for(int left = 0; left < n-size ; left +=2 * size){
                int mid = left + size -1;
                int right = Math.min(left + 2* size-1, n-1);

                int[] temp = new int[right - left + 1];
                int i=left , j= mid +1 , k=0;

                while(i<= mid && j<=right)
                    temp[k++] = (arr[i] <= arr[j]) ? arr[i++] : arr[j++];

                while(i<=mid) temp[k++] = arr[i++];
                while(j<=right) temp[k++] = arr[j++];

                for(int m=0;m<temp.length;m++)
                    arr[left+m] = temp[m];
            }
        }
        for(int x : arr)
            System.out.print(x + " ");
    }
}