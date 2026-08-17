class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;

        Set<List<Integer>> ans = new HashSet<>();

        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int start = i+1;
            int end = n-1;
            while(start<end){
                if(nums[start]+nums[end]+nums[i]==0){
                    List<Integer> sol = new ArrayList<>(Arrays.asList(nums[i],nums[start],nums[end]));
                    Collections.sort(sol);
                    ans.add(sol);
                    start++;
                    end--;
                }
                else if(nums[start]+nums[end]+nums[i]<0){
                    start++;
                }
                else end--;
            }

        }
        return new ArrayList<>(ans);
    }
}
