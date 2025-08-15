class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())return false;
        HashMap<Character , Integer> as = new HashMap<>();
        HashMap<Character , Integer> po = new HashMap<>();

        for(char p : word1.toCharArray()){
            as.put(p , as.getOrDefault(p , 0)+1);
        }
        for(char q : word2.toCharArray()){
            po.put(q , po.getOrDefault(q , 0)+1);
        }
        if(!as.keySet().equals(po.keySet()))return false;
        ArrayList<Integer> h1 = new ArrayList<>(as.values());
        List<Integer> h2 = new ArrayList<>(po.values());

        Collections.sort(h1);
        Collections.sort(h2);

        return h1.equals(h2);

    }
}