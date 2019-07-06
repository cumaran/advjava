package com.brainmentors.todolist.helper;

import java.util.ArrayList;
import java.util.Collections;

public class TodoListOperations {
	public static ArrayList<ToDoList> list = new ArrayList<>();
	public void add(ToDoList todo) {
		list.add(todo);
		System.out.println("List is "+list);
	}
public boolean delete(int id) {
		int index = search(id);
		if(index>=0) {
			list.remove(index);
			return true;
		}
		return false;
	}
public int search(int id ) {
	//"amit".equals("amit");
	//list.contains(id);
	ToDoList todo = new ToDoList();
	todo.setId(id);
	int index = list.indexOf(todo);
	return index;
	
}
public void update() {
	
}
public void sort() {
	Collections.sort(list);
}
public void showFinish() {
	
}
public void showPending() {
	
}
public void countFinish() {
	
}
public void countPending() {
	
}

}
