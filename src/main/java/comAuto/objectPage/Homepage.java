package comAuto.objectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	private WebDriver driver;
	@FindBy(linkText="Chapter1")
	WebElement chapter1;
	@FindBy(linkText="Chapter2")
	WebElement chapter2;
	@FindBy(linkText="Chapter3")
	WebElement chapter3;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
public ChapterFirstPage clickChapterfirst(){
	chapter1.click();
	return PageFactory.initElements(driver, ChapterFirstPage.class);
	}
public ChapterSecondPage clickChaptersecond(){
	chapter2.click();
	return PageFactory.initElements(driver, ChapterSecondPage.class);
	}
public void clickChapterThird() {
chapter3.click();
}
}
