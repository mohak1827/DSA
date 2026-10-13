class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones)
        {
            pq.offer(stone);
        }
        while(pq.size() > 1)
        {
            int stone1 = pq.poll();
            int stone2 = pq.poll();

            int smash = stone1 - stone2;

            if(smash != 0)
            {
                pq.offer(smash);
            }
        }
        return pq.isEmpty()?0:pq.peek();
    }
}