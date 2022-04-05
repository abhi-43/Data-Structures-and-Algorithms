class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int m = Integer.MIN_VALUE;
        
        while(low<high)
        {
            int breadth = high - low;
            int length = Math.min(height[low], height[high]);
           
            int area = length*breadth;
            m = Math.max(m, area);
        
            if(height[low]>height[high])
                high--;
            else
                low++;
        }
        return m;
    }
}