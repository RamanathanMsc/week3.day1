package org.Department;

import org.College.College;

public class Department extends College {

public void deptName() {
	
	System.out.println("Dept name is ece");
		
	}

public void getStudentInfo(int id)
{
	System.out.println("get student info based on id");
}

public void getStudentInfo(int id,String name)
{
	System.out.println("get student info based on id&name");
}

public void getStudentInfo(String email,long phonenumber)
{
	System.out.println("get student info based on email and phonenumber");
}
}
