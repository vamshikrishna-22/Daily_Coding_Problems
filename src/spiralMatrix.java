package dailyCodingPractice;
/*
 * Given a N by M matrix of numbers,
 *  print out the matrix in a clockwise spiral.

For example, given the following matrix:

[[1,  2,  3,  4,  5],
 [6,  7,  8,  9,  10],
 [11, 12, 13, 14, 15],
 [16, 17, 18, 19, 20]]
 */
public class spiralMatrix {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,  2,  3,  4,  5},
		                           {6,  7,  8,  9,  10},
		                           {11, 12, 13, 14, 15},
		                           {16, 17, 18, 19, 20}} ;
		
		    printSpiral(arr);

	}
	
	public static void printSpiral(int[][] arr) {
		int row=arr.length-1;
		int col=arr[0].length-1;
		int n =  arr.length * arr[0].length ;
		int count = 0;
		int nrow=0;
		int ncol=arr[0].length-1;
		while(count < n) {
			
			for(int i=col-ncol;i<=ncol && count < n;i++) {
				System.out.println(arr[nrow][i]);
				count++;
			}
			nrow++;
			
			for(int i=nrow;i<=row-nrow+1 && count < n ;i++) {
				System.out.println(arr[i][ncol]);
				count++;
			}
			
			ncol--;
			
			for(int i=ncol;i>=col-ncol-1 && count < n ;i--) {
				System.out.println(arr[row-nrow+1][i]);
				count++;
			}
			
			
			for(int i=row-nrow;i>=nrow && count < n ;i--) {
				System.out.println(arr[i][col-ncol-1]);
				count++;
			}
			
			
		}
	}
}
