class Solution {
    public int maxArea(int[] heights) {

        int maxWater = 0;
            int start = 0;
            int end = heights.length-1;

            while(start<end){
                int height = Math.min(heights[start],heights[end]);
                int width = end-start;
                int currentWater = height*width;
                maxWater = Math.max(currentWater, maxWater);

                if(heights[start]<heights[end]) start++;
                else end --;
            }
        return maxWater;
    }
}
