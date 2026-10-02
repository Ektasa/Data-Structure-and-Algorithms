class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
     int p1=0; int p2=0;
       for(int i:nums)
        {
          int t=p1;
          p1=Math.max(p2+i,p1);
          p2=t;
           
        }
        return p1;
    }
}