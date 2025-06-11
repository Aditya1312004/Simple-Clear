class Solution {
    public boolean isAnagram(String s, String t) {
char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        String sorteds = new String(sArray);
char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        String sortedt = new String(tArray);
if (sorteds.equals(sortedt)){
            return true;
        }
        return false;
    }
}