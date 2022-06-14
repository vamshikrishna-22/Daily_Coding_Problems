package dailyCodingPractice;
import java.util.*;
/**
 * Given an array of integers where every integer occurs 
 * three times except for one integer, which only occurs once,
 *  find and return the non-duplicated integer.

For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

 * @author rushvikallampally
 *
 */

public class repeate3 {

	public static void main(String[] args) {
		int[] arr = new int[] {6,1,1,1,2,3,3,3,6,6};
		System.out.println(singleNumber(arr));
	}
	public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int e:nums){
            if(hm.containsKey(e)){
                hm.put(e,hm.get(e)+1);
            }else {
                hm.put(e,1);
            }
        }
        for (int m:hm.keySet()){
            if(hm.get(m)==1){
              return m ;
            }
        }
            return -1;
    }

}
