package com.brainmentors.todolist.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brainmentors.todolist.helper.ToDoList;
import com.google.gson.Gson;

/**
 * Servlet implementation class JSonServlet
 */
@WebServlet("/JSonServlet")
public class JSonServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ToDoList todoList = new ToDoList(1001, "Meeting at 6", "Meeting at CP", LocalDate.now());
		Gson gson = new Gson();
		String json = gson.toJson(todoList);
		PrintWriter out = response.getWriter();
		response.setContentType( "application/json" );
		out.println(json);
		out.close();
				
	}

}
