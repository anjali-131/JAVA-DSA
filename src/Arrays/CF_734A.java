/*
 * Codeforces 734A - Anton and Danik
 * Determine the winner by counting the number of games won by Anton and Danik.
 * Traverse the game results string and maintain separate counts for both players.
 * Compare the final scores to find the winner or declare a friendship if scores are equal.
 * Print the result based on the higher number of wins.
 */
package Arrays;

import java.util.Scanner;

public class CF_734A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int A=0;
        int D=0;
        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            if(ch=='A'){
                A++;
            }
            else{
                D++;
            }

        }
        if(A>D){
            System.out.println("Anton");
        } else if (D>A) {
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }
}
