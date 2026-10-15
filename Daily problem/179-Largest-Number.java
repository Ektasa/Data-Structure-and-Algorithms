class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder str=new StringBuilder();
        String[] s=new String[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        
       return s[0].equals("0")?"0": String.join("",s);
    }
}