package org.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utility.Log;

import org.openqa.selenium.By;


public class General extends Global{
	public void openApplication() {
		driver=new  ChromeDriver();
		driver.navigate().to(url);
		Log.info("open application successfully");
	}
	public void login() {
		driver.findElement(By.name(txt_loginName)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Log.info("login successfully");

	}
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		Log.info("logout cmplted");

		}
		public void closeApp() {
			driver.close();
			Log.info("close application successfully");

	}
		public void addEmployee() {
			driver.switchTo().frame(iframe);
			driver.findElement(By.xpath(btn_Add)).click();
			driver.findElement(By.xpath(txtbox_Fname)).sendKeys(F_name);
			driver.findElement(By.xpath(txtbox_Lname)).sendKeys(L_name);
			driver.findElement(By.id(btn_Save)).click();
			driver.switchTo().defaultContent();
			Log.info("add employee successfully");

			
		}
		public void edit_Employee_Details() {
		
			driver.findElement(By.xpath(empname)).click();
			driver.findElement(By.xpath(btn_Edit)).click();
			driver.findElement(By.xpath(Edit_emp_fname)).clear();
			driver.findElement(By.xpath(Edit_emp_fname)).sendKeys(new_Fname);;
			driver.findElement(By.xpath(Edit_emp_lname)).clear();
			driver.findElement(By.xpath(Edit_emp_lname)).sendKeys(new_Lname);
			driver.findElement(By.xpath(btn_Save)).click();
			Log.info("edit employee successfully");

		}
			
			public void enter_frame() {
				driver.switchTo().frame(iframe);
				Log.info("enter frame successfully");

			}
				public void exit_frame() {
				driver.switchTo().defaultContent();
				Log.info("exit frame successfully");

				
				}
				
				
			
		
		
		public void delete_empid() {
			driver.switchTo().frame(iframe);
			driver.findElement(By.name(checkbox)).click();
			driver.findElement(By.xpath(btn_dlt)).click();
			driver.switchTo().defaultContent();
			Log.info("dlt employee successfully");


			
			
		}

}
