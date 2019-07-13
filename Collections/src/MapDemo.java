import java.util.ArrayList;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//Hashtable<String, Integer> phoneMap = new Hashtable<>();
		//TreeMap<String,Integer> phoneMap = new TreeMap<>();
		//LinkedHashMap<String,Integer> phoneMap = new LinkedHashMap<>();
		HashMap<String,ArrayList<Integer>> phoneMap = new HashMap<>();
		ArrayList<Integer> p = new ArrayList<>();
		p.add(2222);
		p.add(3222);
		p.add(4222);
		p.add(5222);
		phoneMap.put("amit", p);
		System.out.println(phoneMap);
		//		phoneMap.put("tim",null);
//		phoneMap.put("ram",3222);
//		phoneMap.put("shyam",4222);
//		phoneMap.put("ram",5555);
//		phoneMap.put("amit",2222);
		//System.out.println(phoneMap);

	}

}
