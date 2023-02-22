package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseutils;

public class JavaScriptAlertsPage extends baseutils{
	
	//call baseutils class
	baseutils bu = new baseutils();
	
	//create a constructor
	public JavaScriptAlertsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//locators for JsAlert
	@FindBy (xpath = "//button[@onclick='jsAlert()']")
	WebElement btnjsAlert;
	
	//locators for JsAlert
	@FindBy (xpath = "//button[@onclick='jsConfirm()']")
	WebElement btnjsConfirm;
		
	//locators for JsAlert
	@FindBy (xpath = "//button[@onclick='jsPrompt()']")
	WebElement btnjsPrompt;
	
	//methods to handle alert
	public String JsAlert() {
		String textInAlert = bu.HandlingAlert(driver, btnjsAlert, "Click for JS Alert button");
		bu.AcceptAlert(driver);
		return textInAlert;
	
	}
	
	public String JsConfirm() {
		String TextinConfirm = bu.HandlingAlert(driver, btnjsConfirm, "Click for JS confirm button");
		bu.AcceptAlert(driver);
		return TextinConfirm;
	}
	
	public String JsPromt() {
		String AlertMessage = bu.HandlingAlert(driver, btnjsPrompt, "Click for JS Prompt button");
		String TextTyped = bu.EnterInalert(driver, "HI! This is the text in alert");
		bu.AcceptAlert(driver);
		return TextTyped;
	}
}
