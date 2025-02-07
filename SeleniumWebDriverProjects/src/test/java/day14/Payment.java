package day14;

import org.testng.annotations.Test;

public class Payment {

	public class Login {
		
		@Test(groups= {"sanity","Regression","functional"})
		void paymentInRupees() {
			System.out.println("Payment through Rupees");
		}
		
		@Test(groups= {"sanity","Regression","functional"})
		void paymentInDollers() {
			System.out.println("Payment through Dollers");
		}
		

	}

}
