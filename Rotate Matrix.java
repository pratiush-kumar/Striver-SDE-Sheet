import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateShell(ArrayList<ArrayList<Integer>> mat, int topRow, int bottomRow, int leftCol, int rightCol){
        if(topRow>=bottomRow || leftCol>=rightCol){
            return;
        }
        int rightTopCorner = mat.get(topRow).get(rightCol);
        int leftTopCorner = mat.get(topRow).get(leftCol);
        int rightBottomCorner = mat.get(bottomRow).get(rightCol);
        int leftBottomCorner = mat.get(bottomRow).get(leftCol);
        
        // top Row R->L 
        for(int i=rightCol; i>leftCol; i--){
            mat.get(topRow).set(i, mat.get(topRow).get(i-1));
        }
        
        // right Col B->T
        for(int i=bottomRow; i>topRow; i--){
            mat.get(i).set(rightCol, mat.get(i-1).get(rightCol));
        }

        // bottom Row L->R
        for(int i=leftCol; i<rightCol; i++){
            mat.get(bottomRow).set(i, mat.get(bottomRow).get(i+1));
        }

        // left Col T->B
        for(int i=topRow; i<bottomRow; i++){
            mat.get(i).set(leftCol, mat.get(i+1).get(leftCol));
        }

        mat.get(topRow+1).set(rightCol, rightTopCorner);
        mat.get(bottomRow).set(rightCol-1, rightBottomCorner);
        mat.get(bottomRow-1).set(leftCol, leftBottomCorner);
        mat.get(topRow).set(leftCol+1, leftTopCorner);
        rotateShell(mat, topRow+1, bottomRow-1, leftCol+1, rightCol-1);
        return;
    }
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        rotateShell(mat, 0, n-1, 0, m-1);
        return;
    }
}
