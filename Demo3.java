import java.util.ArrayList;
import java.util.Collections;

interface P1{
	int show(int x, int y);
}
class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "\n]";
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stdList = new ArrayList<>();
		stdList.add(new Student(1001,"Ram"));
		stdList.add(new Student(1002,"Anil"));
		stdList.add(new Student(1000,"Ajay"));
		Collections.sort(stdList
				,(first, second)->
		first.name.compareTo(second.name));
		System.out.println("After Sort");
		System.out.println(stdList);
		P1 obj = (a,b)->a+b;
		System.out.println(obj.show(1000, 2000));

	}

}
