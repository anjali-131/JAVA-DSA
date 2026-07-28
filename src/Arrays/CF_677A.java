/*
 * Codeforces 677A - Vanya and Fence
 * Calculate the minimum width required for all friends to pass through the fence.
 * Read the height of each friend and compare it with the fence height.
 * Friends with height greater than the fence need 2 units of width, otherwise 1 unit.
 * Add the required width for each friend and print the total fence width needed.
 */
package Arrays;

import java.util.Scanner;

public class CF_677A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), h=sc.nextInt();
        int[] arr=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<=h){
                ans+=1;
            }else{
                ans+=2;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
