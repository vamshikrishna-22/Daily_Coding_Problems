
public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int N=4;
	    System.out.println(NoOfWays(N));
	}
	
	public static int NoOfWays(int N) {
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=1;		
		for(int i=2;i<=N;i++) {
			arr[i]= arr[i-1]+arr[i-2];
		}
		
		return arr[N];
		
	}

}
