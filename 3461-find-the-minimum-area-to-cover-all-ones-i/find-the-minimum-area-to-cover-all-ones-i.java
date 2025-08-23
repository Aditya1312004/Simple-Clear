class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int height = 0;
        int width = 0;
        int rmin = m;
        int rmax = -1;
        int cmin = n;
        int cmax = -1;
        for(int r = 0;r<m;++r){
            for(int c = 0;c<n;++c){
                if(grid[r][c] == 1){
                    rmin = Math.min(rmin , r);
                    rmax = Math.max(rmax , r);
                    cmin = Math.min(cmin , c);
                    cmax = Math.max(cmax , c);

                }


            }
            height = cmax - cmin +1;
            width = rmax - rmin +1;

        }
        return height * width;
    }
}