package linear_Search.leatCode;
class MaximumWealth {
    static void main() {
        int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}

        };
        System.out.println("maximumWealt " + SumOfArr(arr));

    }


    static int SumOfArr(int[][] row) {
        int max = Integer.MIN_VALUE;

        for (int[] num : row) {
            int sum = 0;
            for (int element : num) {
                sum += element;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}