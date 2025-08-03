class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> as = new HashMap<>();

        for(int num : nums){
            as.put(num , as.getOrDefault(num , 0)+1);
        }
        List<Map.Entry<Integer , Integer>> po = new ArrayList<>(as.entrySet());

        po.sort((a, b) -> b.getValue() - a.getValue());

       int[] result = new int[k];
       for(int i=0;i<k;i++){
        result[i] = po.get(i).getKey();

       }   
    return result;
}
}