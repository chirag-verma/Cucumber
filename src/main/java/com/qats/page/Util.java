package com.qats.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver;

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

		for (int i = 0; i < ls1.size(); i++) {

			ls1.get(i).click();

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(2000);

		List<WebElement> ls2 = driver.findElements(
				By.xpath("//span[text()='Rating Recommendation included in the RCP']//following::label[text()='Yes']"));

		for (int i = 0; i < ls2.size(); i++) {

			ls2.get(i).click();

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(2000);

		List<WebElement> ls3 = driver.findElements(
				By.xpath("//span[contains(text(),'All Rating Committee participa')]//following::label[text()='Yes']"));

		for (int i = 0; i < ls3.size(); i++) {

			ls3.get(i).click();

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(2000);

		List<WebElement> ls4 = driver.findElements(By.xpath(
				"//span[contains(text(),'Methodology Rating Group approval email')]//following::label[text()='Yes']"));

		for (int i1 = 0; i1 < ls4.size(); i1++) {

			ls4.get(i1).click();

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(2000);

		List<WebElement> ls5 = driver.findElements(By.xpath(
				"//span[text()='Rating Committee Chair eligible to chair per RPO RC Chair Approval list ']//following::label[text()='Yes']"));

		for (int i1 = 0; i1 < ls5.size(); i1++) {

			ls5.get(i1).click();

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(2000);

		List<WebElement> ls6 = driver.findElements(By.xpath(
				"//span[contains(text(),'Is the Lead Analyst correctly reflected and any differences from RCP')]//following::label[text()='Yes']"));

		for (int j = 0; j < ls6.size(); j++) {

			ls6.get(j).click();

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		Thread.sleep(2000);

		List<WebElement> ls7 = driver.findElements(By.xpath(
				"//span[contains(text(),'eader and footer is unobstructed on Draft Press Release (PR) and attached to')]//following::label[text()='Yes']"));

		for (int j = 0; j < ls7.size(); j++) {

			ls7.get(j).click();

		}

		Thread.sleep(6000);

	}
}
