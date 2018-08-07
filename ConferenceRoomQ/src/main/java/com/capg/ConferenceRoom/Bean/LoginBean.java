package com.capg.ConferenceRoom.Bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBean {

	@FindBy(how=How.NAME, name="username")
	private WebElement username;
	
	public String getUsername() {
		return username.getAttribute("username");
	}
	public void setUsername(String username) {
		this.username.sendKeys(username);;
	}
	
	@FindBy(how=How.NAME, name="password")
	private WebElement password;
	public String getPassword() {
		return password.getAttribute("password");
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	@FindBy(how=How.NAME, name="login")
	private WebElement login;	
	public void submit() {
		login.click();
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	@FindBy(how=How.NAME, name="cancel")
	private WebElement cancel;	
	public void cancel() {
		cancel.click();
	}	
	public WebElement getCancel() {
		return cancel;
	}
	public void setCancel(WebElement cancel) {
		this.cancel = cancel;
	}
	
	
		
}
