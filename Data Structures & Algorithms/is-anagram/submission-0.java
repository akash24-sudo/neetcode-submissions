class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();
        for(char it: s.toCharArray()){
            mp1.put(it,mp1.getOrDefault(it,0)+1);
        }

        for(char it: t.toCharArray()){
            mp2.put(it,mp2.getOrDefault(it,0)+1);
        }

        if(mp1.equals(mp2)) return true;

        return false;

    }
}
