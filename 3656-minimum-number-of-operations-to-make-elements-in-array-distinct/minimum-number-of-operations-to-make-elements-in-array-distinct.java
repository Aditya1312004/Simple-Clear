class Solution {
    public int minimumOperations(int[] nums) {
        
        List<Integer> al = new ArrayList<>();
        for(int num : nums){
            al.add(num);
        }
    int count = 0;

    while(true){
        Set<Integer> po = new HashSet<>(al);
        if(al.size() == po.size()) break;

        int reduce = Math.min(3,al.size());
        for(int j=0;j<reduce;j++){
            al.remove(0);
        }
        count++;

    }
    return count;
    }

}