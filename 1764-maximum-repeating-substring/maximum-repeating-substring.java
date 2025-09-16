class Solution {
    public int maxRepeating(String sequence, String word) {
        String h = word;
        int c = 0;
        while(sequence.contains(h)){
            h += word;
            c++;
        }
        return c;
    }
}