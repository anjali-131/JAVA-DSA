/*
 * Codeforces 427A - Police Recruits
 * Simulate the arrival of police officers and crime reports throughout the year.
 * Keep track of available police officers using a counter.
 * If a crime occurs when no officer is available, increase the untreated crimes count.
 * Calculate and print the total number of crimes that could not be handled.
 */
package Arrays;

import java.util.Scanner;

public class CF_427A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r =0;
        int u=0;
        while (n--!=0){
            int val=sc.nextInt();
            if(val>0){
                r +=val;
            }
            else if(val== -1 && r==0){
                u++;
            }
            else{
                r--;
            }
        }
        System.out.println(u);
    }
}
