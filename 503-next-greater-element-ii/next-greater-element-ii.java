class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> as = new Stack<>();

        int result[] = new int[nums.length];
        int n = nums.length;

        for(int i=2*n-1;i>=0;i--){
            int current = nums[i%n];

            while(!as.isEmpty() && current >= as.peek()){
               as.pop();
            


            }
            if(i<n){
                result[i] = as.isEmpty() ? -1 : as.peek();
                
            }
            as.push(current);
        }
        return result;
    }
}