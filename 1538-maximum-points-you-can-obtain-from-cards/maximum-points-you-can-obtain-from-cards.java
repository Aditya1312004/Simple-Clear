class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int max = 0;
        for(int i = 0;i<k;i++){
            lsum += cardPoints[i];
            max = lsum;
           
        }
         int n = cardPoints.length;
            for(int j = 1;j<=k;j++){
                lsum = lsum - cardPoints[k-j];
                rsum = rsum + cardPoints[n-j];
                max = Math.max(max , rsum+lsum);
            }
        
        
        return max;
    }
}