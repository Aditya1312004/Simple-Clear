class Solution {
    public int[][] merge(int[][] intervals) {
     int n = intervals.length;
     Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

     List<int[]> as = new ArrayList<>();

     for(int i=0;i<n;i++){
        int start = intervals[i][0];
        int end = intervals[i][1];
        if(!as.isEmpty() && end <= as.get(as.size()-1)[1]){
            continue;
        }
        for(int j =i+1;j<n;j++){
            if(intervals[j][0] <=end ){
                end = Math.max(intervals[j][1] , end);
            }
            else{
                break;
            }
        }
        as.add(new int[]{start,end});
     }  
     return as.toArray(new int[as.size()][]); 
    }
}