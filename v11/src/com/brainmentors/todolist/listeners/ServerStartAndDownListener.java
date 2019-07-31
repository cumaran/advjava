package com.brainmentors.todolist.listeners;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.brainmentors.todolist.dao.CommonGenericDAO;
import com.brainmentors.todolist.dto.CommonGenericDTO;
import com.brainmentors.todolist.utils.CacheStore;

/**
 * Application Lifecycle Listener implementation class ServerStartAndDownListener
 *
 */
@WebListener
public class ServerStartAndDownListener implements ServletContextListener {
	
	
    /**
     * Default constructor. 
     */
    public ServerStartAndDownListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("Server Down");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	
    	try {
			ArrayList<CommonGenericDTO> cityList= CommonGenericDAO.getByKey("city");
			ArrayList<CommonGenericDTO> menuList= CommonGenericDAO.getByKey("menu");
			CacheStore.cacheMap.put("city",cityList);
			CacheStore.cacheMap.put("menu",menuList);
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
//    	for(int i = 1; i<=100; i++) {
//    		System.out.println("Caching "+i);
////    		try {
////				Thread.sleep(350);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//    	}
    }
	
}
