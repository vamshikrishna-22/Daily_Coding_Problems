import java.util.Arrays;

public class Max3Product {

	public static void main(String[] args) {
		
		int[] arr = new int[] {-10, -10, 5, 2};
		System.out.println("Max product = "+ maximumProduct(arr));
	}
	
	    public static int maximumProduct(int[] nums) {
	               
	        int n = nums.length; 
	        int max = Integer.MIN_VALUE;
	        Arrays.sort(nums);

	        max = Math.max(max, nums[0]*nums[1]*nums[n-1]);
	        max = Math.max(max, nums[n-1]*nums[n-2]*nums[n-3]);

	        return max;
	        
	    }
	

}
