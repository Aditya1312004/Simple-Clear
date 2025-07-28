class Solution {
    
    int max = 0;
    int count = 0;
    public int countMaxOrSubsets(int[] nums) {  

        backtrack(nums , 0 , 0);
        return count;
    }
        void backtrack(int[] nums , int index ,int curr ){
            if(index == nums.length){
                if(curr == max){
                    count++;
                }
                else if(curr> max) {
                    max = curr;
                    count = 1;
                }
                return;
            }
        backtrack(nums , index+1 , curr |nums[index] );

        backtrack(nums , index+1 , curr);
            
        }

      
        
    }
