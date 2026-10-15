class Solution {
    public int dist(int[] points)
    {
        return points[0]*points[0] + points[1]*points[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> dist(b)-dist(a));
        for(int[] point : points)
        {
            pq.offer(point);
            if(pq.size() > k) pq.poll();
        }
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++)
        {
            res[i] = pq.poll();
        }
        return res;
    }
}