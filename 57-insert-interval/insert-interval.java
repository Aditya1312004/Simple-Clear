class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int m = intervals.length;
        int i = 0;
        List<int[]> as = new ArrayList<>();
         while(i < m && intervals[i][1] < newInterval[0]){
            as.add(intervals[i++]);
        }
      while(i<m && intervals[i][0] <= newInterval[1]){
        newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
        newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
        i++;
      }
        as.add(newInterval);

        while(i<m){
            as.add(intervals[i++]);
        }
            
        return as.toArray(new int[as.size()][]);
        }
    }
