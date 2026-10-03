class Solution {
    int n;
    public int coinChange(int[] coins, int amount) {
    //     n=coins.length;
    //   return Solver(0,coins,amount);
      if(amount<0) return -1;
        if(amount==0){ return 0;}
       int minCount=Integer.MAX_VALUE;
       for(int coin:coins)
       {
        int res=coinChange(coins, amount-coin);
        if(res>=0 && res<minCount)
        {
            minCount=1+res;
       }
       }
       return (minCount==Integer.MAX_VALUE)?-1: minCount;

    }

//   public int Solver(int i,int[] coins, int amount)
//   {
//     if(amount<0) return -1;
//         if(amount==0){ return 0;}
//         if(n==i) {return 0;}
      
//             if(coins[i]>amount)
//             {
//                 return Solver(i+1,coins, amount);
//             }
//             int take=Solver(i,coins,amount-coins[i]);
//             int skip=Solver(i+1,coins, amount);

//             return take+skip; 
//         }
        
    
}