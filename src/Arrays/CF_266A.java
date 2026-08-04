/*
Problem: Codeforces 266A - Stones on the Table

Approach:
- Traverse the string once.
- Compare each character with the next character.
- If both are equal, increment the removal count.
- Print the total count.

Time Complexity: O(n)
Space Complexity: O(1)
*/
package Arrays;

import java.util.Scanner;

public class CF_266A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);

    }
}
