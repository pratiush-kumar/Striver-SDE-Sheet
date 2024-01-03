import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int totalLength = mat.size()*mat.get(0).size();
        int left=0;
        int right = totalLength-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int row = mid/mat.get(0).size();
            int col = mid%mat.get(0).size();
            if(mat.get(row).get(col)==target){
                return true;
            }
            else if(mat.get(row).get(col)>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}
