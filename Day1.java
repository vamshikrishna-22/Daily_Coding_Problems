import java.util.HashMap;
import java.util.Map;

public class Day1 {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 15, 3, 7};
		int k = 17;
		System.out.println(TwoSum(arr,k));
	}
	
	public static boolean TwoSum(int[] arr,int k) {
		
		if(arr.length <2) {
			return false;
		}
		
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(Math.abs(arr[i]-k))){
				return true;
			}else {
				map.put(arr[i],1);
				
			}
		}
		
		
		return false;
	}

}
