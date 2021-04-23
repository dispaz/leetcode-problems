package problems.greedy.canplaceflower_605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if((i > 0 && flowerbed[i - 1] == 1) || flowerbed[i] == 1 || (i + 1 < flowerbed.length && flowerbed[i + 1] == 1))
                continue;
            n--;
            if(n < 0) break;
        }
        return n <= 0;
    }
}
