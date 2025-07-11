class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> as = new Stack<>();
        Map<Integer , Integer> po = new HashMap<>();
        
        for(int i=nums2.length-1;i>=0;i--){
            int num = nums2[i];
            while(!as.isEmpty() && nums2[i] >= as.peek()){
                as.pop();
            }
            if(as.isEmpty() ){
                po.put(num , -1);
            }

            else{
                po.put(num , as.peek());
            }
            as.push(num);
        }
        int result[] = new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            result[j] = po.get(nums1[j]);
        }
        return result;
    }
}