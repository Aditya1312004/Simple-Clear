class Solution {
    public boolean isOneBitCharacter(int[] bits) {
         int counter = 0;
         int len = bits.length;
        for (int i = len-2; i >= 0 && bits[i] == 1; i--)
            counter++;
         return counter%2 == 0;
    }
}