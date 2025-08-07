class Solution {
    public int maxOperations(int[] nums, int k) {
       List<Integer> as = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(as);
        int right = as.size()-1;
        int count = 0;
        int left = 0;
       while(left<right){
            int sum = as.get(left) + as.get(right);
            if(sum == k){
                as.remove(right);
               as.remove(left);
               count++;
               right -= 2;
               
               

            }
            else if(sum > k){
                right--;
            }
            else{
                left++;
            }
       }
       return count; 
    }
}