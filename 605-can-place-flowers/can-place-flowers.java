class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i<flowerbed.length;i++){
            boolean left=false;
            boolean right=false;

            if(i==0||flowerbed[i-1]==0){
                left=true;
            }
            if(i==flowerbed.length-1||flowerbed[i+1]==0){
                right=true;
            }
            if(left==true&&right==true&&flowerbed[i]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        if(n<=0){
            return true;
        }else {
            return false;
        }
    }
}