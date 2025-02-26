class Solution {
    public int countVowelSubstrings(String word) {
        int vow =0;
        Set<Character>  set = new HashSet<>();
        int n = word.length();

        for(int i=0;i<n-1;i++){
            set.clear();

        
        for(int j= i;j<n;j++){
            char ch = word.charAt(j);
            if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch =='i' || ch =='u'){
                set.add(ch);
                if(set.size() == 5)
                    vow++;
                
            }
                else
                    break;
            }
        }
        
        return vow;
    }
}