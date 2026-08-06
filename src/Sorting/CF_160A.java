/*
Problem: Codeforces 160A - Twins

Approach:
1. Calculate the total sum of all coins.
2. Sort the coins in ascending order.
3. Pick coins from the largest value.
4. Keep taking coins until my sum becomes greater than the remaining sum.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/
package Sorting;

import java.util.*;

public class CF_160A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int total=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        Arrays.sort(arr);

        int coin=0;
        int sum=0;
        for (int i = n-1; i >= 0; i--) {
            sum+=arr[i];
            coin++;
            total-=arr[i];
            if(sum>total){
                System.out.println(coin);
                return;
            }
        }


    }
}
