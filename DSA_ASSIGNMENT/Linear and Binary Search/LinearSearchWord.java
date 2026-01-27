import java.util.*;
public class LinearSearchWord {
    public static void main(String[] args) {
        String[] sentences = {"Java is good","I love coding","DSA is important"};
        String word = "coding";
        String result = "Not Found";

        for(String s: sentences){
            if(s.contains(word)){
                result = s;
                break;
            }
        }
        System.out.println(result);
    }
}
