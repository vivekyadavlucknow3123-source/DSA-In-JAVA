package linear_Search;

import java.util.Arrays; // 1. Added import for Arrays
import java.util.Scanner;

public class minInArr {

    // 2. Added main method: All executable logic must be inside a method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.print("Enter target number: "); // Optional: Helps user know input is waiting
        int target = input.nextInt();

        int[] ans = search(arr, target);

        // 3. Fixed Print statement: Use Arrays.toString() to print the contents
        System.out.println(Arrays.toString(ans));
        int max= max(arr);
        System.out.println(max);
    }

    // 4. Fixed return type: Changed from int[][] to int[]
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] Ints: arr){
            for(int element:Ints){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}