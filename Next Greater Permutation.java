import java.util.*;
public class Solution {
    public static void reverseArray(List<Integer> A, int start){
        int end = A.size()-1;
        while(start<end){
            int temp = A.get(start);
            A.set(start, A.get(end));
            A.set(end, temp);
            start++;
            end--;
        }
        return;
    }
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        // right to left find the point where num[i]>num[i-1]
        // find the smallest number greater than num[i-1] from RHS and exhange with num[i-1]
        // reverse the RHS array to become small to large

        int breakpoint = 0;
        for(int i=A.size()-1; i>0; i--){
            if(A.get(i)>A.get(i-1)){
                breakpoint = i;
                break;
            }
        }

        if (breakpoint==0){
            // reverse the array and return
            reverseArray(A, 0);
            return A;
        }

        int exchangeIndex = breakpoint;
        for(int i=A.size()-1; i>breakpoint; i--){
            if(A.get(i)>A.get(breakpoint-1)){
                exchangeIndex = i;
                break;
            }
        }

        int temp = A.get(breakpoint-1);
        A.set(breakpoint-1,A.get(exchangeIndex));
        A.set(exchangeIndex, temp);
        reverseArray(A,breakpoint);
        return A;
    }
}