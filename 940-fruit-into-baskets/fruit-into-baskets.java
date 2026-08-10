class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int l = 0;
        for(int r = 0; r < fruits.length; r++)
        {
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);
            while(map.size() > 2)
            {
                int fruit = fruits[l];
                int freq = map.get(fruit)-1;
                map.replace(fruit,freq);
                if(freq == 0)
                {
                    map.remove(fruit);
                }
                l++;
            }
            count = Math.max(count, r-l+1);
        }
        return count;
    }
}