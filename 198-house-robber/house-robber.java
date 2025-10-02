class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] stolen = new int[n+1];
        stolen[n]=0;
        stolen[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            stolen[i]= Math.max(stolen[i+1], nums[i]+stolen[i+2]);
        }

        return stolen[0];
    }
}