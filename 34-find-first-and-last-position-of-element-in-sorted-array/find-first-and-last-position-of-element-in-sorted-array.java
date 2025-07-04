class Solution {
    public int[] searchRange(int[] nums, int target) {
       

      
    
       int lefto  = binarysearch( nums,target,true);
       int righto = binarysearch(nums,target,false);

       return new int[]{lefto,righto};
    }

private int binarysearch(int[] nums,int target , boolean leftbias){
       int left =0;
       int right= nums.length-1;
       
       int index=-1;
       while(left<=right){
        int middle = left+(right-left)/2;
        if(nums[middle] == target){
            index =middle;
            if(leftbias){
            right = middle-1;
            }
            else{
                left = middle+1;
            }

        }
        else if(nums[middle]> target){
            right = middle-1;
        }
        else{
            left = middle+1;
        }
       }
        return index;
       
       }
} 
    
