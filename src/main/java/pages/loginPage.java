package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginPage {
	WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\eclipse\\eclipseIDE-jars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}	
	
	public void openLoginPage()
	{
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=3S7NwusX0hE&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiM1M3Tnd1c1gwaEUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0NTk3NzY3NywiaWF0IjoxNjQ1OTc2NDc3LCJqdGkiOiI4ZWY0MTA5OS0zNWI3LTRlNTEtYjJiNS1jNzgzZDZmZjU1NWQiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.O5EcVDWM7pg26Drj0o8QI7IznIUO_vYA-kuKD5SzInumy19De3zvoPYo2W8QD_kl3M_nNzRBomsdctGeCg9OiyAYLDUL3zw4yreBkMg4xeQwgPBzUMXEnmr6PzBip-Bo_6Trq77izaUahoZcKj3UhKhbpZv4X7SPYLq7pEwga5zeqj6yJRdI8AfR-0VGoXjCuJLghrOHdJy3z_ieAgx4PAFGKV44O9xMuq8O2L7AfcMlVpUsEoPtQgQl8Y_1BFEEvGMw-xNyco7NqXmPVdJCowQaUaoFpTzK1bEu66Unx-TTw0JrIe9uRkrty60CvrUuPHC7j9JRwUjGGiNARlIskg&preferred_environment=");
	}
	public String getTitle()
	{
		String title1= driver.getTitle();
		return title1;
	}
	
	public void enterEmailAndPassword(String a, String b)
	{
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.id("password-input")).sendKeys(b);
	}
	
	public void clickOnLoginButton() throws InterruptedException
	{
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
	}
	
	public void closeBrowser()
	{
		 driver.quit();
	}
	
	public String readError()
	{
		String actual = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actual);
		return actual;
	}
}
