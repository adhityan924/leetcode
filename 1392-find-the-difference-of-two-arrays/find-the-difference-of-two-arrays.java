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
        for (int n:nums2){
            if(n1.contains(n)){
                n1.remove(n);
                n2.remove(n);
            }
        }
        return Arrays.asList(new ArrayList<>(n1),new ArrayList<>(n2));

    }
}