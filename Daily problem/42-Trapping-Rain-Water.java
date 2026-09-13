class Solution {
    public int trap(int[] arr) {
        
        int rightmax=0 ; int leftmax=0; int left=0; int right=arr.length-1; int total=0;
        
        while(left<=right)
        {
            if(arr[left]<=arr[right])
            {
                if(leftmax>arr[left])
                {
                    total+=(leftmax-arr[left]);
                }
                else
                {
                   leftmax=arr[left];
                }
                left=left+1;
            }
            else
            {
                if(rightmax>arr[right])
                {
                    total+=(rightmax-arr[right]);
                }
                else
                {
                    rightmax=arr[right];
                }
                right=right-1;
            }

        }
         return total;
    }
}