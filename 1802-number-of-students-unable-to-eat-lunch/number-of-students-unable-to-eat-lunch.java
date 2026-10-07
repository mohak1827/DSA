class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> que = new LinkedList<>();
        for(int val : students)
        {
            que.offer(val);
        }
        int idx = 0;
        int size = 0;
        while(size < que.size() && !que.isEmpty())
        {
            if(que.peek() == sandwiches[idx])
            {
                size = 0;
                que.poll();
                idx++;
            }
            else
            {
                que.offer(que.poll());
                size++;
            }
        }
        return que.size();
    }
}