/*
Problem: Codeforces 144A - Arrival of the General

Approach:
1. Find the first occurrence of the tallest soldier.
2. Find the last occurrence of the shortest soldier.
3. Calculate the swaps needed to move the tallest to the front.
4. Calculate the swaps needed to move the shortest to the end.
5. If the tallest soldier is after the shortest soldier,
   subtract one because moving the tallest shifts the shortest left.

Time Complexity: O(n)
Space Complexity: O(1)
*/
package Sorting;

import java.util.Scanner;

public class CF_144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int maxIdx=0;
        int minIdx=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIdx=i;

            }
            if(arr[i]<=min){
                min=arr[i];
                minIdx=i;
            }
        }
        int origMaxId=maxIdx;
        int swap=0;
        while(maxIdx>0){
            int temp=arr[maxIdx];
            arr[maxIdx]=arr[maxIdx-1];
            arr[maxIdx-1]=temp;
            maxIdx--;
            swap++;
        }
        if(minIdx<origMaxId){
            minIdx++;
        }
        while(minIdx<n-1){
            int temp=arr[minIdx];
            arr[minIdx]=arr[minIdx+1];
            arr[minIdx+1]=temp;
            minIdx++;
            swap++;
        }
        System.out.println(swap);
    }
}