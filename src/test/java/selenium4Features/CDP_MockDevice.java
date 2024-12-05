package selenium4Features;

import java.util.HashMap;
import java.util.Map;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class CDP_MockDevice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		DevTools devTools= driver.getDevTools();
		Map<String,Object> hm = new HashMap<>();
		hm.put("width",600);
		hm.put("height", 1000);
		hm.put("deviceScaleFactor",50);
		hm.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", hm);
		

	}

}
