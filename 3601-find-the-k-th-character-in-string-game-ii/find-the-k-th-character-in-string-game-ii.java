class Solution {
    public char kthCharacter(long k, int[] operations) {
        // StringBuilder res = new StringBuilder();
        // res.append('a');
        // //String x = res.toString();
        // for (int i = 0; i < operations.length; i++) {
        //     String x = res.toString();
        //     if (res.length() < k) {
        //         if (operations[i] == 0) {
        //             res.append(x);
        //         }
        //         else {
        //             StringBuilder temp = new StringBuilder();
        //             for(char c:x.toCharArray()){
        //                 temp.append((char)(c+1));
        //             }
        //             res.append(temp);
        //         }
        //     }
        // }
        // String sol = res.toString();
        // return sol.charAt(((int) (k-1)));
        int ans = 0;
        int t;
        while (k != 1) {
            t = 63 - Long.numberOfLeadingZeros(k);
            if ((1L << t) == k) {
                t--;
            }
            k = k - (1L << t);
            if (operations[t] != 0) {
                ans++;
            }
        }
        return (char) ('a' + (ans % 26));
    }
}