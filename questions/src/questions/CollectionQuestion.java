package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class CollectionQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Customer> customerMap = new HashMap<>();
		Customer ram = new Customer(1001,"Ram",9999);
		customerMap.put(ram.getName(),ram);
		HashSet<Address> officeAddress = new HashSet<>();
		officeAddress.add(new Address("delhi","delhi","110085"));
		officeAddress.add(new Address("delhi","delhi","110085"));
		officeAddress.add(new Address("delhi","delhi","110085"));
		officeAddress.add(new Address("mumbai","mumbai","220085"));
		officeAddress.add(new Address("mumbai","mumbai","220085"));
		HashMap<String,HashSet<Address>> addressMap = new HashMap<>();
		addressMap.put("office",officeAddress);
		ram.setAddressMap(addressMap);
		
		TreeMap<Integer, Order> orderMap = new TreeMap<>();
		Order order =new Order(1,"Mobile", new Date());
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product(1001, "Apple", 9999));
		products.add(new Product(1002, "Nokia", 7999));
		Collections.sort(products,(first, second)->((Double)first.getPrice()).compareTo(second.getPrice()));
		order.setProducts(products);
		orderMap.put(order.getId(), order);	
		Order order2 =new Order(2,"Led", new Date());
		orderMap.put(order2.getId(),order2);
		ram.setOrderMap(orderMap);
		
		
		Customer shyam = new Customer(1002,"Shyam",19999);
		customerMap.put(shyam.getName(),shyam);
		System.out.println("Enter the Customer Name");
		String name = scanner.next();
		Customer customer = customerMap.get(name);
		if(customer==null) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found "+customer);
			System.out.println("Enter the Type of address office or res");
			String type = scanner.next();
			HashSet<Address> address = ram.getAddressMap().get(type);
			Iterator<Address> addIter = address.iterator();
			while(addIter.hasNext()) {
				System.out.println(addIter.next());
			}
			System.out.println("Enter the order id ");
			int id = scanner.nextInt();
			Order orderObj = customer.getOrderMap().get(id);
			System.out.println(orderObj);
		}
		scanner.close();

	}

}
