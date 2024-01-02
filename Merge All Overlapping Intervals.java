import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
        ArrayList<List<Integer>> ans =  new ArrayList<List<Integer>>();
        ArrayList<Integer> entry = new ArrayList<Integer>();
        entry.add(arr[0][0]);
        entry.add(arr[0][1]);

        for(int i=0; i< arr.length; i++){
            if(arr[i][0]>entry.get(1)){
                ans.add(entry);
                entry = new ArrayList<Integer>();
                entry.add(arr[i][0]);
                entry.add(arr[i][1]);
            }
            else{
                if(arr[i][1]>entry.get(1)){
                    entry.set(1, arr[i][1]);
                }
            }
        }
        ans.add(entry);
        return ans;
    }
}