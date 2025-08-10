class Solution {
    public boolean reorderedPowerOf2(int n) {
        HashSet<String> as = new HashSet<>();
        for(int i=0;i<31;i++){
            as.add(sortedString(1<<i));

        }
        return as.contains(sortedString(n));

    }

    public String sortedString(int num){
        char[] s = String.valueOf(num).toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
}