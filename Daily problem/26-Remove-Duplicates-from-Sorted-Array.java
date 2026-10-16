class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j]!=nums[i])
            {
                j++;
                nums[j]=nums[i];
            }
            
                
            }
           
        // int k=0;
        // while(k<hash.length)
        // {
        //      n[k]=nums[k];
        //      k++;   
        // }
        return j+1;
    }
}