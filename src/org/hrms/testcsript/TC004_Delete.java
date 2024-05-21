package org.hrms.testcsript;

import org.hrms.lib.General;

public class TC004_Delete {

	public static void main(String[] args)  throws Exception{
		General g=new General();
		g.openApplication();
		g.login();
		g.delete_empid();
		g.logout();
		g.closeApp();
	}

}
