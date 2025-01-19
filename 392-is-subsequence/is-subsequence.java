class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int r=0;

        while(i<s.length()&&r<t.length()){
            if(s.charAt(i)==t.charAt(r)){
                i++;
            }
            r++;
        }
        if(i==s.length()){
            return true;
        }
        else {
            return false;
        }
    }
}