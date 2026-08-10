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
                map.replace(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0)
                {
                    map.remove(fruits[l]);
                }
                l++;
            }
            count = Math.max(count, r-l+1);
        }
        return count;
    }
}