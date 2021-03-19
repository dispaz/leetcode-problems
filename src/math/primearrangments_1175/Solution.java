package math.primearrangments_1175;

public class Solution {
    public int numPrimeArrangements(int n) {
        int [] arr = new int[n + 1];
        int [] cnt = {0, 1};
        long res = 1;

        for(int i = 2; i <= n; i++){
            if(arr[i] == 0){
                for(int j = i*i; j <= n; j += i){
                    arr[j] = 1;
                }
            }

            cnt[arr[i]]++;
            res = res * cnt[arr[i]] % 1000_000_007;
        }

        return (int) res;
    }
}
