class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> as = new Stack<>();
        Stack<Integer> po = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '('){
                as.push(i);
            }
            else if(c == '*'){
                po.push(i);
            }
            else if(c == ')'){
                if(!as.isEmpty()){
                as.pop();
                }
                else if(!po.isEmpty()){
                    po.pop();
                }
                else{
                    return false;
                }

            }
        }

        while(!as.isEmpty() && !po.isEmpty()){
            int a = as.pop();
            int b = po.pop();
            if(a> b){
                return false;
            }


        }

        return as.isEmpty();
    }
}