package Binary_Search.BS_2D;

public class BS_2D {
    static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,58},
                {30,33,40,60}
        };
        int target=37;
        int[] ans=SearchInTwoD(arr,target);
        System.out.println(ans);

    }

    static int[] SearchInTwoD(int[][] arr, int target){
        int r=0;
        int c=arr.length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }

        }
        return new int[]{-1,-1};
    }

}
