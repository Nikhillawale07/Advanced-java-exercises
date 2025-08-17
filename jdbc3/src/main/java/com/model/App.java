package com.model;

import com.dao.EmployeeDao;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDao ed =new EmployeeDao();
        Employee e1 = ed.findEmployeeById(2);
        System.out.println(e1);
    	
    }
}