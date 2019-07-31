package com.brainmentors.todolist.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brainmentors.todolist.helper.TodoListOperations;

/**
 * Servlet implementation class SortController
 */
@WebServlet("/sort")
public class SortController extends HttpServlet {
	TodoListOperations opr = new TodoListOperations();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		opr.sort();
		request.setAttribute("mydata", TodoListOperations.list);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
