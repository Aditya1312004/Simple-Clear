class Solution {
    public int possibleStringCount(String word) {
       int count = 1;
       for(int i=0;i<word.length();i++){
        char ch = word.charAt(i);
        int sum = 0;
        
        while(i+1<word.length()){
            char c= word.charAt(i+1);
            if(ch == c){
                sum += 1;
                i++;
            }
            else{
                break;
            }
            
        }
       count+= sum;
        


       }
    return count;         
    }
}