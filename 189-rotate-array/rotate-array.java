class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (nums == null || nums.length <= 1 || k == 0) return;
        k = k%n;
        if(k==0) return;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }
        
        public void reverse(int start,int end, int[] nums){
            while(start<end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
                start++;
            }
        }
    }
