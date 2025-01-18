class Solution {
    public String reverseWords(String s) {

        s=s.replaceAll("\\s+", " ");
        System.out.println(s);
        String[] str = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            res.append(str[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}