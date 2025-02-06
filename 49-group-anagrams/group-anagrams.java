class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupMap = new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            if(!groupMap.containsKey(new String(ch))){
                groupMap.put(new String(ch),new ArrayList<>());
            }
            groupMap.get(new String(ch)).add(s);
        }
        return new ArrayList<>(groupMap.values());
    }
}