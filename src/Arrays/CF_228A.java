/*
 * Codeforces 228A - Is your horseshoe on the other hoof?
 * Read the colors of 4 horseshoes and find the number of duplicate colors.
 * Use HashSet to store only unique colors and automatically remove duplicates.
 * Calculate the required new horseshoes by subtracting unique colors from total 4.
 */
package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class CF_228A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        System.out.println(4-set.size());
    }
}
