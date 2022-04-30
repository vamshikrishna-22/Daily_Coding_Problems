
public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{3, 4, -1, 1}; //got output 2
		System.out.println(findFirstMissing(arr));
		
		int[] arr1 = new int[]{1, 2, 0};
		System.out.println(findFirstMissing(arr1)); //got out 3

	}
	
	public static int findFirstMissing(int[] arr) {
		
		for(int i=0;i<arr.length ;i++) {
			
			if(i+1 != arr[i]) {
				if(arr.length > arr[i] && arr[i]>0)
				arr = swap(arr,i,arr[i]);
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			if(i+1 != arr[i]) {
				return i+1;
			}
		}
		
		return 0;
		
	}
	
	public static int[] swap(int arr[] , int i ,int j) {
		
		
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j] = arr[i];
		
		return arr;
	}

}
