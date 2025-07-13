class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> as = new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i] > 0 ){
                as.push(asteroids[i]);
            }
            else{
                while(!as.isEmpty() && as.peek() > 0 && as.peek() < Math.abs(asteroids[i]) ){
                    as.pop();
                }
                if(!as.isEmpty() && as.peek() == Math.abs(asteroids[i]) ){
                    as.pop();
                }
                else if(as.isEmpty() || as.peek() < 0){
                    as.push(asteroids[i]);
                }
            }
            
        }
        int n = as.size();
        int[] ans = new int[n];
        for(int i =n-1;i>=0;i--){
            ans[i] = as.pop();
        }
        return ans;
    }
}