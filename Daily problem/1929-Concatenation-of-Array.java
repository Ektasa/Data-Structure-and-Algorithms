class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
           res[i]=nums[i];
        }
        int n=res.length/2;
        for(int j=0;j<res.length/2;j++)
        {
            res[j+n]=res[j];
        }
     return res;   
    }
}