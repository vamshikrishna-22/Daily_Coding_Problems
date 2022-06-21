package dailyCodingPractice;
/**
 * This problem was asked by Microsoft.

	A number is considered perfect if its digits
 	sum up to exactly 10.

	Given a positive integer n, return the
 	n-nth perfect number.

	For example, given 1, you should return 19.
 	Given 2, you should return 28.
 * 
 */
public class PerfectNum {

	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
		System.out.println(i+" = "+ findNth(i));
		
		}

	}
	
	public static int findNth(int n)
    {
        int count = 0;
  
        for (int curr = 19;; curr += 9) {
  
            
            int sum = 0;
            for (int x = curr; x > 0; x = x / 10) {
                sum = sum + x % 10;
            }
            
            if (sum == 10)
                count++;
  
          
            if (count == n)
                return curr;
        }
    }
}
