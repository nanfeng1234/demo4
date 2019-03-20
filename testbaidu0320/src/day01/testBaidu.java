package day01;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testBaidu {
     @BeforeClass
     public void openfire() {
    	 System.setProperty("webdriver.chrome.driver",".//tools//chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
    	 String url="http:www.baidu.com";
    	 //driver.get(url);
     }
	 @Test
	 
	 
	 
	 
	 public void openfirefox() throws InterruptedException {
		 
		 
		 //谷歌浏览器
	System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.baidu.com");
	
	String url1="http:www.baidu.com";
	driver.get(url1);
	
	
	 WebElement inputbox = driver.findElement(By.id("kw"));  //找到输入框
	 Thread.sleep(1000);                //暂停
	 inputbox.sendKeys("selenium");           //给输入框输入内容
	 
	 WebElement buton=driver.findElement(By.id("su"));  //找到百度一下的按钮
	 buton.click();                                     //点击按钮
     	 
	// <a href="http://news.baidu.com" name="tj_trnews" class="mnav">新闻</a>
	
	
	 
	/* driver.findElement(By.linkText("新闻")).click();
	 Thread.sleep(1000);                                    //暂停
	 int aa=driver.findElements(By.tagName("a")).size();
		System.out.println(aa);
	 
	  //driver.findElement(By.partialLinkText("今年习近平4次踏出国门")).click();
	 driver.findElement(By.className("imgview")).click();
	 */
	
	//driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("hello");
	//driver.findElement(By.cssSelector("#kw")).sendKeys("hello");
	
	//手机销售系统
		//<input name="name" type="text" size="17">
		//	 WebElement a = driver.findElement(By.name("name"));   //找到用户名输入框
		//	 a.sendKeys("南风");                                   //输入用户名
		//<input name="password" type="password" size="17">
		//	 WebElement b = driver.findElement(By.name("password")); //找到密码输入框
		//	 b.sendKeys("123");                                      //输入密码
	    //<input type="image" class="input1" src="image/fg-land.gif" width="51" height="20">
		//	 driver.findElement(By.className("input1")).click();     //点击登陆按钮
	
	 
	 }
}
