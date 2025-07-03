class Solution {
    public char kthCharacter(int k) {
        StringBuilder res = new StringBuilder();
        res.append('a');
        while(res.length()<k){
            StringBuilder nBuilder = new StringBuilder();
            String temp = res.toString();
            for(char i:temp.toCharArray()){
                nBuilder.append((char)(i+1));
            }
            res.append(nBuilder);
        }
        return res.charAt(k-1);
    }
}