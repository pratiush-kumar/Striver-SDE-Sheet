import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        // keep pointer at next Zero entry from start. Keep pointer at next two entry from end
        // when 0 is found, exchange pos with zeroPos value. change zeroPos value to 0. Dont increment pointer
        // when 1 is found, skip to next number
        // when 2 id found, exchange twoPos with this value and decrement twoPos.
        int zeroPos = 0;
        int twoPos = arr.length-1;
        int pos = 0;
        while(pos<=twoPos){
            if(pos<zeroPos){
                pos = zeroPos;
            }
            else if(arr[pos]==1){
                pos++;
            }
            else if(arr[pos]==0){
                arr[pos] = arr[zeroPos];
                arr[zeroPos] = 0;
                zeroPos++;
            }
            else if(arr[pos]==2){
                arr[pos] = arr[twoPos];
                arr[twoPos] = 2;
                twoPos--;
            }
        }
        return;
    }
}