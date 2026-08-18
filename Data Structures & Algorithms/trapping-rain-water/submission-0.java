class Solution {
    public int trap(int[] height) {
        int rainWater = 0;
        
        int[] prefixMax = new int[height.length];
        prefixMax[0] = height[0];
        for(int i=1 ; i<height.length ; i++){
            prefixMax[i] = Math.max(prefixMax[i-1],height[i]);
        }

        int[] suffixMax = new int[height.length];
        suffixMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ; i>-1 ; i--){
            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
        }

        for(int i=0 ; i<height.length ; i++){
            rainWater+= Math.min(prefixMax[i],suffixMax[i]) - height[i];
        }

        return rainWater;
    }
}
