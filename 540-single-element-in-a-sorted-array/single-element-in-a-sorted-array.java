class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n = nums.length;

      if(n==1) return nums[0];
      if(nums[0] != nums[1]) return nums[0];
      if(nums[n-1] != nums[n-2]) return nums[n-1];
        int start = 1;
        int high = n-2;
        while(start<=high){
            int middle = start+(high-start)/2;
            if(nums[middle] != nums[middle-1] && nums[middle] != nums[middle+1]){
                return nums[middle];
        }
        if(nums[middle] == nums[middle-1] ){
            int leftsize = middle-1;
            if(leftsize % 2 == 0 ){
                start = middle+1;
            }
            else{
                high = middle -1;
            }
        }

        if(nums[middle] == nums[middle+1]){
            int leftsize = middle;
            if(leftsize % 2 == 0 ){
                start = middle +2;
            }
            else{
                high = middle -1;
            }
        }
        }
        return -1;
    }
}