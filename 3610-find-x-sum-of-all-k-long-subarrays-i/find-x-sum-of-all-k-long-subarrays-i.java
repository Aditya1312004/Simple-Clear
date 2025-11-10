class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        
        int[] ans = new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            int sum = 0;
            int count = 0;
            HashMap<Integer , Integer> as = new HashMap<>();
            for(int j=i;j<i+k;j++){
                as.put(nums[j] , as.getOrDefault(nums[j] , 0)+1);
            }
            List<int[]> lk = new ArrayList<>();
            for(Map.Entry<Integer , Integer> jh : as.entrySet()){
                lk.add(new int[]{jh.getKey() , jh.getValue()});
}
            lk.sort((a,b) -> {
                if(b[1] != a[1] ) return b[1] - a[1];
                return b[0] - a[0];
            });
        
            for(int[] o : lk){
                if(count == x){
                    break;
                }
                sum += o[0] * o[1];
                count++;
            }
            ans[i] = sum;

        }
        return ans;
    }
}