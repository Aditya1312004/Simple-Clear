class Solution {
    public String largestGoodInteger(String num) {
        int i = 0;
        String answer = "";
        while(i+2 < num.length()){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                String h = num.substring(i,i+3);
                if(answer.isEmpty() || h.compareTo(answer) > 0){ 
                    //this h.comapreTo(answer) in java comapre the elements and the greater than  0 means the larger one is taken <0 means smaller one and ==0 means ""
                    answer = h;
                }
                i+=3; 
            }
           
            else{
                    i++;
                }
        }
        return answer;
    }
}