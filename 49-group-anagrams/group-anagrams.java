class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupMap = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!groupMap.containsKey(key)){
                groupMap.put(key,new ArrayList<>());
            }
            groupMap.get(key).add(s);
        }
        return new ArrayList<>(groupMap.values());
    }
}