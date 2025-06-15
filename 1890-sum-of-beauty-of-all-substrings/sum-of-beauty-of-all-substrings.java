class Solution {
    public int beautySum(String s) {
        int totalbeauty = 0;
        
        for(int i=0;i<s.length();i++){
        HashMap<Character , Integer> as = new HashMap<>();
        for(int j=i;j<s.length();j++){
            char c = s.charAt(j);
            as.put(c , as.getOrDefault(c , 0)+1);
        
        
            int maxfreq = Integer.MIN_VALUE;
            int minfreq = Integer.MAX_VALUE;
            for(int freq : as.values()){
                 maxfreq = Math.max(maxfreq , freq);
                 minfreq = Math.min(minfreq , freq);
                 
            }
            totalbeauty += (maxfreq-minfreq);
            }
        }
        
        
    return totalbeauty;

        
    }
}