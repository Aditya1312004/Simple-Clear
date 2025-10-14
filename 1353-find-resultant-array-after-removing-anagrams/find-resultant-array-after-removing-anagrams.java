class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> po = new ArrayList<>();
        po.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!isAnagram(words[i] , words[i-1])){
                po.add(words[i]);
            }
        }
        return po;
    }

    public boolean isAnagram(String a , String b){
        int[] ab = new int[26];
        int[] bc = new int[26];
        for(char ch : a.toCharArray()){
            ab[ch - 'a']++;
        }
        for(char ch : b.toCharArray()){
            bc[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(ab[i] != bc[i]){
                return false;
            }
        }
        return true;
    }
}