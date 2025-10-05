class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        HashMap<Integer , Integer> as = new HashMap<>();
        as.put(0,-1);
        int sum =0;
        int length = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if(as.containsKey(sum)){
                length = Math.max(length , i-as.get(sum));
            }
            else{
                as.put(sum , i);
            }
        }
        return length;
    }
}

// Brute FOrce
// int count0 = 0;
// int count1 =0 ;
// int maxlen = 0;
// for(int i=0;i<nums.length;i++){
//     for(int j = i;j<nums.length;j++){
//         if(nums[j] == 0){
//             count0++;
//         }
//         else{
//             count1++;
//         }

//     }
//     if(count0 == count1){
//         maxlen = Math.max(len , j-i+1);
//     }
// }
