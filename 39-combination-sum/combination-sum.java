class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates , 0 , target , new ArrayList<>() , result ,0);
        return result;
    }
    public void backtrack(int[] candidates, int start, int target , 
    List<Integer> current , List<List<Integer>> result , int sum){
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(sum > target){
            return;
        }

        for(int i=start;i<candidates.length;i++){
            current.add(candidates[i]);
            backtrack(candidates, i , target , current , result ,sum + candidates[i] );
            current.remove(current.size() - 1); 
        }
    }
}