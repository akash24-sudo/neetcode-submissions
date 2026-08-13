class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Map.Entry<Integer,Integer>> li = new ArrayList<>();

        Map<Integer, Integer> mp = new HashMap<>();
        

        for(int it : nums){
            mp.put(it, mp.getOrDefault(it,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int num = entry.getKey();
            int frequency = entry.getValue();

            li.add(Map.entry(num,frequency));
        }

        li.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<k ; i++){
            Map.Entry<Integer, Integer> entry = li.get(i);
            ans.add(entry.getKey());
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
