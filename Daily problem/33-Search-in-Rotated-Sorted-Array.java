class Solution {
    public int search(int[] nums, int target) {
        int start=0; int n=nums.length;
        int end=n-1;

         while(start<end)
         {
            int mid=(start+end)/2;
            if(nums[mid]>nums[end]) start=mid+1;
            else end=mid;
         }
         int root =start; start=0; end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int realmid=(mid+root)%n;
         if(nums[realmid]==target)
            {return realmid;}
            if(nums[realmid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
       
        return -1;
    }
}