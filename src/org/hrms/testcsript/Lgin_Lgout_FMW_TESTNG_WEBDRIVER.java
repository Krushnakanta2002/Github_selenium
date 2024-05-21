package org.hrms.testcsript;

import org.hrms.lib.General;
import org.testng.annotations.Test;

public class Lgin_Lgout_FMW_TESTNG_WEBDRIVER {
	@Test
	public void login_logout() {
		General g=new General();
		g.openApplication();
		g.login();
		g.logout();
		g.closeApp();
		
		
		
		
		
	}

}
