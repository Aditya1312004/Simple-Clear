class Solution {
      public int smallestNumber(int n) {
        int number = n;     
        int newSqr = 0;
        while (number > 1) {
            number /= 2;
            newSqr++;
        }

        return n | (int)Math.pow(2, newSqr) - 1;

    }
}