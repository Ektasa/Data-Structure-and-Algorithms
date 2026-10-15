class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder str=new StringBuilder();
        String[] s=new String[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        if(s[0].equals("0"))
        {return "0";}
        for(int i=0;i<s.length;i++)
        {
            str.append(s[i]);
        }
       return str.toString();
    }
}