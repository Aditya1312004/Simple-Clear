class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m = spells.length;
        int n = potions.length;
        Arrays.sort(potions);
        int[] result = new int[m];
        for(int i=0;i<m;i++){
            long lows = (success + (long)spells[i] - 1)/(long)spells[i];
            int index = lower(potions , lows);
            result[i] = n-index;
        }
        return result;
    }

    public int lower(int[] arr , long target){
        int left= 0;
        int right = arr.length;
        while(left<right){
            int mid = left+(right - left)/2;
            if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}