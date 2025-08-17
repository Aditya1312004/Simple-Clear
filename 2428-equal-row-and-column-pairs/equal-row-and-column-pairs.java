class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> as = new HashMap<>();
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<n;j++){
                sb.append(grid[i][j]).append(",");

            }
            String a = sb.toString();
            as.put(a , as.getOrDefault(a , 0)+1);
        }
        int count = 0;
        for(int j = 0;j<n;j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                sb.append(grid[i][j]).append(",");
            }
            String b = sb.toString();
            count += as.getOrDefault(b , 0);
        }
        return count;
    }
}