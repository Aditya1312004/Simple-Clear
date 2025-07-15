class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> as = new HashMap<>();
        int i=0;
        int p =0;
        int l =0;

        for(int j=i;j<s.length();j++){
            char c = s.charAt(j);
            as.put(c , as.getOrDefault(c ,0)+1);
             p = Math.max( p , as.get(c));
        while((j-i+1) - p > k){
            char d = s.charAt(i);
            as.put( d , as.get(d) -1);
            i++;
        }
        l = Math.max(l , j-i+1);
        }
        return l;       

    }
}