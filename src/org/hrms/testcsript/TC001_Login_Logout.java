package org.hrms.testcsript;
import org.apache.log4j.xml.DOMConfigurator;
import org.hrms.lib.*;
import org.testng.annotations.Test;

public class TC001_Login_Logout {
	@Test
	public  void kp() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General g=new General();
		
		g.openApplication();
		g.login();
		g.logout();
		g.closeApp();
	}

}
