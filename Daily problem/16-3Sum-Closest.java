class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;

        if(n>3)
        {
            for(int i=0;i<n-3;i++)
            {
                if(nums[i]+nums[i+1]+nums[i+2]>=target)

                { return nums[i]+nums[i+1]+nums[i+2];
                    
                }
            }
        }
        return 0;
    }
}