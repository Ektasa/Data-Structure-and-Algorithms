class Solution {
    public boolean checkDivisibility(int n) {
        int i=1; int sum=0; int x=n;
        while(x>0)
        {
            int d=x%10;
            sum+=d;
            i*=d;
            x/=10;
          
        }
        return n%(sum+i)==0;
    }
}