package com.brainmentors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalcBean
 */
@Stateless

public class CalcBean implements CalcBeanRemote, CalcBeanLocal {

    /**
     * Default constructor. 
     */
	@PostConstruct
	public void start() {
		
	}
	@PreDestroy
	public void end() {
		
	}
	
    public CalcBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

}
