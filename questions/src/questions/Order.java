package questions;

import java.util.ArrayList;
import java.util.Date;

public class Order {
private int id;
private String name;
private Date date;
private ArrayList<Product> products = new ArrayList<>();
public Order() {}
public Order(int id, String name, Date date) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
}


public ArrayList<Product> getProducts() {
	return products;
}
public void setProducts(ArrayList<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Order [id=" + id + ", name=" + name + ", date=" + date + " Products " +products+ "]";
}
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
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
