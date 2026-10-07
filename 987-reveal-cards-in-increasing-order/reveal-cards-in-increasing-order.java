class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> que = new ArrayDeque<>();
        Arrays.sort(deck);
        for(int i = deck.length-1; i >= 0; i--)
        {
            if(!que.isEmpty())
            {
                que.offerFirst(que.pollLast());
            }
            que.offerFirst(deck[i]);
        }
        int[] res = new int[deck.length];
        for(int i = 0; i < deck.length; i++)
        {
            res[i] = que.poll();
        }
        return res;
    }
}