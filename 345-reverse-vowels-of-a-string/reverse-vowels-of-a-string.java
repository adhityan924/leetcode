class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowSet = new HashSet<>();
        vowSet.add('a');
        vowSet.add('e');
        vowSet.add('i');
        vowSet.add('o');
        vowSet.add('u');
        vowSet.add('A');
        vowSet.add('E');
        vowSet.add('I');
        vowSet.add('O');
        vowSet.add('U');
        int l=0;
        int r=s.length()-1;
        char[] str = s.toCharArray();
    while (l<r){

            while (l<s.length()&&!vowSet.contains(str[l])) {
                l++;
            }

            while (r>=0&&!vowSet.contains(str[r])) {
                r--;
            }
            if(l<r){
                char x=str[l];
                str[l]=str[r];
                str[r]=x;
                l++;
                r--;
            }

        }
        return new String(str);
    }
}