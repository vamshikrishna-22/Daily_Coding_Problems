package dailyCodingPractice;

/**
 * “ Given a multiset of integers, return whether
 *  it can be partitioned into two subsets
 *   whose sums are the same. For example,
 *    given the multiset {15, 5, 20, 10, 35, 15, 10},
 *     it would return true, since we can split it up 
 *     into {15, 5, 10, 15, 10} and {20, 35}, which both 
 *     add up to 55. Given the multiset {15, 5, 20, 10, 35}, 
 *     it would return false, since we can’t split it up into 
 *     two subsets that add up to the same sum. ”
 * 
 * @author Rushvik
 *
 */
public class Day60 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {15, 5, 20, 10, 35, 15, 10};
		int count=0;
		int sum=0;
		for(int i : arr) {
			sum= sum+ i;
		}	
		
		if(sum % 2 == 0) {
			System.out.println(partition(arr,count,0,sum/2));
		}else {
			System.out.println(false);
		}
	}
	
	public static boolean partition(int[] arr,int count,int i,int sum) {
		if(count == sum) {
			return true;
		}
		if(i < arr.length) {
			count = count + arr[i];
			i++;
			if(partition(arr,count,i,sum)) {
				return true;
			}
			i++;
			if(partition(arr,count,i,sum)) {
				return true;
			}
		}				
		return false;
	}
	

}