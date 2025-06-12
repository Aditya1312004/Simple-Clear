class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> as = new HashMap<>();
        for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        as.put(c , as.getOrDefault(c , 0)+1);
        }

        List<Map.Entry<Character , Integer>> list = new ArrayList<>(as.entrySet());
        list.sort((a , b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character,Integer> po : list){
            char c = po.getKey();
            int freq = po.getValue();
            for(int j=0;j<freq;j++){
                result.append(c);
            }
        }
        return result.toString();
    }
}