import java.util.* ;
import java.io.*; 
public class Solution {
    public static void printmatrix(ArrayList<ArrayList<Integer>> matrix){
        for(int i=0; i<matrix.size(); i++){
            for(int j=0; j<matrix.get(i).size(); j++){
                System.out.print(matrix.get(i).get(j));
            }
            System.out.println("");
        }
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        boolean leftColumnIsZero = false;
        for(int i=0; i<matrix.size(); i++){
            if(matrix.get(i).get(0)==0){
                leftColumnIsZero=true;
            }
        }

        boolean topRowIsZero = false;
        for(int i=0; i<matrix.get(0).size(); i++){
            if(matrix.get(0).get(i)==0){
                topRowIsZero = true;
            }
        }

        for(int i=0; i< matrix.size(); i++){
            for(int j=0; j<matrix.get(i).size(); j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(0).set(j, 0);
                    matrix.get(i).set(0,0);
                }
            }
        }

        // printmatrix(matrix);
        for(int i=1; i<matrix.size(); i++){
            for(int j=1; j<matrix.get(i).size(); j++){
                if(matrix.get(0).get(j)==0 || matrix.get(i).get(0)==0){
                    matrix.get(i).set(j,0);
                }
            }
        }

        if(leftColumnIsZero){
            for(int i=0; i<matrix.size(); i++){
                matrix.get(i).set(0,0);
            }
        }
        if(topRowIsZero){
            for(int i=0;i<matrix.get(0).size(); i++){
                matrix.get(0).set(i,0);
            }
        }
        return matrix;
    }
}

f