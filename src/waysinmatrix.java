package dailyCodingPractice;
/*
 * This problem was asked by Facebook.

There is an N by M matrix of zeroes. 
Given N and M, write a function to count
 the number of ways of starting at the 
 top-left corner and getting to the bottom-right 
 corner. You can only move right or down.

For example, given a 2 by 2 matrix, you should
 return 2, since there are two ways to get to 
 the bottom-right:

Right, then down
Down, then right
Given a 5 by 5 matrix, there are 70 ways to get to the bottom-right.


 */
public class waysinmatrix {
	
	//version 1
	public static void main(String[] args) {
		int[][] arr = new int[][] {{0,0,0},{0,0,0}};
		System.out.println(ways(arr,0,0));
		System.out.println(ways2(5,5));
	}
	
	public static int ways(int[][] arr,int i,int j) {
		if((i == (arr.length-1)) && (j == (arr[0].length-1))) {
			return 1;
		}
		else if(i < arr.length && j < arr[0].length) {
			return ways(arr,i+1,j) + ways(arr,i,j+1);
		}else {
			
			return 0;
		}
		
		
	}
	
	//version 2
	public static int ways2(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i=0;i<n;i++)
            dp[0][i]=1;
        for(int i=0;i<m;i++)
            dp[i][0]=1;
        
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        return dp[m-1][n-1];
    }

}
