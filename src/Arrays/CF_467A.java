/*
 * Codeforces 467A - George and Accommodation
 * Find the number of rooms where at least two people can still be accommodated.
 * Read the current number of people and the total room capacity for each room.
 * Check if the available space in the room is greater than or equal to 2.
 * Count and print the total number of suitable rooms.
 */
package Arrays;

import java.util.Scanner;

public class CF_467A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n--!=0){
            int p=sc.nextInt(),q=sc.nextInt();
            if(p+2 <= q){
                c++;
            }
        }
        System.out.println(c);
    }
}
