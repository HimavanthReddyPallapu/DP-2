// Time Complexity : O(M)
// Space Complexity : O(M)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

    public class Solution {
        public static int minCost(int[][] costs) {
            if(costs.length==0 ||costs==null)
            {
                return 0;
            }
            
            int m=costs.length;
            int dp[][]=new int[m][3];
            for(int i=0;i<=2;i++)
            {
                dp[m-1][i]=costs[m-1][i];
            }
            for(int i=m-2;i>=0;i--)
            {
                dp[i][0]=costs[i][0]+Math.min(dp[i+1][1],dp[i+1][2]);
                dp[i][1]=costs[i][1]+Math.min(dp[i+1][1],dp[i+1][2]);
                dp[i][2]=costs[i][2]+Math.min(dp[i+1][1],dp[i+1][2]);
                
            }
            int min=Integer.MAX_VALUE;
            for(int j=0;j<3;j++)
            {
                min=Math.min(min,dp[0][j]);
            }
            return min;
            
        }
        public static void main(String[] args)
        {
            int[][] arr=new int[][]{{17,2,17},{16,16,5},{14,3,19}};
            System.out.println(minCost(arr));
        }
    }


