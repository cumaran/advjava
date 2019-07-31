package com.brainmentors.todolist.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UploadFileController
 */
@WebServlet("/uploadFile")
public class UploadFileController extends HttpServlet {
	private static final String UPLOAD_DIRECTORY = "uploads";
	private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3; // 3MB
	private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		if (!ServletFileUpload.isMultipartContent(request)) {
			
			
			writer.println("Error: Form must has enctype=multipart/form-data.");
			writer.flush();
			return;
		}
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String uploadLocation = rb.getString("uploadpath");
		System.out.println("Upload Location is "+uploadLocation);
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(MEMORY_THRESHOLD);
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setFileSizeMax(MAX_FILE_SIZE);
		upload.setSizeMax(MAX_REQUEST_SIZE);
		
		
		
		File uploadDir = new File(uploadLocation);
		if (!uploadDir.exists()) {
		uploadDir.mkdir();
		}
		try {
			List<FileItem> formItems = upload.parseRequest(request);
				if (formItems != null && formItems.size() > 0) {
					for(FileItem formItem: formItems) {
						if(!formItem.isFormField()) {
							String fileName = new File(formItem.getName()).getName();
							String fullPath = uploadLocation + File.separator + fileName;
							System.out.println("File Name is "+fileName);
							System.out.println("Full Path is "+fullPath);
							File storeFile = new File(fullPath);
							formItem.write(storeFile);
							writer.println("File Uploaded....");
							
							
						}
					}
				}
		}
		catch(Exception e) {
			System.out.println("Error "+e);
			e.printStackTrace();
		}
	}
}
						
					

