package publisher.publisher;

import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class publishing extends Login {

	public publishing(ChromeDriver driver) {
	this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	@AfterTest	
	public void publishing() throws InterruptedException {
			
Thread.sleep(4000);
				List<WebElement> ls = driver.findElements(By.id("menu-ul"));
				Stream<WebElement> hello = ls.stream().filter(s -> s.getText().equals("Reporting"));
				hello.forEach(s -> s.click());
				List<WebElement> report =driver.findElements(By.id("homeSubmenu"));
				report.stream().filter(s -> s.getText().equals("SubUser Report")).findFirst().ifPresent(WebElement::click);
		
				List<WebElement> list1 = driver.findElements(By.cssSelector(".dropdown-submenu "));
				Stream<WebElement> list2 = list1.stream().filter(s -> s.getText().equals("Publishing"));
				list2.forEach(s -> s.click());
				List<WebElement> edition = driver.findElements(By.className("list-unstyled"));
				edition.stream().filter(s -> s.getText().equals("Editions")).findFirst().ifPresent(WebElement::click);

	
	}
}