package com.hib.DAO;

import java.util.List;

import com.hib.model.Customer;

public interface CustomerDAO {
	 
	    public void save(Customer c);
	     
	    public List<Customer> list();
	     
	}

