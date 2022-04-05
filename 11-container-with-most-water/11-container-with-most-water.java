class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int m = Integer.MIN_VALUE;
        
        while(low<high)
        {
            m = Math.max(m, (Math.min(height[low], height[high])*(high - low)));
        
            if(height[low]>height[high])
                high--;
            else
                low++;
        }
        return m;
    }
}