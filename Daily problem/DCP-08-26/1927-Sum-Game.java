class Solution {
    public boolean sumGame(String num) {
        int n=num.length(); int cnt1=0; int cnt2=0;
         int mid=n/2; int mid1sum=0; int mid2sum=0; 
        for(int i=0;i<mid;i++)
        {   if(num.charAt(i)=='?')
            {
               cnt1++;
            }
           else  
           mid1sum+=num.charAt(i)-'0';

        }
       
        for(int i=mid;i<n;i++)
        {
            if(num.charAt(i)=='?') cnt2++;
            else    mid2sum+=num.charAt(i)-'0';
        }
        int total=cnt1+cnt2;
        if(total%2==1) return true;
       
    return 2*(mid1sum-mid2sum)!=9*(cnt2-cnt1);    
    }
}