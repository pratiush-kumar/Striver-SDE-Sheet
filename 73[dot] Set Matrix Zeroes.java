class Solution {
    public void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public void setZeroes(int[][] matrix) {
        int top = 1;
        int bottom = 1;
        int left = 1;
        int right = 1;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0]==0){
                left = 0;
            }
            if(matrix[i][matrix[0].length-1]==0){
                right = 0;
            }
        }
        for (int i=0; i<matrix[0].length; i++){
            if(matrix[0][i]==0){
                top = 0;
            }
            if(matrix[matrix.length-1][i]==0){
                bottom = 0;
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
        // printMatrix(matrix);
        for(int i=1; i<matrix.length; i++){
            for (int j=1; j<matrix[0].length; j++){
                if (matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        // printMatrix(matrix);
        if(top==0){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i]=0;
            }
        }
        // if(bottom==0){
        //     for(int i=0; i<matrix[0].length; i++){
        //         matrix[matrix.length-1][i]=0;
        //     }
        // }
        if(left==0){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0]=0;
            }
        }
        // if(right==0){
        //     for(int i=0; i<matrix.length; i++){
        //         matrix[i][matrix[0].length-1]=0;
        //     }
        // }
        return;
    }
}