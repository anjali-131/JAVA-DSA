/*
Problem: Codeforces 339A - Helpful Maths

Approach:
1. Extract all digits from the input string.
2. Store them in an ArrayList.
3. Sort the list using Collections.sort().
4. Reconstruct the expression by joining the sorted digits with '+'.

Time Complexity: O(n + k log k)
Space Complexity: O(k)
*/
package Sorting;

import java.util.*;

public class CF_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if(i<list.size()-1){
                sb.append('+');
            }
        }
        System.out.println(sb.toString());
    }
}
