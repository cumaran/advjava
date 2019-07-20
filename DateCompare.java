import java.time.LocalDate;
import java.util.LinkedHashMap;

public class DateCompare {

	public static void main(String[] args) {
		LinkedHashMap<String , Integer> l = new LinkedHashMap<String, Integer>();
		l.put("A", 10);
		System.out.println(l.toString());
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate d1 = LocalDate.of(2019, 07, 21);
		
		if(d1.equals(d)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
	}

}
