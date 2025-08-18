class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m-1;
        int l = n-1;
        int b = m+n-1;

        while(l>=0){
            if(k>= 0 && nums1[k] > nums2 [ l]){
                nums1[b--] = nums1[k--];
            }
            else{
                nums1[b--] = nums2[l--];
            }
        }
        
        
    }
}