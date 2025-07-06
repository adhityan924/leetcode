class FindSumPairs {

    int[] nums1;
    int[] nums2;
    Map<Integer, Integer> countMap;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.countMap = new HashMap<>();
        for (int num : nums2) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int temp = nums2[index];
        countMap.put(temp, countMap.get(temp) - 1);
        nums2[index] += val;
        countMap.put(nums2[index], countMap.getOrDefault(nums2[index],0) + 1);
    }

    public int count(int tot) {
        int res = 0;
        for (int num : nums1) {
            int comp = tot - num;
            res += countMap.getOrDefault(comp, 0);
        }
        return res;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */