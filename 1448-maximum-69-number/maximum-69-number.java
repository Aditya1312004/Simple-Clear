class Solution {
    public int maximum69Number (int num) {
        List<Integer> as = new ArrayList<>();
        while(num>0){
            as.add(0,num%10);
            num=num/10;
        }

        for(int i=0;i<as.size();i++){
            if(as.get(i) == 6){
                as.set(i , 9);
                break;
            }
        }
        int result = 0;
        for(int d : as){
            result = result*10 + d;
        }
        return result;
    }
}