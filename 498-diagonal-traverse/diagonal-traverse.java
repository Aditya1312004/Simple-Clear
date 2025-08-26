class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length == 0){
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
      
        int row =0;
        int col = 0;
        boolean up =true;
        int[] arr= new int[m*n];
       for(int i= 0;i< m*n;i++){
        arr[i] = mat[row][col];
        if(up){
            if(col== n-1){
                row++;
                up = false;
            }
            else if(row == 0){
                col++;
                up = false;

            }
            else{
                row--;
                col++;
            }
        }
        else{
            if(row == m-1){
                col++;
                up =true;
            }
            else if(col == 0){
                row++;
                up = true;
            }
            else{
                row++;
                col--;
            }
        }
      
       }
       return arr;
    }
}