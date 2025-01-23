class Solution {
    public int largestAltitude(int[] gain) {
        int res=0;
        int peak=res;
        for(int val:gain){
            res+=val;
            if(res>peak){
                peak=res;
            }
            
        }
        return peak;
    }
}