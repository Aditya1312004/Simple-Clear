class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> as  = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            int key = nums[i]; 
            as.put(key,as.getOrDefault(key,0)+1);
        }

        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : as.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        return result;
            }
}