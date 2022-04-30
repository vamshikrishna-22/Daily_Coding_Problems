import java.util.ArrayList;

public class Day16 {
	
	static ArrayList<Integer> log;

	public static void main(String[] args) {
		
		log = new ArrayList<>();
		record(1);
		record(12);
		record(18);
		record(71);
		
		get_last(3);
		
		
	}

	private static void get_last(int i) {
		for(int j=log.size()-i;j<log.size();j++) {
			System.out.println(log.get(j));
		}
	}

	private static void record(int i) {
		log.add(i);
	}
	
	

}
