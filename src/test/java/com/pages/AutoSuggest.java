package com.pages;


	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindAll;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Reporter;

	public class AutoSuggest {
		
		WebDriver driver;
		
		@FindBy(xpath="/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")
		                 WebElement searchbar;
		@FindAll(@FindBy(xpath="/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul"))
		                 List<WebElement> suggestions;
		
		@FindBy(name="btnK") WebElement searchbutton;
		
		
		public AutoSuggest(WebDriver driver){		
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}
	    public void setsearchinput(String input) {
				searchbar.sendKeys(input);
				
			}
		public List<WebElement> getsuggestions(){
				return suggestions;	
			
		}
		public void clicksearch() {
				searchbutton.click();	
			}
		public void setSearchSubmit() {
			searchbar.submit();
		}
	}

