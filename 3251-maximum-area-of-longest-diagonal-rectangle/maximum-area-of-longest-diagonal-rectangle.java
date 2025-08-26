class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m = dimensions.length;
        int n = dimensions[0].length;
        double maxd = 0;
        int maxa = 0;
        for(int i=0;i<m;i++){
            int l = dimensions[i][0] ;
            int b = dimensions[i][1]; 
            double a = l * l + b * b;
            int area = dimensions[i][0] * dimensions[i][1];

            if(a > maxd){
                maxd = a;
                maxa = area;
            }
            else if(a == maxd && area > maxa){
                maxa = area;
            }
          
         


        }
        return maxa;
    }
}