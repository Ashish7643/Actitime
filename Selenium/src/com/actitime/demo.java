package com.actitime;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.instagram.com");
			String title = driver.getTitle();
			System.out.println(title);
			//Thread.sleep(2000);
			//driver.close();
			System.out.println();
			System.out.println();
			
		}
	}




