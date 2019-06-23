import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
@FunctionalInterface
interface Calc{
	int compute(int x , int y);
}
@FunctionalInterface
interface Run<T>{
	void traverse(T x);
}
//class MyRun implements Run{
//	@Override
//	public void traverse(int x) {
//		System.out.println("X is "+x);
//	}
//}
public class Demo1 {
	static ArrayList<Integer> l = new ArrayList<>(100);
	static ArrayList<String> s = new ArrayList<>();
	static void forEach(Run run) {
		for(int i = 0 ; i<l.size(); i++) {
			run.traverse(l.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CopyOnWriteArrayList<E>
		Calc c = (a,b)->a+b;
		System.out.println("Add "+c.compute(1000,2000));
		s.add("ram");
		s.add("shyam");
		System.out.println("Printing Strings......");
		forEach((ele)->System.out.println(ele));
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(300);
		l.add(300);
		l.add(10);
		l.add(20);
		l.add(1,10000);
		System.out.println("NOW PRINTING *********************");
		//forEach(new MyRun());
		forEach((x)->System.out.println("X is "+x));
		System.out.println(l);
		l.remove(0);
		System.out.println("After Remove "+l);
		l.set(0, 888888);
		System.out.println("After Update "+l);
		System.out.println(l.contains(300)?"Found":"Not Found");
		System.out.println("Single "+l.get(0));
		System.out.println(l.indexOf(300));
		System.out.println(l.lastIndexOf(300));
		Collections.sort(l);
		//l.sort();
		System.out.println("After Sort "+l);
		System.out.println(l.size());
		l.trimToSize();
		// Traverse
		System.out.println("******************************");
//		for(int i= 0; i<l.size(); i++) {
//			System.out.println(l.get(i));
//		}
		// Enhance for loop
//		for(int i : l) {
//			System.out.println(i);
//		}
//		Iterator<Integer> i = l.iterator();
//		while(i.hasNext()) {
//			i.next();
//			//System.out.println(i.next());
//			i.remove();
//		}
//		ListIterator<Integer> i = l.listIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		while(i.hasPrevious()) {
//			System.out.println(i.previous());
//		}
		// for each
		l.forEach((ele)->System.out.println(ele));
		
		//System.out.println(l.toString());
		
		
		

	}

}
