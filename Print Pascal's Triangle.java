import java.util.*;
public class Solution {
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] ans = new int[N][];

        ans[0] = new int[1];
        ans[0][0]=1;

        for(int i=1; i<N; i++){
            ans[i] = new int[i+1];
            ans[i][0] = 1;
            ans[i][i] = 1;
            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j-1]+ans[i-1][j];
            }
        }
        return ans;
    }
}