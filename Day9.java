
public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[]{2, 4, 6, 2, 5};
	    System.out.println(maxAdjacent(nums)); //ouput = 13;
		
	    nums = new int[]{5, 1, 1, 5};
	    System.out.println(maxAdjacent(nums)); //output = 10;
	}
	
	public static int maxAdjacent(int[] nums) {
		final int n = nums.length;
		if (n == 0)
		return 0;
		if (n == 1)
		return nums[0];


		int[] dp = new int[n];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);

		for (int i = 2; i < n; ++i)
		  dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);

		return dp[n - 1];
		}

}
