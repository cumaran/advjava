package com.brainmentors.todolist.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brainmentors.todolist.helper.MailHelper;
import com.brainmentors.todolist.helper.ToDoList;
import com.brainmentors.todolist.helper.TodoListOperations;

/**
 * Servlet implementation class ToDoListController
 */
@WebServlet("/todo")
public class ToDoListController extends HttpServlet {
	TodoListOperations opr ;
	public void init() {
		opr = new TodoListOperations();
		System.out.println("init call");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		String date = request.getParameter("enddate");
		//Date d = new Date(date);
		LocalDate d = LocalDate.parse(date);
		
		System.out.println("Date is "+d);
		ToDoList obj = new ToDoList(Integer.parseInt(id), name, desc, d);
		opr.add(obj);
		MailHelper.sendMail(name, obj.getDate());
		request.setAttribute("mydata", opr.list);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		//System.out.println("   I am in Post "+id+" "+name+" "+desc+"   "+date );
		
	}

}
