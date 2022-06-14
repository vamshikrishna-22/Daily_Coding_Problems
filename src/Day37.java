package dailyCodingPractice;
import java.util.*;
/**
 * This problem was asked by Google.

The power set of a set is the set of all its subsets. 
Write a function that, given a set, generates its power set.

For example, given the set {1, 2, 3}, 
it should return {{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}.

You may also use a list or array to represent a set.

 * @author rushvikallampally
 *
 */
public class Day37 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3};
		List<List<Integer>> list = subsets(arr);
		System.out.println(list);
		
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }
    
    private static void dfs(int [] nums, int index, List<Integer> perm,  List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(perm));
            return;
        }
        perm.add(nums[index]);
        dfs(nums, index+1, perm, result);
        perm.remove(perm.size()-1);
        dfs(nums, index+1, perm, result);
    }


}
