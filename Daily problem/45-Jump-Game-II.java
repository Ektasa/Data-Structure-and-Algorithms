class Solution {
    public int jump(int[] nums) {
        int mini=0; int ans=0; int end=0;
        for(int i=0;i<nums.length-1;i++)
        {
            mini=Math.max(mini,i+nums[i]);
            if(mini>=nums.length-1)
            {
                ++ans; break;
            }
            if(i==end)
            {
                ++ans;
                end=mini;
            }
        }

        return ans;
    }
}