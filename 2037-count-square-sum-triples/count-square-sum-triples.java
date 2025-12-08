class Solution {
    public int countTriples(int n) {
        int count = 0;
        int sum = 0;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                int po = i*i;
                int lk = j*j;
                 sum = po+lk;
                    for(int k=1;k<=n;k++){
                if(k*k == sum ){
                    count++;
                }
            }
         
            }
        }
        return count;
    }
}