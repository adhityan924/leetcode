class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> charMap = new HashMap<>();
        int left=0;
        int right=0;
        int len = 0;

        while (right<s.length()){
            char r = s.charAt(right);
            charMap.put(r, charMap.getOrDefault(r, 0)+1);
            
            while(charMap.get(r)>1){
                char l = s.charAt(left);
                charMap.put(l, charMap.get(l)-1);
                left++;
            }

            len = Math.max(len, right-left+1);

            right++;
        }

        return len;
    }
}