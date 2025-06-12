class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> as = new HashMap<>();
        
        int b = 0;
        int result = 0;
        as.put('I',1);
        as.put('V',5);
        as.put('X',10);
        as.put('L',50);
        as.put('C',100);
        as.put('D',500);
        as.put('M',1000);
        for(int i = s.length() -1;i>=0;i--){
            char d= s.charAt(i);
            int a = as.get(d);
            if( a< b){
                result -= a;
            }
            else{
                result += a;
            }
            b = a;
        }
        return result;
    }
}