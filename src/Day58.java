package dailyCodingPractice;
/**
 * An sorted array of integers was 
 * rotated an unknown number of times.

Given such an array, find the index of the 
element in the array in faster than linear time.
 If the element doesn't exist in the array, return null.

For example, given the array [13, 18, 25, 2, 8, 10] 
and the element 8, return 4 (the index of 8 in the array).

 *
 */
public class Day58 {
	static int count=0;
	public static void main(String[] args) {
		int[] arr = new int[] {13, 18, 25, 2, 8, 10};
		
		System.out.println("location is : "+search(arr,2)+" count : "+count);
		
	}
	public static int search(int[] nums, int target) {

		return search(nums, target, 0, nums.length - 1);
	}

	private static int search(int[] nums, int target, int start, int end) {

		if (start == end) {
			if (nums[start] == target) {
				count++;
				return start;
			}
			return -1;
		}

		int mid = ((end - start) / 2) + start;
		if (target == nums[mid]) {
			return mid;
		}

		if (nums[start] <= nums[mid]) {
			// i.e. left half is not rotated
			if ((target <= nums[mid]) && (target >= nums[start])) {
				count++;
				return search(nums, target, start, mid - 1);
			}
		} else {
			// i.e. left half is rotated
			if ((target <= nums[mid]) || (target >= nums[start])) {
				count++;
				return search(nums, target, start, mid - 1);
			}
		}

		if (nums[mid] <= nums[end]) {
			// i.e. right half is not rotated
			if ((target >= nums[mid]) && (target <= nums[end])) {
				count++;
				return search(nums, target, mid + 1, end);
			}
		} else {
			// i.e. right half is rotated
			if ((target >= nums[mid]) || (target <= nums[end])) {
				count++;
				return search(nums, target, mid + 1, end);
			}
		}

		return -1;
	}
}
