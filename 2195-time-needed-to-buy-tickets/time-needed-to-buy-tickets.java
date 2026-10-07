class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> que = new LinkedList<>();
        int time = 0;
        for(int i = 0; i < tickets.length; i++)
        {
            que.offer(i);
        }
        while(!que.isEmpty())
        {
            int idx = que.poll();
            tickets[idx]--;
            time++;
            if(tickets[idx] == 0 && idx == k)
            {
                return time;
            }
            if(tickets[idx] > 0)
            {
                que.offer(idx);
            }
        }
        return time;
    }
}