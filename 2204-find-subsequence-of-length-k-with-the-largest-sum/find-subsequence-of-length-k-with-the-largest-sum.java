class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] po = new int[n][2];

        for(int i=0;i<n;i++){
            po[i][0] = nums[i];
            po[i][1] = i;
        }

        Arrays.sort(po , (a,b) ->b[0] - a[0] );

        int[][] kop = Arrays.copyOfRange(po , 0,k);

        Arrays.sort(kop , (a,b)-> a[1] - b[1]);

        int result[] = new int[k];
        for(int j =0;j<k;j++){
            result[j] = kop[j][0];
        }
        return result;
    }
}