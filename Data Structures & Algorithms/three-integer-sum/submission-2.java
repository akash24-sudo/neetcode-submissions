class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ansSet = new HashSet<>();
        
        for(int i=0 ; i<nums.length ; i++){

            Set<Integer> st = new HashSet<>();

            for(int j = i+1 ; j<nums.length ; j++){
                if(st.contains(-(nums[i]+nums[j]))){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(-(nums[i]+nums[j]));
                    Collections.sort(ls);
                    ansSet.add(ls);
                }
                else st.add(nums[j]);
            } 
        }

        return new ArrayList<>(ansSet);
    }
}
