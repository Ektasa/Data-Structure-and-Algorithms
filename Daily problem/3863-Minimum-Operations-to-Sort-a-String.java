class Solution {
    public int minOperations(String s) {
        int count=0;

        for(int i=1;i<s.length();i++)
        {
            if((s.charAt(i)-'0')<(s.charAt(i-1)-'0'))
            {
                swap(s.charAt(i),s.charAt(i-1));
                count ++;
            }
        }
        if(count>0) return count;
        return -1;
    }
    public static void swap(char ch1, char ch2)
    {
        char c=ch1;
        ch1=ch2;
        ch2=c;
    }
}