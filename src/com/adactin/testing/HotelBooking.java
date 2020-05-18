package com.adactin.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Added in Lakshman Git");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		
		//Login page
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Lakshmanan");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("abcde123");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		driver.manage().window().maximize();
		
		//Search Hotel
		WebElement loc = driver.findElement(By.id("location"));
		Select l = new Select(loc);
		l.selectByValue("Paris");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h = new Select(hotel);
		h.selectByIndex(3);
		WebElement rmType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select r = new Select(rmType);
		r.selectByVisibleText("Double");
		WebElement rmCount = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select rc = new Select(rmCount);
		rc.selectByValue("2");
		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		dateIn.clear();
		dateIn.sendKeys("15/05/2020");
		WebElement dateOut=driver.findElement(By.id("datepick_out"));
		dateOut.clear();
		dateOut.sendKeys("17/05/2020");
		WebElement adlt=driver.findElement(By.id("adult_room"));
		Select ad=new Select(adlt);
		ad.selectByIndex(2);
		WebElement child = driver.findElement(By.id("child_room"));
		Select cRoom = new Select(child);
		cRoom.selectByValue("1");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		//confirmation page
		WebElement sel = driver.findElement(By.id("radiobutton_0"));
		sel.click();
		WebElement cont = driver.findElement(By.xpath("//input[@class='reg_button']"));
		cont.click();
		
		//Payment Page
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Lakshmanan");
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Mohan");
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("India, chennai");
		WebElement ccNum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccNum.sendKeys("1234567891123456");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select cc=new Select(ccType);
		cc.selectByValue("VISA");
		WebElement ccMon = driver.findElement(By.id("cc_exp_month"));
		Select ccM = new Select(ccMon);
		ccM.selectByValue("5");
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		Select ccY=new Select(ccYear);
		ccY.selectByValue("2021");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(6000);
		
		//Get the order number
		WebElement orderNo = driver.findElement(By.id("order_no"));
		String order = orderNo.getAttribute("value");
		//String order = orderNo.getText();
		System.out.println(order);
		
		//window close
		driver.close();
		
		
		
	}

}
