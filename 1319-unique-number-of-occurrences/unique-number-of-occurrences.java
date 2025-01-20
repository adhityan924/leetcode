class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> umap = new HashMap<>();
        for(int val:arr){
            if(umap.containsKey(val)){
                umap.put(val, umap.get(val)+1);
            }else {
                umap.put(val, 1);
            }
        }
        Set<Integer> uset = new HashSet<>(umap.values());

        return uset.size()==umap.size();
    }
}