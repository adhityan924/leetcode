class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            output[i]=1;
        }
        int l=1;
        int r=1;
        for(int i=0;i<nums.length;i++){
            output[i]=output[i]*l;
            l=l*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            output[i]=output[i]*r;
            r=r*nums[i];
        }

        return output;
    }
}