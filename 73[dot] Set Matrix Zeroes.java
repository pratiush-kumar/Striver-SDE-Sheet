class Solution {

    public void setZeroes(int[][] matrix) {
        int top = 1;
        int left = 1;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0]==0){
                left = 0;
            }
        }
        for (int i=0; i<matrix[0].length; i++){
            if(matrix[0][i]==0){
                top = 0;
            }
        }
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++){
            for (int j=1; j<matrix[0].length; j++){
                if (matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(top==0){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i]=0;
            }
        }
        if(left==0){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0]=0;
            }
        }
        return;
    }
}