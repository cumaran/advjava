package com.brainmentors.todolist.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Download
 */
@WebServlet("/download")
public class Download extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String downloadPath = ResourceBundle.getBundle("db").getString("uploadpath");  
		String fileName = "amitsrivastava.jpeg";
		response.setContentType("image/jpeg");
	      response.setHeader("Content-disposition", "attachment; filename=amit.jpeg");
	      FileInputStream fs = new FileInputStream(downloadPath+File.separator+fileName);
	      byte b[] = fs.readAllBytes();
	      response.getOutputStream().write(b);
	      
	}	

}
