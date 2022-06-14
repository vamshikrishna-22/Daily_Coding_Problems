package dailyCodingPractice;
/**
 * Implement integer exponentiation. 
 * That is, implement the pow(x, y) function,
 *  where x and y are integers and returns x^y.

Do this faster than the naive method of repeated 
multiplication.

For example, pow(2, 10) should return 1024.
 * @author rushvikallampally
 *
 */
public class pow {

	public static void main(String[] args) {
		System.out.println(Pow(2,10));
		System.out.println(power(2,10));
	}
	
	public static int Pow(int x , int y) {
		int z =1;
		for(int i=1;i<=y;i++) {
			z=z*x;
		}
		
		return z;
	}
	
	public static int power(int x, int y)
    {
        int temp;
        if( y == 0)
            return 1;
        temp = power(x, y/2); 
          
        if (y%2 == 0)
            return temp*temp;
        else
        {
            if(y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    } 


}
