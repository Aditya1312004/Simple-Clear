class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> as;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.as = new HashMap<>();

        for (int num : nums2) {
            as.put(num, as.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int old = nums2[index];
        as.put(old, as.get(old) - 1);
        if (as.get(old) == 0) {
            as.remove(old);
        }

        nums2[index] += val;
        int updated = nums2[index];
        as.put(updated, as.getOrDefault(updated, 0) + 1);
    }

    public int count(int tot) {
        int result = 0;
        for (int num : nums1) {
            int ui = tot - num;
            result += as.getOrDefault(ui, 0);
        }
        return result;
    }
}