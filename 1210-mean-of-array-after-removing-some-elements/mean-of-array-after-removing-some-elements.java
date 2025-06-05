class Solution {
    public double trimMean(int[] arr) {
        
        int n = arr.length;
        Arrays.sort(arr);
        int sum = 0;
        int trim = n/20;
        
        for(int i=trim;i<n-trim;i++){
             sum += arr[i];
        }
        return (double) sum/(n-2*trim);
    }
}