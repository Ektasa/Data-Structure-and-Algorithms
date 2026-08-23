class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        // for(int i=1;i<nums.length;i++)
        // {
        //  max=Math.max(max,nums[i]);

        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(max==nums[i])
        //     return i;
        // }
        int low=0; int high=nums.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1])
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}