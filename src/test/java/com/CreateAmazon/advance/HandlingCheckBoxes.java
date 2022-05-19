package com.CreateAmazon.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.manage().window().maximize();
		
		
		WebElement chkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement chkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		
		if(chkbox2.isSelected()) {
			
			System.out.println("**********************************************");
			System.out.println("Checkbox 2 is already selected");
			System.out.println("***********************************************");
			
		}
		
		else
			System.out.println("Checkbox 2 is not already selected");
		


	}

}
