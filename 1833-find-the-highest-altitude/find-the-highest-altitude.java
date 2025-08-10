class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        ArrayList<Integer> as = new ArrayList<>();
        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            as.add(sum);
        }
        int max = Collections.max(as);
        if(max< 0 )return 0;
        return max;
    }
}