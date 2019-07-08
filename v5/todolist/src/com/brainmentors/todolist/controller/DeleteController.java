package com.brainmentors.todolist.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brainmentors.todolist.helper.TodoListOperations;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	TodoListOperations opr = new TodoListOperations();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		PrintWriter out = response.getWriter();
		if(opr.delete(Integer.parseInt(id))) {
			request.setAttribute("mydata", TodoListOperations.list);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		else {
			out.println("NO ID FOUND CAN'T DELETE ");
		}
		out.close();
		//System.out.println("I am in Delete "+id);
	}

}
