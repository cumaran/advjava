package com.brainmentors.todolist.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brainmentors.todolist.utils.CacheStore;

/**
 * Servlet implementation class ComboController
 */
@WebServlet("/combo")
public class ComboController extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = this.getServletConfig().getServletContext();
		System.out.println("GET IN COMBO CTRL "+sc.getAttribute("share"));
		request.setAttribute("city",CacheStore.cacheMap.get("city"));
		RequestDispatcher rd = request.getRequestDispatcher("combo.jsp");
		rd.forward(request, response);
	}

}
