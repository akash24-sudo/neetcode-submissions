class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int rainWater = 0;
        int l = 0;
        int r = height.length-1;
        while(l<r){

            if(height[l]<=height[r]){
                if(leftMax>height[l]){
                    rainWater+=leftMax-height[l];
                }
                else leftMax = height[l];
                l++;
            }
            else{
                if(rightMax>height[r]) rainWater+=rightMax-height[r];
                else rightMax = height[r];
                r--;
            }
        }

        return rainWater;
    }
}
