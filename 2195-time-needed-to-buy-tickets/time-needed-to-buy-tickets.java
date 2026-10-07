class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> que = new LinkedList<>();
        int time = 0;
        for(int i = 0; i < tickets.length; i++)
        {
            que.offer(i);
        }
        while(tickets[k] > 0)
        {
            int idx = que.poll();
            tickets[idx]--;
            if(tickets[idx] != 0)
            {
                que.offer(idx);
            }
            time++;
        }
        return time;
    }
}