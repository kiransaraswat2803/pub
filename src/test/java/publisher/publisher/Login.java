package publisher.publisher;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	public ChromeDriver driver;
  
@Test
	public void hello() throws InterruptedException {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver-win64.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://publisherv6.readwhere.com/auth/handshake");

		driver.switchTo().frame(1);
		driver.findElement(By.id("resend")).sendKeys("kiransaraswat@mediologysoftware.com");
		driver.findElement(By.id("signinform-password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement errormessage = driver.findElement(By.xpath("(//div[@class='help-block'])[1]"));
		String error = errormessage.getText();
		System.out.println("error message" + error);
		driver.findElement(By.id("resend")).clear();
		driver.findElement(By.id("resend")).sendKeys("kiran.saraswat@mediologysoftware.com");
		driver.findElement(By.id("signinform-password")).clear();
		driver.findElement(By.id("signinform-password")).sendKeys("123456");

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
}
//		List<WebElement> ls = driver.findElements(By.id("menu-ul"));
//		Stream<WebElement> hello = ls.stream().filter(s -> s.getText().equals("Reporting"));
//		hello.forEach(s -> s.click());
//		List<WebElement> report = driver.findElements(By.id("homeSubmenu"));
//		report.stream().filter(s -> s.getText().equals("SubUser Report")).findFirst().ifPresent(WebElement::click);
//
//		List<WebElement> list1 = driver.findElements(By.cssSelector(".dropdown-submenu "));
//		Stream<WebElement> list2 = list1.stream().filter(s -> s.getText().equals("Publishing"));
//		list2.forEach(s -> s.click());
//		List<WebElement> edition = driver.findElements(By.className("list-unstyled"));
//		edition.stream().filter(s -> s.getText().equals("Editions")).findFirst().ifPresent(WebElement::click);

//			List<WebElement> list1 = driver.findElements(By.cssSelector(".dropdown-submenu "));
//			Stream<WebElement> list2 = list1.stream().filter(s -> s.getText().equals("Publishing"));
//			list2.forEach(s -> s.click());
//			List<WebElement> edition = driver.findElements(By.className("list-unstyled"));
//			edition.stream().filter(s -> s.getText().equals("Editions")).findFirst().ifPresent(WebElement::click);
//			Thread.sleep(2000);
//			JavascriptExecutor jss= ((JavascriptExecutor) driver);
//			jss.executeScript("window.scrollBy(0,500)");
	}
		


