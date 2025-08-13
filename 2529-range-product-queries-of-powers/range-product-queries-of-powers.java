class Solution {
    public int[] productQueries(int n, int[][] queries) {
        String bit = Integer.toBinaryString(n);

        int count = 0;
        int MOD= 1000000007;
        List<Integer> as = new ArrayList<>();
        for(int i=bit.length()-1;i>=0;i--){
            char c= bit.charAt(i);
            if(c == '1'){
                as.add((int) Math.pow(2 , bit.length() - i - 1));
            }
        }
        
        int[] ans = new int[queries.length];
        for(int[] range : queries){
            
            long product = 1;
            for(int i = range[0]; i <= range[1]; i++){
                product = (product * as.get(i))%MOD;
            }
            ans[count++] = (int) product;
        } 
        return ans;
    }
}