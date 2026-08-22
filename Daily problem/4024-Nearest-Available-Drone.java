class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int nearest=-1;
            int minD=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++)
            {
        int ans=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
                if(drones[i][2]>=ans)
                {
                    if(ans<minD)
                    {
                        minD=ans;
                        nearest=i;
                   
                }
                  // if(drones[i][2]>ans)
                  //   return 1;
            }
            }
            
    
    return nearest;
    }
}