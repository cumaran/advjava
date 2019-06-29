package com.brainmentors.todolist.helper;

import java.time.LocalDate;
import java.util.Date;

public class ToDoList {
	private int id;
	private String name;
	private String desc;
	private LocalDate date;
	public ToDoList(){
		
	}
	public ToDoList(int id, String name, String desc, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.date = date;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ToDoList [id=" + id + ", name=" + name + ", desc=" + desc + ", date=" + date + "]";
	}
	
	
	
}
