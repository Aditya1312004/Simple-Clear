class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n =nums.length; 
        int [] pos = new int [n/2];
        int [] neg= new int[n/2];
        int p=0;
        int ne=0;
        for(int num : nums){
            if(num >0){
                pos[p++] = num;
            }
            else{
                neg[ne++] = num;
            }
        }
        int [] ui = new int[n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n/2 && j<n/2){
            ui[k++] = pos[i++];
            ui[k++] = neg[j++];
        }
        return ui;
    }
}