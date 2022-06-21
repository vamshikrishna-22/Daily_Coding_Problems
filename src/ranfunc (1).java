package dailyCodingPractice;

public class ranfunc {

	public static void main(String[] args) {
		System.out.println("rand7");
		System.out.println(rand7());
		System.out.println(rand7());
		System.out.println(rand7());
		System.out.println(rand7());
		System.out.println("rand5");
		System.out.println(rand5());
		System.out.println(rand5());
		System.out.println(rand5());
		System.out.println(rand5());
		
	}
	
	public static int rand5() {
		
		return (int) (Math.random()*(5-1+1)+1);  
	}
	
	public static int rand7() {
		
		return (int) (Math.random()*(7-1+1)+1);  
	}

}
