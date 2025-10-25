class Solution {
    public int totalMoney(int n) {
        int week =1;
        int total = 0;
        while(n > 0){
            int current = week;
            for(int i=0;i<7 && n >0;i++){
                total += current;
                current++;
                n--;
            }
            week++; 
        }
       return total;
    }
}