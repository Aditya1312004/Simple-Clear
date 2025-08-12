class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> as = new HashSet<>();
        HashSet<Integer> po = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            as.add(nums1[i]);
        }
        for(int i = 0 ;i<nums2.length;i++){
            po.add(nums2[i]);
        }
        List<Integer> gh = new ArrayList<>();
        List<Integer> io = new ArrayList<>();
        for(int num : as){
            if(!po.contains(num)){
                gh.add(num);
            }
        }
        for(int num : po){
            if(!as.contains(num)){
                io.add(num);
            }
        }
    return Arrays.asList(gh , io);
    }
}