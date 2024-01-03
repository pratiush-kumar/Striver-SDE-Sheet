import java.util.* ;
import java.io.*; 
public class Solution {
	public static int numberOfPaths(int[][] matrix, int x, int y, int m, int n){
		if(matrix[x][y]!=0){
			return matrix[x][y];
		}
		
		int pathCount = 0;
		if(x==m-1||y==n-1){
			pathCount=1;
		}
		else{
			pathCount += numberOfPaths(matrix, x+1, y, m, n);
			pathCount += numberOfPaths(matrix, x, y+1, m, n);
		}
		matrix[x][y]=pathCount;
		return pathCount;
	}
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int[][] matrix = new int[m][n];
		matrix[m-1][n-1]=1;
		return numberOfPaths(matrix, 0, 0, m, n);
	}
}