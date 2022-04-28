import java.util.Arrays;
import java.util.Stack;

public class Day18 {

	public static void main(String[] args) {
		
	   int[] arr = new int[] {10, 5, 2, 7, 8, 7};
	   int k=3;
	   maxSlidingWindow(arr,k) ;
		
	}
	public static void maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int greater[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(greater, n);
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                int temp = st.pop();
                greater[temp] = i;
            }
            st.push(i);
        }
        int ans[] = new int[n - k + 1];
        int pos = 0;
        for(int i = 0; i < n - k + 1; i++) {
            int j = i;
            while(greater[j] < i + k) {
                j = greater[j];
            }
            System.out.println(nums[j]);
        }
        
    }

}
