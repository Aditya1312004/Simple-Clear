class Solution {
    public int totalFruit(int[] nums) {
        int left = 0;
        int max =0 ;
        HashMap<Integer , Integer> as = new HashMap<>();
        for(int right = 0;right<nums.length;right++){
            as.put(nums[right] , as.getOrDefault(nums[right] , 0)+1 );
        

        while(as.size() > 2){
            int leftp  = nums[left];
            as.put(leftp, as.get(leftp)-1);
            if(as.get(leftp) == 0 ){
                as.remove(leftp);
            }   
            left++;
        }
        max = Math.max(max , right - left+1);
        }
        return max;
    }
}