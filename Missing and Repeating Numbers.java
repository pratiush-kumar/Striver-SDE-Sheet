import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        long arraySum = 0;
        long arraySquareSum = 0;
        long nSum = 0;
        long nSquareSum = 0;
        for(int i=0;i<arr.size(); i++){
            arraySum+=arr.get(i);
            arraySquareSum+=(arr.get(i)*arr.get(i));
            nSum += i+1;
            nSquareSum += (i+1)*(i+1);
        }
        long sumDiff = nSum-arraySum;
        long squareDiff = nSquareSum-arraySquareSum;
        long xplusy = squareDiff/sumDiff;
        int[] ans=new int[2];
        ans[0] = (int)(sumDiff+xplusy)/2;
        ans[1] = (int)(xplusy-sumDiff)/2;
        return ans;
    }
}