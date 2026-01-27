package StringsLevel1;
import java.util.*;

public class Ques1 {
    public static void main(String[] z){
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();

        if(s1.length()==s2.length()) {
            boolean same = true;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    same = false;
                    break;
                }
            }
            System.out.println("Comparison using charAt(): " + same);
        }
        else{
            System.out.println("Comparison using charAt(): false");
        }
        System.out.println("Comparison using equals(): " + s1.equals(s2));
    }
}
// boolean resultEquals = s1.equals(s2);
