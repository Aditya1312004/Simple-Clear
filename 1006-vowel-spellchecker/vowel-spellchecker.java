class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
    HashSet<String> as = new HashSet<>();
    HashMap<String , String> h1 = new HashMap<>();
    HashMap<String , String> h2 = new HashMap<>();
    for(String f : wordlist){
        as.add(f);
        h1.putIfAbsent(f.toLowerCase() , f);
        h2.putIfAbsent(mismatch(f.toLowerCase()) , f);
    }
    
    String[] kl = new String[queries.length];
    int idx =0;
    for(String h : queries){
        if(as.contains(h)){
            kl[idx++] = h;
        }
        else if(h1.containsKey(h.toLowerCase())){
            kl[idx++] = h1.get(h.toLowerCase());
        }
        else if(h2.containsKey(mismatch(h.toLowerCase()))){
            kl[idx++] = h2.get(mismatch(h.toLowerCase()));
        }
        else{
        kl[idx++] = "";
        }
    }
    return kl;
    }

    public String mismatch(String s){
        StringBuilder sb1 = new StringBuilder();
        for(char ch : s.toCharArray()){
        if(isvowel(ch)){
            sb1.append('*');
        }
        else{
            sb1.append(ch);
        }
        
    }
    return sb1.toString();
    }
    public boolean isvowel(char c){
        
            if(c == 'a' || c == 'e' || c =='i' || c== 'o' || c =='u'){
                return true;
            }
return false;
        
        
    }
}