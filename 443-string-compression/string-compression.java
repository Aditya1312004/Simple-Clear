class Solution {
    public int compress(char[] chars) {
        int j = 0;
        int i = 0;
        int n  =chars.length;
        
        while(i< n){
            char curr= chars[i];
            int count = 0;
            while(i < n && chars[i] == curr){
                i++;
                count++;
            }

        chars[j++] = curr;

        if(count  > 1){
            String h = String.valueOf(count);
            for(char c: h.toCharArray()){
                chars[j++] = c;
            }
        }


        }
        return j;
    }
}