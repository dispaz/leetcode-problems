package arrayproblems.revealcards_950;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        Queue<Integer> q = new LinkedList();
        for(int i = n - 1; i >= 0; i--){
            if(q.size() > 0 )
                q.add(q.poll());
            q.add(deck[i]);
        }

        int [] result = new int[n];
        for(int i = n - 1; i >= 0; i--){
            result[i] = q.poll();
        }
        return result;
    }
}
