class Solution {
    public int nextGreaterElement(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        
        int i = arr.length - 2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        
        if(i==-1)
            return -1;
        
        int j = arr.length-1;
        while(arr[j]<=arr[i])
        {
            j--;
        }
        swap(arr, i, j);
        String ans = "";
        for(int k =0;k<=i;k++)
            ans+=arr[k];
        
        for(int k = arr.length-1;k>i;k--)
            ans+=arr[k]; 
        
        
        try{
            return Integer.valueOf(ans);
        }
        catch(Exception e)
        {
            return -1;
        }
        
 
    }
    
    public void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
}