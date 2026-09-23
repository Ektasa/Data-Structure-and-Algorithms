class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==i)
        //     continue;
        //     else
        //     return i;
        // }
        // return nums.length;

        //XOR 
        int mis=0; int t=0;
        for(int i=0;i<nums.length+1;i++)
        {
            mis^=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            mis^=nums[i];
        }
        return mis;

    }
}