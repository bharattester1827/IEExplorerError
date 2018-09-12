package IEExplorerError.ieExplorerError;

import org.openqa.selenium.By;

public class Homepage extends Utils {
	
	private By _signinbtn = By.xpath(".//*[@class = 'gmail-nav__nav-link gmail-nav__nav-link__sign-in']");
	private By _username = By.id("identifierId");
	private By _nextbtnclick = By.id("identifierNext");
	private By _password = By.id("password");
	private By _passwordnextbtn = By.id("passwordNext");
	private By _submitbtn = By.id("");
	
	public void SigninBtn() {
		Utils.ClickOnElement(_signinbtn);
	}
	public void usernameenter () {
		Utils.EnterText(_username, "email1726");
	}
	public void passwordenter () {
		Utils.EnterText(_password, "abcd1234");
	}
	public void loginbth () {
		Utils.ClickOnElement(_submitbtn);
	}
	public void ClickonNextbtn () {
		Utils.javascriptexecutor(_nextbtnclick);
	}
	public void Clickonpasswordnextbtn () {
		Utils.javascriptexecutor(_passwordnextbtn);
	}
}
