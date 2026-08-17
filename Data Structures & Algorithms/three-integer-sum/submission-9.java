class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int start = i+1;
            int end = n-1;
            while(start<end){
                if(nums[start]+nums[end]+nums[i]==0){
                    List<Integer> sol = new ArrayList<>(Arrays.asList(nums[i],nums[start],nums[end]));
                    ans.add(sol);
                    start++;
                    end--;
                    while(start<end && nums[start]==nums[start-1]) start++;
                    while(start<end && nums[end]==nums[end+1]) end--;
                }
                else if(nums[start]+nums[end]+nums[i]<0){
                    start++;
                }
                else end--;

            }

        }
        return ans;
    }
}
