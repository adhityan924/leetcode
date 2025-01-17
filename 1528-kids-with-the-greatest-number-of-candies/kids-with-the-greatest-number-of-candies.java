import static java.lang.Math.abs;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxval = 0;
        for (int candie:candies){
            maxval=Math.max(maxval, candie);
        }
        List<Boolean> a = new ArrayList<>();
        for (int candie:candies){
            a.add((candie+extraCandies)>=maxval);
        }
        return a;

        
    }
}