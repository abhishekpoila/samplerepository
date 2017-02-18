package com.auto_Testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Auto_Utillibrary.GenericUtilLibrary;

import comAuto.objectPage.Homepage;

public class Testscript extends GenericUtilLibrary {
	@Test
	public void testbaseobject(){
		homepage=PageFactory.initElements(driver,Homepage.class);
		driver.get(baseurl);
		chaptersecond=homepage.clickChaptersecond();
		chaptersecond.clickbut2();
		chaptersecond.clickRandom();
		String data = chaptersecond.getTest();
		homepage = chaptersecond.clickIndex();
		
		chapterfirstpage = homepage.clickChapterfirst();
		chapterfirstpage.clickSecondAjaxButton();
		chapterfirstpage.clickSecondAjaxButton1(data);
		chapterfirstpage.selectDropDown("Selenium Core");
		chapterfirstpage.verifyButton();
		
	}

}
