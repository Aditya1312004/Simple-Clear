class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] op = s.split(" ");

       for(String o : op){
        StringBuilder po = new StringBuilder(o);
            po.reverse();
            sb.append(po +" ");
       }
       return sb.toString().trim();
    }
}