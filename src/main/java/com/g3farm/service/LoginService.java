package com.g3farm.service;
import java.util.List;

import org.apache.log4j.Logger;

import org.springframework.orm.hibernate5.HibernateTemplate;

 

import com.g3farm.model.G3FarmFarmer;

public class LoginService {
	private HibernateTemplate hibernateTemplate;
	
	    private static Logger log = Logger.getLogger(LoginService.class);
	
	 
	
	    private LoginService() { }
	
	 
	
	    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	
	        this.hibernateTemplate = hibernateTemplate;
	
	    }
	
	 
	
	    @SuppressWarnings( { "unchecked", "deprecation" } )
	
	    public boolean findUser(String uname, String upwd) {
	
	        log.info("Checking the user in the database");
	
	        boolean isValidUser = false;
	
	        String sqlQuery = "from Farm_Farmers u where u.FName=? and u.password=?";
	
	        try {
	
	            List<G3FarmFarmer> userObj = (List) hibernateTemplate.find(sqlQuery, uname, upwd);

	            if(userObj != null && userObj.size() > 0) {
	
	                log.info("Id= " + userObj.get(0).getFId() + ", Name= " + userObj.get(0).getFName() + ", Password= " + userObj.get(0).getPassword());

	                isValidUser = true;
	
	            }
	
	        } catch(Exception e) {
	
	            isValidUser = false;
	
	            log.error("An error occurred while fetching the user details from the database", e);    
	
	        }
	
	        return isValidUser;
	
	    }


}
