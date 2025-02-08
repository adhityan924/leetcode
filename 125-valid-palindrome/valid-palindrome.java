class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();

        StringBuilder str= new StringBuilder();
        str.append(s);
        str.reverse();

        return s.equals(str.toString());
    }
}