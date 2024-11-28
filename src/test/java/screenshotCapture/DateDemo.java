package screenshotCapture;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Date Format: " + d);
		
		int a=10;
		float f1 = a;
		
		
		float f2 = 56.89f;
		int b = (int) f2;
		
		String s = Integer.toString(a);
		//Thu_Nov_28_16_02_16_IST_2024.jpg
		//d.toString()
		System.out.println("File Name as a String format: "+d.toString().replace(" ","_").replace(":","_")+".png");
		

	}

}
