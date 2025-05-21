class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        HashMap<Integer , Integer> as  = new HashMap<>();
        
        int ans = Integer.MAX_VALUE;
        int max =0;
        for(int i=0;i<divisors.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] % divisors[i] == 0){
                    as.put(divisors[i] , ++count);
                }
            }
        }
        if(as.isEmpty()){
            for(int num:divisors){
                if(num<ans){
                    ans = num;
                }
            }
            return ans;
        }
        for(int key : as.keySet()){
            if(as.get(key)>max){
                max = as.get(key);
            }
        }
        for(int key : as.keySet()){
            if(as.get(key) == max){
                if(key < ans)
                    ans = key;
            }
        }
        return ans;
    }
}