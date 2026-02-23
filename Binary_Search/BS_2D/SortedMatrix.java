package Binary_Search.BS_2D;

import java.util.Arrays;

public class SortedMatrix {
    static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
           if(matrix[row][mid]<target){
               cStart=mid+1;

           }
           else {
               cEnd=mid-1;
           }
        }
        return new int[]{-1,-1};

    }
    static int[] search(int[][] mtrix,int target){
        int row=mtrix.length;
        int col=mtrix[0].length;
        if(row==1){
            return binarySearch(mtrix,0,0,col-1,target);
        }
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        while(rStart< (rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if (mtrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (mtrix[mid][cMid] < target) {
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        if(mtrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(mtrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        if(target<=mtrix[rStart][cMid-1]){
            return binarySearch(mtrix,rStart,0,cMid-1,target);
        }
        if(target>=mtrix[rStart][cMid+1]){
            return binarySearch(mtrix,rStart,cMid+1,col-1,target);

        }
        if(target<=mtrix[rStart+1][cMid-1]){
            return binarySearch(mtrix,rStart,0,cMid-1,target);
        }
        else {
            return binarySearch(mtrix,rStart,cMid+1,col-1,target);

        }
    }

}
