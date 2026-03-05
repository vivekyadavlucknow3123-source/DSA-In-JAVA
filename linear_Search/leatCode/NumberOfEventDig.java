package linear_Search.leatCode;

public class NumberOfEventDig {
    static void main() {
        int[] arr={12,345,2,6,7896};
        System.out.println(Degitcount(arr));


    }
    //count dedits of array element
    static int Degitcount(int[] arr){
        int count=0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //check even or not
    static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }


}
