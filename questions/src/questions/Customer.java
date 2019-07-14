package questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Customer {
private int id;
private String name;
private HashMap<String,HashSet<Address>> addressMap = new HashMap<>();
private TreeMap<Integer, Order> orderMap = new TreeMap<>();
public Customer() {}
public Customer(int id, String name, double balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}
private double balance;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public HashMap<String, HashSet<Address>> getAddressMap() {
	return addressMap;
}
public void setAddressMap(HashMap<String, HashSet<Address>> addressMap) {
	this.addressMap = addressMap;
}

public TreeMap<Integer, Order> getOrderMap() {
	return orderMap;
}
public void setOrderMap(TreeMap<Integer, Order> orderMap) {
	this.orderMap = orderMap;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}

}
