import java.util.Arrays;

public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int end1 = a.length-1;
        int start2 = 0;
        while(end1>=0 && start2<b.length && a[end1]>b[start2]){
            long temp = a[end1];
            a[end1] = b[start2];
            b[start2] =temp;
            end1--;
            start2++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return;
    }
}



import java.util.Arrays;

public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int length = a.length+b.length;
        int gap = (length/2) + (length%2);
        while(gap>0){
            int left = 0;
            int right = gap;
            while(right<length){
                if(left<a.length && right<a.length){
                    if(a[left]>a[right]){
                        long temp = a[left];
                        a[left] = a[right];
                        a[right] = temp;
                    }
                }
                else if(left<a.length){
                    if(a[left]>b[right-a.length]){
                        long temp = a[left];
                        a[left] = b[right-a.length];
                        b[right-a.length] = temp;
                    }
                }
                else{
                    if(b[left-a.length]>b[right-a.length]){
                        long temp = b[left-a.length];
                        b[left-a.length] = b[right-a.length];
                        b[right-a.length] = temp;
                    }
                }
                right++;
                left++;
            }
            if(gap==1){
                break;
            }
            gap = (gap/2)+(gap%2);
        }
        return;
    }
}