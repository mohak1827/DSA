class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> que = new LinkedList<>();
        for(int val : students)
        {
            que.offer(val);
        }
        int idx = 0;
        int c = 0;
        while(!que.isEmpty())
        {
            if(que.peek() == sandwiches[idx])
            {
                c = 0;
                que.poll();
                idx++;
            }
            else
            {
                que.offer(que.poll());
            }
            if(c == que.size())
            {
                return que.size();
            }
            c++;
        }
        return c;
    }
}