class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> mp = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            
            mp.putIfAbsent(sortedString, new ArrayList<>());
            mp.get(sortedString).add(s);
        }

        return new ArrayList<>(mp.values());
    }
}
