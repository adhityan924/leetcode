class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> summap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(summap.containsKey(comp)){
                return new int[]{summap.get(comp),i};
            }
            summap.put(nums[i], i);
        }

        return new int[]{};
    }
}