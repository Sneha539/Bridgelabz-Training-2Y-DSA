package StringsLevel1;
import java.util.*;

public class Ques2 {
    public static void main(String[] z) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        String ss = "";

        for (int i = i1; i <i2 ; i++) {
            ss+=s1.charAt(i);
        }
    }
}
