package org.hrms.testcsript;
import org.hrms.lib.*;

public class TC002_AddEmployee {
	public static void main(String[] args) throws Exception{
		General g=new General();
		g.openApplication();
		g.login();
		g.addEmployee();
		g.logout();
		g.closeApp();
		
	}

}
