class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i== 0 || j == 0 ){
                    List<Integer> as = new ArrayList<>();
                    int r = i;
                    int c = j;

                    while(r<m && c <n){
                        as.add(grid[r][c]);
                        r++;
                        c++;

                    }

                
                if(j == 0 ){
                    Collections.sort(as , Collections.reverseOrder());
                }
                else{
                    Collections.sort(as);
                }
                 r = i;
                c = j;
                int it = 0;
                while(r< m && c < n){
                    grid[r][c] = as.get(it);
                    r++;
                    c++;
                    it++;
                }
               
                }
            }
        }
        return grid;
    }
}