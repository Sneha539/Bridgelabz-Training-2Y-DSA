import java.util.*;
public class StringBufferVsBuilder {
    public static void main(String[] args) {
        int n = 1000000;

        long start = System.nanoTime();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<n;i++){
            sb1.append("hello");
        }
        long end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end-start));

        start = System.nanoTime();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<n;i++){
            sb2.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end-start));
    }
}
