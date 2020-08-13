package com.qats.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

	WebDriver driver;

	Boolean result = false;
	int limit = 0;

	public Util(WebDriver Driver) {
		this.driver = Driver;

	}

	public void teardown() throws InterruptedException {

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath(".//a[@class='Header_nav']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Log off']")).click();

		Thread.sleep(2000);

		driver.quit();
	}

	public void PerformQuestionnaire() throws InterruptedException {

		driver.switchTo().defaultContent();
		driver.switchTo().frame("PegaGadget2Ifr");

		driver.findElements(By.xpath("//span[text()='Upload Vital Records']")).get(0).click();
		Thread.sleep(4000);

		List<WebElement> ls1 = driver.findElements(
				By.xpath("//span[text()='The Rating Committee Package was uploaded']//following::label[text()='Yes']"));

		for (int j = 0; j < ls1.size(); j++) {

			while (limit < 5) {

				try {
					ls1.get(j).click();

					break;
				} catch (Exception e) {
					driver.navigate().refresh();
					Thread.sleep(5000);
					ls1.clear();
					ls1 = driver.findElements(By.xpath(
							"//span[text()='The Rating Committee Package was uploaded']//following::label[text()='Yes']"));

					// TODO Auto-generated catch block
					continue;

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(2000);

		List<WebElement> ls2 = driver.findElements(
				By.xpath("//span[text()='Rating Recommendation included in the RCP']//following::label[text()='Yes']"));

		for (int j = 0; j < ls2.size(); j++) {

			while (limit < 5) {

				try {
					ls2.get(j).click();

					break;
				} catch (Exception e) {
					driver.findElement(By.xpath("//button[text()='Back']")).click();

					Thread.sleep(5000);

					driver.findElement(By.xpath("//button[text()='Continue']")).click();

					Thread.sleep(3000);
					ls2.clear();
					ls2 = driver.findElements(By.xpath(
							"//span[contains(text(),'actual Elements and Data Sources are present and complete in')]//following::label[text()='Yes']"));
				
					Thread.sleep(4000);

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(2000);

		List<WebElement> ls3 = driver.findElements(
				By.xpath("//span[contains(text(),'All Rating Committee participa')]//following::label[text()='Yes']"));

		for (int j = 0; j < ls3.size(); j++) {

			while (limit < 5) {

				try {
					ls3.get(j).click();

					break;
				} catch (Exception e) {
					driver.navigate().refresh();

					Thread.sleep(5000);
					ls3.clear();
					ls3 = driver.findElements(By.xpath(
							"//span[contains(text(),'All Rating Committee participa')]//following::label[text()='Yes']"));
					// TODO Auto-generated catch block
					continue;

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(2000);

		List<WebElement> ls4 = driver.findElements(By.xpath(
				"//span[contains(text(),'Methodology Rating Group approval email')]//following::label[text()='Yes']"));

		for (int j = 0; j < ls4.size(); j++) {

			while (limit < 5) {

				try {
					ls4.get(j).click();

					break;
				} catch (Exception e) {
					driver.navigate().refresh();
					Thread.sleep(5000);
					ls4.clear();
					ls4 = driver.findElements(By.xpath(
							"//span[contains(text(),'Methodology Rating Group approval email')]//following::label[text()='Yes']"));

					// TODO Auto-generated catch block
					continue;

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(2000);

		List<WebElement> ls5 = driver.findElements(By.xpath(
				"//span[text()='Rating Committee Chair eligible to chair per RPO RC Chair Approval list ']//following::label[text()='Yes']"));

		for (int j = 0; j < ls5.size(); j++) {

			while (limit < 5) {

				try {
					ls5.get(j).click();

					break;
				} catch (Exception e) {
					driver.navigate().refresh();
					Thread.sleep(5000);
					ls5.clear();
					ls5 = driver.findElements(By.xpath(
							"//span[text()='Rating Committee Chair eligible to chair per RPO RC Chair Approval list ']//following::label[text()='Yes']"));
					// TODO Auto-generated catch block
					continue;

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(2000);

		List<WebElement> ls6 = driver.findElements(By.xpath(
				"//span[contains(text(),'Is the Lead Analyst correctly reflected and any differences from RCP')]//following::label[text()='Yes']"));

		for (int j = 0; j < ls6.size(); j++) {

			while (limit < 5) {

				try {
					ls6.get(j).click();

					break;
				} catch (Exception e) {
					driver.navigate().refresh();
					Thread.sleep(5000);
					ls6.clear();
					ls6 = driver.findElements(By.xpath(
							"//span[contains(text(),'Is the Lead Analyst correctly reflected and any differences from RCP')]//following::label[text()='Yes']"));

					// TODO Auto-generated catch block
					continue;

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(2000);

		List<WebElement> ls7 = driver.findElements(By.xpath(
				"//span[contains(text(),'eader and footer is unobstructed on Draft Press Release (PR) and attached to')]//following::label[text()='Yes']"));

		for (int j1 = 0; j1 < ls7.size(); j1++) {

			while (limit < 5) {

				try {
					ls7.get(j1).click();

					break;
				} catch (Exception e) {
					driver.navigate().refresh();
					Thread.sleep(5000);
					ls7.clear();
					ls7 = driver.findElements(By.xpath(
							"//span[contains(text(),'eader and footer is unobstructed on Draft Press Release (PR) and attached to')]//following::label[text()='Yes']"));
					ls7.get(j1).click();
					Thread.sleep(4000);
					// TODO Auto-generated catch block
					continue;

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(2000);

		List<WebElement> ls8 = driver.findElements(By.xpath(
				"//span[contains(text(),'actual Elements and Data Sources are present and complete in')]//following::label[text()='Yes']"));

		for (int j2 = 0; j2 < ls8.size(); j2++) {

			while (limit < 5) {

				try {

					ls8.get(j2).click();

					break;
				} catch (Exception e) {
					driver.findElement(By.xpath("//button[text()='Back']")).click();

					Thread.sleep(5000);

					driver.findElement(By.xpath("//button[text()='Continue']")).click();

					Thread.sleep(3000);
					ls8.clear();
					ls8 = driver.findElements(By.xpath(
							"//span[contains(text(),'actual Elements and Data Sources are present and complete in')]//following::label[text()='Yes']"));
				
					Thread.sleep(4000);
					// TODO Auto-generated catch block
					

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Continue']")).click();

				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		List<WebElement> ls9 = driver.findElements(By.xpath(
				"//span[contains(text(),'Final Rating Committee Outcome as noted in the Addendum Vote Tally is same as Press Release,')]//following::label[text()='Yes']"));

		for (int j = 0; j < ls9.size(); j++) {

			while (limit < 5) {

				try {
					ls9.get(j).click();

					break;
				} catch (Exception e) {
					driver.navigate().refresh();
					Thread.sleep(5000);
					ls9.clear();
					ls9 = driver.findElements(By.xpath(
							"//span[contains(text(),'Final Rating Committee Outcome as noted in the Addendum Vote Tally is same as Press Release,')]//following::label[text()='Yes']"));

					// TODO Auto-generated catch block
					continue;

				}
			}

		}

		Thread.sleep(2000);

		while (limit < 10) {

			try {
				driver.findElement(By.xpath("//button[text()='Complete Review']")).click();

				break;
			} catch (Exception e) {
				driver.navigate().refresh();
				Thread.sleep(5000);
				// TODO Auto-generated catch block
				continue;
			}
		}

		Thread.sleep(6000);
	}
}
