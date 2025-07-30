class Solution {
    public int maximumGain(String s, int x, int y) {
        int res = 0;
        StringBuilder sb = new StringBuilder(s);

        if(x>y){
          res+=  function(sb , 'a' , 'b' , x);
           res+= function(sb , 'b' , 'a' , y);

        }
        else{
            res+=function(sb , 'b' , 'a' , y);
            res+=function(sb , 'a' , 'b' , x);
        }
    return res;
    }

    public int function(StringBuilder sb , char first , char second , int score ){
        int res=0;
        int i = 0;
        while(i<sb.length()-1){
            
         if(sb.charAt(i) == first && sb.charAt(i+1) == second){
            res+=score; 
            sb.deleteCharAt(i);
            sb.deleteCharAt(i);
            if(i-1<0){
                i=0;
            }
            else{
                i=i-1;
            }
         }
           else{
            i++;
           }
        }
return res;
    }
}