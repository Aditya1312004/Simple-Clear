class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> po = new Stack<>();

       for(String op:operations ){
        if(op.equals("C")){
            po.pop();
        }
        else if(op.equals("D")){
            po.push(2*po.peek());
        }
        else if(op.equals("+")){
            int last = po.pop();
            int secondlast = po.peek();
            po.push(last);
            po.push(last + secondlast);
        }
        else {
                po.push(Integer.parseInt(op)); // normal number
            }
         
       }
       int sum = 0;
        for (int score : po) {
            sum += score;
        }
    return sum;
    
}
}