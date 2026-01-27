import java.util.*;
import java.util.Scanner;
import java.util.HashSet;
public class StringBuilderRemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }
        System.out.println(sb.toString());
    }
}
