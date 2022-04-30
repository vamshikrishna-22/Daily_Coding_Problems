import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day22 {

	public static void main(String[] args) {
		String[] str = new String[] {"the", "quick", "brown", "fox" };
		String s = "thequickbrownfox" ;
		if(getReconstruction(str,s) != null) {
	  List<String> ans = getReconstruction(str,s);
	  for(String i : ans) {
		  System.out.println(i);
	  }
		}else {
			System.out.println("null");
		}
	}
	
	public static List<String> getReconstruction(String[] str,String s) {
		HashMap<String,Integer> map = new HashMap<>();
		for(String i : str) {
			map.put(i, 1);
		}		
		int i=1;
		int j=0;
		List<String> ans = new ArrayList<>();
 		while(i<=s.length() && j<s.length()) {
			
			if(map.containsKey(s.substring(j, i))) {
				ans.add(s.substring(j, i));
				j=i;
				
			}
			i++;		
		}
		if(ans.size() == 0) {
			return null;
		}
		return ans;
	}

}
