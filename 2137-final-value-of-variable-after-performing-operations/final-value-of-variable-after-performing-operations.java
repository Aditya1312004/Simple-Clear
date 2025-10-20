class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(String c : operations){
            if(c.contains("+")){
                count++;
            }

            else{
                count--;
            }
        }
        return count;
    }
}