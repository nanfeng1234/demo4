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
		 
		 
		 //�ȸ������
	System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.baidu.com");
	
	String url1="http:www.baidu.com";
	driver.get(url1);
	
	
	 WebElement inputbox = driver.findElement(By.id("kw"));  //�ҵ������
	 Thread.sleep(1000);                //��ͣ
	 inputbox.sendKeys("selenium");           //���������������
	 
	 WebElement buton=driver.findElement(By.id("su"));  //�ҵ��ٶ�һ�µİ�ť
	 buton.click();                                     //�����ť
     	 
	// <a href="http://news.baidu.com" name="tj_trnews" class="mnav">����</a>
	
	
	 
	/* driver.findElement(By.linkText("����")).click();
	 Thread.sleep(1000);                                    //��ͣ
	 int aa=driver.findElements(By.tagName("a")).size();
		System.out.println(aa);
	 
	  //driver.findElement(By.partialLinkText("����ϰ��ƽ4��̤������")).click();
	 driver.findElement(By.className("imgview")).click();
	 */
	
	//driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("hello");
	//driver.findElement(By.cssSelector("#kw")).sendKeys("hello");
	
	//�ֻ�����ϵͳ
		//<input name="name" type="text" size="17">
		//	 WebElement a = driver.findElement(By.name("name"));   //�ҵ��û��������
		//	 a.sendKeys("�Ϸ�");                                   //�����û���
		//<input name="password" type="password" size="17">
		//	 WebElement b = driver.findElement(By.name("password")); //�ҵ����������
		//	 b.sendKeys("123");                                      //��������
	    //<input type="image" class="input1" src="image/fg-land.gif" width="51" height="20">
		//	 driver.findElement(By.className("input1")).click();     //�����½��ť
	
	 
	 }
}
