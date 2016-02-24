package linkCheckerProj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCheck {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("xxx");

		List<WebElement> linkVals = driver.findElements(By.tagName("a"));


		int linkSize = linkVals.size();

		System.out.println(linkSize);

		for(int i=0; i<linkSize; i++){

			String lName = linkVals.get(i).getText();

			String lRef = linkVals.get(i).getAttribute("href");

			System.out.println(i+1);
			System.out.println(lName +" "+ lRef);

			if(lRef == null){

				linkVals.get(i).click();

				String sTitle = driver.getTitle();

				System.out.println(sTitle);

			}
		}


	}

}
