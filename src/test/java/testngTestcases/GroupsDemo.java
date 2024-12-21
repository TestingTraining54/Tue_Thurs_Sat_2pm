package testngTestcases;

import org.testng.annotations.Test;

public class GroupsDemo {

		@Test(groups= {"smoke"})
		public void car() {
			System.out.println("Car");
		}
		
		@Test(groups= {"smoke"})
		public void bike() {
			System.out.println("bike");
		}
		
		@Test(groups= {"smoke","Regression"})
		public void cycle() {
			System.out.println("Cycle");
		}
		
		@Test(groups= {"Regression"})
		public void cat() {
			System.out.println("cat");
		}
		
		@Test(groups= {"Regression"})
		public void dog() {
			System.out.println("Dog");
		}
}
