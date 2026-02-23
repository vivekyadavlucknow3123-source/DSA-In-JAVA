package Binary_Search;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=input.nextInt();
        int ans=BS(arr,target);
        System.out.println(ans);

    }
   //return index
    //return -1 if it dosenot exit
    static int BS(int[] arr,int target) {
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           //find the midle element
           //int mid=(start+end)/2; //it may be give error for large value
           int mid=start+(end-start)/2;
           if(target<arr[mid]){  //if array in acsending orger then condition become {(target>arr[mid]}
               end=mid-1;
           } else if (target > arr[mid]) { //if array in acsending orger then condition become {(target<arr[mid]}
               start=mid+1;
           }
           else {
               //ans found
               return mid;
           }
       }
       return -1;
    }
}
