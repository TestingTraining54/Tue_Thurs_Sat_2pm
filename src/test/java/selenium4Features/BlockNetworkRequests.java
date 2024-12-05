package selenium4Features;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v130.network.Network;

import com.google.common.collect.ImmutableList;

public class BlockNetworkRequests {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		devtools.send(Network.setBlockedURLs(ImmutableList.of("*.svg","*.jpg","*.png","*.jpeg")));

		
		
	}

}
