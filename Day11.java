import java.util.ArrayList;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[] {"dog", "deer", "deal"};
		String s = "de";
		System.out.println(autoSuggestion(arr,s)); //output : [deer, deal] 
		
	}
	
	public static ArrayList<String> autoSuggestion(String[] arr,String s) {
		ArrayList<String> ans = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains(s)) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}

}
