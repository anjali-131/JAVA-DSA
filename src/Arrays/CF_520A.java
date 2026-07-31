package Arrays;
import java.util.*;

public class CF_520A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next().toLowerCase();
        if(n<26){
            System.out.println("NO");
            return;
        }
        HashSet<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        System.out.println(set.size()==26?"YES":"NO");
        sc.close();
    }
}
