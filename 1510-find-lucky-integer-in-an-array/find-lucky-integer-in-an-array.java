class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> as = new HashMap<>();
        
        for(int i: arr){
            as.put(i , as.getOrDefault(i ,0 )+1);
        }
        int maxkey = -1;
        for(Map.Entry<Integer,Integer> po:as.entrySet()){
            if(po.getKey().equals(po.getValue())){  
               maxkey= Math.max(maxkey ,po.getKey());
                
            }
        }
        return maxkey;
    }
}