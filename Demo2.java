import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
class Stack<T>{
	ArrayList<T> data = new ArrayList<>();
	void push(T d) {
		this.data.add (d);
	}
	T pop() {
		return this.data.get(this.data.size()-1);
	}
	ArrayList<T> getAll() {
		return this.data;
	}
}
class A1{
	
}
class B1 extends A1{
	
}
class C1 extends B1{
	
}
class D1{
	
}
public class Demo2 {
//	static void print(ArrayList<A1> obj) {
//		//obj.add(new B1());
//		System.out.println(obj);
//	}
//	static void print(ArrayList<?> obj) {
//		//obj.add(new B1());
//		System.out.println(obj);
//	}
//	static void print(ArrayList<Object> obj) {
//		//obj.add(new B1());
//		System.out.println(obj);
//	}
//	static void print(ArrayList<? extends A1> obj) {
//		//obj.add(new B1());
//		System.out.println(obj);
//	}
	static void print2(ArrayList<? extends Serializable> obj) {
		//obj.add(new B1());
		System.out.println(obj);
	}
	static void print(ArrayList<? super A1> obj) {
		//obj.add(new B1());
		System.out.println(obj);
	}
	public static void main(String[] args) {
		//A1 obj = new C1();
		Stack<Integer> s = new Stack<>();
		s.push(90);
		s.push(20);
		ArrayList<Integer> ttt = s.getAll();
		System.out.println(ttt);
//		ArrayList<Object> a11 = new ArrayList<>();
//		print(a11);
//		ArrayList<A1> a1 = new ArrayList<>();
//		print(a1);
//		ArrayList<B1> b1 = new ArrayList<>();
//		print(b1);
//		ArrayList<C1> c1 = new ArrayList<>();
//		print(c1);
//		ArrayList<D1> d1 = new ArrayList<>();
//		print(d1);
		
		A1 obj [] = {new B1(), new C1()};
		NavigableSet<Integer> i = new TreeSet<>();
		i.add(1);
		i.add(1);
		i.add(2);
		i.add(5);
		i.add(3);
		i.add(2);
		System.out.println(i.higher(3)); //>
		System.out.println(i.lower(3)); //<
		System.out.println(i.ceiling(3)); //>=
		System.out.println(i.floor(3)); //<=
		
		CopyOnWriteArrayList<Integer> cp  = new CopyOnWriteArrayList<Integer>();
		cp.add(10);
		cp.add(20);
		cp.add(30);
		for(Integer w : cp) {
			cp.add(10000);
		}
		ArrayList<String> a = new ArrayList<>();
		a.add("hello");
		a.add("ok");
		List<String> tt= Collections.synchronizedList(a);
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("ram",2222);
		map.put("shyam",32222);
		map.put("tim",42222);
		map.put("kim",12222);
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
//		Set<String> keys = map.keySet();
//		Iterator<String> i = keys.iterator();
//		while(i.hasNext()) {
//			String key = i.next();
//			System.out.println(key +" "+map.get(key));
//		}
		
	}

}
