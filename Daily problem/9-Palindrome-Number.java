class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int j=x; int s=0;
        while(j>0)
        {
            int n=j%10;
            s=s*10+n;
            j=j/10;

        }
        if(s==x)
        return true;

        return false;
    }
}