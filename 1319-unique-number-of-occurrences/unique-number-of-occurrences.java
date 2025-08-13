class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> as = new HashMap<>();
        for(int num : arr){
            as.put(num , as.getOrDefault(num , 0)+1);
        }
        HashSet<Integer> po = new HashSet<>();
        for(int k : as.values()){
            if(po.contains(k)){
                return false;
            }
            po.add(k);
        }
        return true;
    }
}