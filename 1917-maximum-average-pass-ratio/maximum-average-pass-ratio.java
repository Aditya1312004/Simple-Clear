class Solution {

    public double gain(int pass , int total){
        return (double)(pass+1)/(total+1) - (double)pass/total;
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> Double.compare(b[0] , a[0]));
        for(int[] c : classes){
            int pass = c[0];
            int total = c[1];
            pq.offer(new double[]{gain(pass , total) , pass , total});
        }
        while(extraStudents -- > 0){
           double[] a = pq.poll();
           int pass = (int)a[1];
           int total = (int)a[2];
           pass++;
           total++;

           pq.offer(new double[]{gain(pass , total) , pass , total});
        }
        double sum = 0.0;
        while(!pq.isEmpty()){
            double[] b = pq.poll();
            sum += b[1] / b[2];
        }
        return sum / classes.length;
    }
}