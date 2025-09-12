class Solution {
    public boolean doesAliceWin(String s) {
        StringBuilder sb= new StringBuilder(s);
        
        int count = 0;
        for(int i = 0;i<sb.length() ; i++){
            char a = sb.charAt(i);
            if(a == 'a' || a == 'e' || a== 'i' || a == 'o' || a =='u'){
                if(count /2 ==0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}