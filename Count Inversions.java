import java.util.* ;
import java.io.*; 
public class Solution {

    public static long merge(long[] arr, int start, int mid, int end){
        long[] temp = new long[end-start];
        int itr = 0;
        int itr1 = start;
        int itr2 = mid;
        long count = 0;
        while(itr<temp.length){
            if(itr1<mid && itr2<end){
                if(arr[itr1]<arr[itr2]){
                    temp[itr] = arr[itr1];
                    itr1++;
                }
                else{
                    temp[itr] = arr[itr2];
                    count += mid-itr1;
                    itr2++;
                }
            }
            else if(itr1<mid){
                temp[itr] = arr[itr1];
                itr1++;
            }
            else{
                temp[itr] = arr[itr2];
                itr2++;
            }
            itr++;
        }
        for(int i=0; i<temp.length; i++){
            arr[start+i] = temp[i];
        }
        return count;
    }
    public static long mergeSort(long[] arr, int start, int end){
        if(start>=end-1){
            return 0;
        }
        int mid = (start+end)/2;
        long count1 = mergeSort(arr, start, mid);
        long count2 = mergeSort(arr, mid, end);
        long count3 = merge(arr, start, mid, end);
        return count1+count2+count3;
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long count = mergeSort(arr, 0, n);
        return count;
    }
}