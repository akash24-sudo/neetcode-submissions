class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        char[] str = s.toCharArray();

        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right<str.length){
            if(hash[str[right]]!=-1){
                if(hash[str[right]]>=left){
                    left = hash[str[right]] + 1;
                }
            }
            maxLen = Math.max(maxLen,right-left+1);
            hash[str[right]]=right;
            right++;
        }

        return maxLen;
    }
}
