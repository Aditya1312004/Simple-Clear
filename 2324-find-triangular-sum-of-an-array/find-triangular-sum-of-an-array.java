class Solution {
    public int triangularSum(int[] nums) {
      List<Integer> as = new ArrayList<>();
    for(int num : nums){
        as.add(num);
    }
    int sum = 0;
    if(nums.length == 1){
        return nums[0];
    }
    while(as.size() > 1){
      
    ArrayList<Integer> p = new ArrayList<>();
      for(int i=0;i<as.size() -1;i++){  
        sum = 0;
        sum += (as.get(i) + as.get(i+1) )%10;
        p.add(sum);
      }
      as = p;

    }
    return sum;
    }
}