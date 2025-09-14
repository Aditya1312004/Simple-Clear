class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character , Integer> as = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            as.put(c , as.getOrDefault(c , 0) +1);
        }
        int a1 = 0;
        int a2 = 0;
      for(Map.Entry<Character , Integer> po : as.entrySet()){
        char Key = po.getKey();
        int n = po.getValue();
        if(Key== 'a' || Key == 'e' || Key == 'i'
         ||Key == 'o' || Key == 'u'){
            a1 = Math.max(a1 , n);
         }
         else{
            a2 = Math.max(a2 , n);
         }  
        }

        return a1+a2;
    }
}