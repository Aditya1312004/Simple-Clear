class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count =0;
        for(int i=low ;i<=high;i++){
           String s = Integer.toString(i);
            int len = s.length();
            if(len%2 != 0) continue;

            int half = len /2;
            int leftsum =0;
            int rightsum=0;
            
            for(int j=0;j<half;j++) {
                 leftsum += s.charAt(j) -'0';
}
for(int j=half;j<len;j++){
     rightsum += s.charAt(j) - '0';
}
if(leftsum == rightsum){
    count++;
}
            
        }
        return count;
    }
}