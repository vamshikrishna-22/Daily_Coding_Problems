
public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {3, 2, 1};
		int[] ans =  productWithoutSelf(arr) ;
		for(int i : ans) {
			System.out.println(i);
		}
	}
	
	public static int[] productWithoutSelf(int[] nums) {
        int[] arr = new int[nums.length];
        
        int prod = 1;
//         left to right array
        arr[0] = 1;
        for(int i =1; i<arr.length; i++){
            arr[i] = prod * nums[i-1];
            prod = prod*nums[i-1];
        }
//         for array right to left
        prod = 1;
        for(int i = arr.length-2; i>=0; i--){
            arr[i] = arr[i] * prod*nums[i+1];
            prod = prod*nums[i+1];
        }
        
        return arr;
	}

}
