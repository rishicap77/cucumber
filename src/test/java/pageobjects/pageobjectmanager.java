package pageobjects;

import org.openqa.selenium.WebDriver;

public class pageobjectmanager {
public homepage homepage;
public dealspage dealpage;
public checkoutpage checkoutpage;
public WebDriver driver;
public pageobjectmanager(WebDriver driver) {
	this.driver=driver;
}

public pageobjects.homepage gethomepageobject() {
	homepage =new homepage(driver);
	return homepage;
}

public dealspage getdealspageobject() {
	dealpage=new dealspage(driver);
	return dealpage;
}

public checkoutpage getcheckpageobject() {
	checkoutpage=new checkoutpage(driver);
	return checkoutpage;
}
}
