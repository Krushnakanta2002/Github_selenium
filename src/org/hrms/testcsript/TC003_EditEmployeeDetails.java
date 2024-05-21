package org.hrms.testcsript;

import org.hrms.lib.General;

public class TC003_EditEmployeeDetails {
	public static void main(String[] args) throws Exception{
		General g=new General();
		g.openApplication();
		g.login();
		g.edit_Employee_Details();
	
		g.logout();
		g.closeApp();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
