/*
 * Codeforces 200B - Drinks
 * Calculate the percentage of orange juice in the final drink mixture.
 * Read the percentage of orange juice in each drink and find their total sum.
 * Divide the total percentage by the number of drinks to get the average percentage.
 * Use double division to maintain decimal precision in the final answer.
 */
package Arrays;

import java.util.Scanner;

public class CF_200B {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double originalVal=n;
        int ans=0;
        while(n--!=0){
            int num=sc.nextInt();
            ans+=num;
        }
        double result = (double) ans / originalVal;
        System.out.println(result);
    }
}
