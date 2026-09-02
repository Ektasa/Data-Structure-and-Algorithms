class Solution {
    public boolean isHappy(int n) {
    //    int slow=n; int fast=n;
    //    do{
    //         slow=square(slow);
    //         fast=square(square(fast));
    //    }while(slow!=fast);
    //    return slow==1;
        
    // }
    // public int square(int num)
    // {
    //     int ans=0;
    //     while(num>0)
    //     {
    //         int re=num%10;
    //         ans+=re*re;
    //         num/=10;
    //     }
    //     return ans;
    // }

    HashSet<Integer> hash=new HashSet<>();

    while(n!=1)
    {
        if(hash.contains(n)){ return false;}

        hash.add(n);
        int sum=0;
        while(n>0)
        {
            int n1=n%10;
            sum+=n1*n1;
            n=n/10;
        }
        n=sum;
        //if(sum==1) return true;
    }
        return true;
}
}