class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m =matrix.length;
        int n = matrix[0].length;
        Set<Integer> rm = new HashSet<>();
        Set<Integer> cm = new HashSet<>();
        // row ko traverse k liye
        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0];
            for(int j =0;j<n;j++){
                if(matrix[i][j] < min){
                   min = matrix[i][j];
                }


            }
            rm.add(min);
        }

        //column k liye
        for(int i=0;i<n;i++){
            int max = matrix[0][i];
            for(int j=1;j<m;j++){
                if(matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            cm.add(max);
        }
    
    List<Integer> result = new ArrayList<>();
    for(int num : rm){
        if(cm.contains(num)){
            result.add(num);
        }
    }
    return result;
}
}