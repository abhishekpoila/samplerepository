package com.Auto_Utillibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import comAuto.objectPage.ChapterFirstPage;
import comAuto.objectPage.ChapterSecondPage;
import comAuto.objectPage.Homepage;

public class GenericUtilLibrary {
	protected WebDriver driver;
	protected String baseurl;
	protected Homepage homepage;
	protected ChapterSecondPage chaptersecond;
	protected ChapterFirstPage chapterfirstpage;
	
	@BeforeSuite
	public void setup()
	{
		baseurl="http://book.theautomatedtester.co.uk/";
		System.setProperty("webdriver.ie.driver", "E://Programming_Softwares//IEDriverServer_Win32_2.53.1//IEDriverServer.exe");
	    driver=new InternetExplorerDriver();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	}
	
	@AfterSuite
	public void teardown() throws Exception
	{
		driver.quit();
	}

}
