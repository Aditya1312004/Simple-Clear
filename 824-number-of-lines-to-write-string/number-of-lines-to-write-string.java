class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int c =0;

        int  l = 1;
        for(char p : s.toCharArray()){
            int width = widths[p - 'a'];
            if( c + width> 100){
                l++;
                c = width;
            }
            else{
                c += width;
            }
        }
        return new int[]{l , c};
    }
}