class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();

        for(int n:nums1){
            n1.add(n);
        }
        for(int n:nums2){
            n2.add(n);
        }
        List<Integer> r1 = new ArrayList();
        List<Integer> r2 = new ArrayList();

        for(int n:nums1){
            if(!r1.contains(n)&&!n2.contains(n)){
                r1.add(n);
            }
        }
        for(int n:nums2){
            if(!r2.contains(n)&&!n1.contains(n)){
                r2.add(n);
            }
        }
        return Arrays.asList(r1,r2);

    }
}