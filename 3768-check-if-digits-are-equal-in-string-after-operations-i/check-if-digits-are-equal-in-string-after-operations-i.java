class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder();
        

        

            int[] ab = new int[s.length()];
            for(int i=0;i<s.length();i++){
                ab[i] = s.charAt(i) - '0';
            }

           while(ab.length > 2){
            int[] po = new int[ab.length - 1];
            for(int i=0;i<ab.length-1;i++){
                int sum = (ab[i] + ab[i+1]) % 10;
                po[i] = sum;
            }
            ab = po;
           }

           if(ab.length == 2){
            return ab[0] == ab[1];
           }
           return false;
    }
}