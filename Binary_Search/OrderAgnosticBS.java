package Binary_Search;

public class OrderAgnosticBS {
    static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
        int ans=orgderAgnosicBS(arr,target);
        System.out.println(ans);
    }
    static int orgderAgnosicBS(int arr[],int target){
            int start=0;
            int end=arr.length-1;

            //find weather the array is sorted in ascending or descending
            boolean isAsc=arr[start]<arr[end];

            while(start<=end){
                //find the midle element
                //int mid=(start+end)/2; //it may be give error for large value
                int mid=start+(end-start)/2;
                 if(arr[mid]==target){
                     return mid;
                 }
                 if(isAsc){
                     if(target<arr[mid]){  //if array in acsending orger then condition become {(target>arr[mid]}
                         end=mid-1;
                     } else if (target > arr[mid]) { //if array in acsending orger then condition become {(target<arr[mid]}
                         start=mid+1;
                     }

                 }
                 else {
                     if(target>arr[mid]){  //if array in acsending orger then condition become {(target>arr[mid]}
                         end=mid-1;
                     } else if (target < arr[mid]) { //if array in acsending orger then condition become {(target<arr[mid]}
                         start=mid+1;
                     }

                 }
                 }

            return -1;
    }
}
