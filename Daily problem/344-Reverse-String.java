class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++)
        {
           // swap(s[i],s[n-i-1]);
            char temp=s[i];
                s[i]=s[n-i-1];
                s[n-i-1]=temp;
        }
        
    }
    public void swap(char ch1, char ch2)
    {
        char temp=ch1;
        ch1=ch2;
        ch2=temp;
    }
}