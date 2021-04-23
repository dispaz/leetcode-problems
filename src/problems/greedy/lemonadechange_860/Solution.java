package problems.greedy.lemonadechange_860;

public class Solution {
    public static boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0;
        for(int bill : bills){
            if(bill == 5)
                count5++;
            else if(bill == 10 ){
                if(count5 == 0) return false;
                count5--;
                count10++;
            }
            else if(bill == 20){
                if(count10 > 0 && count5 > 0){
                    count10--;
                    count5--;
                }
                else if(count5 >= 3){
                    count5 -= 3;
                }else {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String [] args){
        System.out.println(lemonadeChange(new int [] {5,5,10,10,20}));
    }
}
