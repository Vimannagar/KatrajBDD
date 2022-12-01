package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {

	
	@Before(order = 1)
	public void initBrowser()
	{
		System.out.println("Before hook is executing");
		System.out.println("Launching the browser");
		
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step is executing");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step is executing");
	}
	
	
	@Before(order = 2)
	public void setupDB()
	{
		System.out.println("Setting up the DB");
		
	}
	
	
	@After(order = 3)
	public void tearDown()
	{
		System.out.println("After hook is executing");
		System.out.println("Shut down the current browser");
	}
	
	@After(order = 5)
	public void quitAllWindow()
	{
		System.out.println("quit all the browser window");
	}
}
