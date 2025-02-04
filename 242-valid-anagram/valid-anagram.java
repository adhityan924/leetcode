class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();
        for(char c:s.toCharArray()){
            if(!smap.containsKey(c)){
                smap.put(c, 1);
            }else {
                smap.put(c, smap.get(c)+1);
            }
        }
        for(char c:t.toCharArray()){
            if(!tmap.containsKey(c)){
                tmap.put(c, 1);
            }else {
                tmap.put(c, tmap.get(c)+1);
            }
        }
        return smap.equals(tmap);
    }
}