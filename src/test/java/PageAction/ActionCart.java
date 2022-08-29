package PageAction;



import org.testng.Assert;

import PageLocator.LocatorCart;
import Utility.TestBaseCart;
import Utility.utilityCart;


public class ActionCart extends TestBaseCart {


	LocatorCart home = new LocatorCart();

public void Clicklogin() {
	
	home.LoginLink.click();
}
public void Enterusernameandpasswordandclicklogin(String u , String p) throws Exception  {
	
	home.UserName.sendKeys(u);
	home.Password.sendKeys(p);
	home.LoginButton.click();
	
	Thread.sleep(5000);

}

public void ClickSamsung6hyperlinkandaddtocart() throws Exception {
	home.SamsungHyperLink.click();
	home.AddToCArt.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	 
	
}
public void ClickCart() {
	
	
	home.CART.click();
}
public void VerifySamsung6addedincart () {
	boolean result = home.VerifySamsung6Phone.isDisplayed();
	Assert.assertTrue(result);
	 
	 utilityCart.takescreenshot(driver, "Veryfy Cart");
}


}
