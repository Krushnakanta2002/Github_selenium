package org.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//Test Data
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	
	
	public String F_name="Sai";
	public String L_name="Krishna";
	public String new_Fname="dj";
	public String new_Lname="bapu";
	

	
	
	
	
	
	
	//Objects___Elements
public String txt_loginName="txtUserName";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String link_logout="Logout";
//xpaths
public String btn_Add="/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
//xpath
public String txtbox_Fname="/html/body/form/div/div[1]/div[2]/input[3]";
//xpath
public String txtbox_Lname="/html/body/form/div/div[1]/div[2]/input[2]";
//xpath
public String btn_Save="/html/body/form/div[2]/div[1]/div[2]/div[2]/input[1]";
//id[rightMenu]
public String iframe="rightMenu";
//xpath
public String btn_Edit="/html/body/form/div[2]/div[1]/div[2]/div[2]/input[1]";
//xpath[frame data]
public String empname="/html/body/div/div[2]/form/table/tbody/tr[2]/td[3]/a";
//xpath
public String Edit_emp_fname="/html/body/form/div[2]/div[1]/div[2]/input[4]";
//xpath
public String Edit_emp_lname="/html/body/form/div[2]/div[1]/div[2]/input[3]";

//delet
//name
public String checkbox="chkLocID[]";
//delete btn[xpath]
public String btn_dlt="/html/body/div/div[2]/form/div[3]/div[1]/input[2]";




}

