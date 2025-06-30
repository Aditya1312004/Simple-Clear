class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer , Integer> as = new HashMap<>();

        for(int num : nums){
            as.put(num , as.getOrDefault(num , 0) + 1);
        }

        int count = 0;
        for(int key : as.keySet()){
            if(as.containsKey(key+1)){
                int sum = as.get(key) + as.get(key+1);
                count= Math.max(count , sum);
            }
        }
        return count;
    }
}