class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> soln = new HashMap<>();
        for (int i : arr) {
            soln.put(i, (soln.getOrDefault(i, 0)) + 1);
        }
        int res =-1;
        for(int i:soln.keySet()){
            if((i==soln.get(i))&&(soln.get(i)>res)){
                res=i;
            }
        }
        return res;
    }
}