class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1;
        int maxWater=0;

        while(left<right){
            int width=right-left;
            int shortestHeight=Math.min(heights[left],heights[right]);
            maxWater=   Math.max(maxWater,width * shortestHeight);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                 right--;
            }
            
        }
    return maxWater;
    }
}
