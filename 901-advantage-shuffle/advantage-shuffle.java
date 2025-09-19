class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int n = nums1.length;
        int[][] po = new int[n][2];
        for(int i=0;i<n;i++){
            po[i][0] = nums2[i];
            po[i][1] = i;
        }

        Arrays.sort(po , (a,b) -> a[0] - b[0]);
        int[] res = new int[n];
        int left = 0;
        int right = n-1;
        for(int i=0;i<n;i++){
            if(nums1[i] > po[left][0]){
                res[po[left][1]] = nums1[i];
                left++;
            }
            else{
                res[po[right][1]] = nums1[i];
                right--;
            }
        }

        return res;
    }
}