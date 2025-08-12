class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> as = new ArrayList<>();

        int i = 0;
        int n = intervals.length;
        
        while(i<n && intervals[i][1] < newInterval[0]){
            as.add(intervals[i++]);
        }
        int start = newInterval[0];
        int end = newInterval[1];
        while(i<n && intervals[i][0]  <= end ){
            start = Math.min(intervals[i][0] , start);
            end = Math.max(intervals[i][1] , end);
            i++;
        }
        as.add(new int[]{start,end});
        while(i<n )as.add(intervals[i++]);

        return as.toArray(new int[as.size()][]);

    }
}