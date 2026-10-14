class Solution {
    public int smallestIndex(int[] nums) {
        int res=-1;
        for(int i=0;i<nums.length;i++)
        {
            int s=nums[i];
            int tmp=0;
            while(s>0)
            {
                tmp+=s%10;
                s/=10;
                
            }
            if(tmp==i)
            {
                return i;
            }
        }
        return -1;
        
    }
}