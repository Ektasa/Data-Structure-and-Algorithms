class Solution {
    public int[] searchRange(int[] nums, int target) {
      
        int[] arr=new int[2];
        arr[0]=firstelement(nums, target);
        arr[1]=lastelement(nums, target);
        return arr;
    }

    private int firstelement(int[] nums, int target)
    {
        int start=0; int end=nums.length-1; int idx=-1;
        while(start<=end)
        {
          int mid= (start+end)/2;
         
          if(nums[mid]>=target) end=mid-1;
          else{
            start=mid+1;
          }
           if(nums[mid]==target) idx=mid;

        } return idx;
    }

    private int lastelement(int[] nums, int target)
    {
        int start=0; int end=nums.length-1; int idx=-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]<=target) start=mid+1;
            else end=mid-1;
            if(nums[mid]==target) idx=mid;
        }
        return idx;
    }
}