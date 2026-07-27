/*
 * Codeforces 263A - Beautiful Matrix
 * Read a 5x5 matrix and find the position of the number 1.
 * Store its row and column index for further calculation.
 * These indices are later used to find the minimum moves needed
 * to bring 1 to the center of the matrix.
 */
package Arrays;
import java.util.Scanner;
public class CF_263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int row = 0;
        int column = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(Math.abs(row-2)+Math.abs(column-2));
    }
}
