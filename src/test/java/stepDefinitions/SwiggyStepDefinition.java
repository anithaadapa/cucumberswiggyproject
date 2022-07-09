package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


public class SwiggyStepDefinition {
	public static WebDriver driver;	
		
@Before
	
	public void BeforeExecution()
	{
				System.out.println("Executing Before Hook");
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
 		driver = new ChromeDriver();
 		
	}

	@After
	
	public void AfterExecution()
	{
		System.out.println("Executing After Hook");
		driver.close();
	}
	

//@Deliverylocationtest
		
	@Given("^The application is launched and in home page$")
    public void the_application_is_launched_and_in_home_page() {
		        driver.get("https://www.swiggy.com/");
		         driver.manage().window().maximize();
		         Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));  
    }
	

	@When("user Enter the delivery location {string}")
	public void user_enter_the_delivery_location(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	
	    WebElement location = driver.findElement(By.id("location"));
        
		  location.sendKeys("Bangalore");
		  Thread.sleep(2000);
	}

	
	@And("^clicks on Bangalore,Karanataka,India$")
	public void he_selects_first_location_from_suggested_location_in_suggestion_box() throws InterruptedException {
		  WebElement city = driver.findElement(By.xpath("//span[normalize-space()='Bangalore, Karnataka, India']"));
	        city.click();
	        Thread.sleep(2000);
	}
	        
	    @And("^the Restuarants should be displayed to the user$")
	    public void the_restuarants_should_be_displayed_to_the_user() throws InterruptedException  {
	    	System.out.println("restuarants displayed"); 
	    	 Thread.sleep(15000);
	    }
	    
	    //@Searchicontest
	    
	    @When("^the user hover over search icon$")
	    public void the_user_hover_over_search_icon() throws Throwable {
	    	 driver.navigate().to("https://www.swiggy.com/search");
	    	 Thread.sleep(5000);
	    }

	    @And("^click on search icon$")
	    public void click_on_search_icon() throws Throwable {
	    	System.out.println("search page is displayed");
	    	
	    } 	

	    	
	        
	       // @searchtest

	    @And("user Enter {string}")
	    public void user_enter_the_search_something(String string) throws InterruptedException  {
	    	
	    	WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
	    	Searchbox.sendKeys("Pizza");
	    	Searchbox.sendKeys(Keys.ENTER);
			  Thread.sleep(15000);
			  throw new io.cucumber.java.PendingException();
	    }
	    
	    
	   // @And("Clicks on search button$")
	   // public void clicks_on_search_button() throws Throwable {
	    //	WebElement Searchbutton = driver.findElement(By.className("//*[@id=\\\"root\\\"]/div[1]/div/div[1]/div/form/input"));
	    //	Searchbutton.click();
	    //	Thread.sleep(2000);
	    

	    @And("^pizza list is seen$")
	    public void pizza_list_is_seen() throws Throwable {
	    	Thread.sleep(2000);
	    	System.out.println("Pizza list is displayed");
	    	driver.navigate().refresh();
	    	
	    }
	    
	  //  @offers
	    
	    @When("user clicks on offers button$")
	    public void user_clicks_on_offers_button() throws Throwable {
	    	WebElement offers = driver.findElement(By.xpath("//a[@href='/offers/restaurant']"));
	    	offers.click();
	    	Thread.sleep(2000);
	    }

	    @And("user can see Restaurant offers and Payment offers/Coupons$")
	    public void user_can_see_restaurant_offers_and_payment_offerscoupons() throws Throwable {
	    	System.out.println("Restaurant offers and Payment offers are displayed");   
	    	Thread.sleep(2000);
	    }
	    
	    @And("user is able to click on Payment offers/Coupons$")
	    public void user_is_able_to_click_on_payment_offerscoupons() throws Throwable {
	      WebElement paymentoffers = driver.findElement(By.xpath("//div[@id='payment']")) ; 
	   
	      
	    }
	    
	    
	    

	    @When("^user navigates to swiggy search page$")
	    public void user_navigates_to_swiggy_search_page() throws Throwable {
	    	driver.navigate().to("https://www.swiggy.com/search");
	    	  Thread.sleep(15000);
	    }

	    
	    
	    @Then("^types in Biryani$")
	    public void types_in_cake() throws Throwable {
       WebElement enter = driver.findElement(By.xpath("//input[@type='text']"));
       enter.sendKeys("Biryani");
       enter.sendKeys(Keys.ENTER);
		  Thread.sleep(15000);
	    }

	    @And("^clicks on Fast Delivery button$")
	    public void clicks_on_fast_delivery_button() throws Throwable {
	    	WebElement pizzaplace = driver.findElement(By.xpath("//button[text()='Fast Delivery']"));
	    	pizzaplace.click();
	    	
	    }    
	    

	    @And("^clicks on add for first item $")
	    public void clicks_on_add_for_first_item() throws Throwable {
	    	WebElement add = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[4]/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div[1]"));
	    	add.click(); 
	    	
	    }

	//help test
	    

	    @When("^user clicks on help link$")
	    public void user_clicks_on_help_link() throws Throwable {
	        WebElement help = driver.findElement(By.xpath("//a[normalize-space()='Help']"));
	        help.click();
	        Thread.sleep(15000);
	    }

	    @And("^user taken to partner onboarding$")
	    public void user_taken_to_partner_onboarding() throws Throwable {
	        System.out.println("user is taken to partner onboarding");
	    }

	    @And("^user clicks on the first link$")
	    public void user_clicks_on_the_first_link() throws Throwable {
	    	WebElement partnerlink = driver.findElement(By.xpath("//span[normalize-space()='I want to partner my restaurant with Swiggy']")); 
	    	partnerlink.click();
	    	
	    }

	    @And("^user can see the send an email button$")
	    public void user_can_see_the_send_an_email_button() throws Throwable {
	     System.out.println("send email visisble");
	    }

	    //search snacks
	    
	    @When("^user clicks on search icon$")
	    public void user_clicks_on_search_icon() throws Throwable {
	    	driver.navigate().to("https://www.swiggy.com/search");
	    	  Thread.sleep(15000);
	    }

	    @And("^enters snacks$")
	    public void enters_snacks() throws Throwable {
	    	WebElement entersnack = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));//input[@type='text']
	     entersnack.sendKeys("snacks");
	      entersnack.sendKeys(Keys.ENTER);
	   		  Thread.sleep(15000);
	    	
	    }

	    @And("^see the list of snacks$")
	    public void see_the_list_of_snacks() throws Throwable {
	    	System.out.println("snacks are displayed");
	       
	    }

	 
	//@Additem
	    
	    @And("^clicks on snacks corner$")
	    public void clicks_on_snacks_corner() throws Throwable {
	       WebElement snackcorner = driver.findElement(By.xpath("//div[contains(text(),'SNACKS CORNER')]"));
	       snackcorner.click();
	       Thread.sleep(15000);
	    }

	    @And("^clicks on item$")
	    public void clicks_on_item() throws Throwable {
	    WebElement item = driver.findElement(By.xpath("//*[@id=\"h-1950595611\"]/div[2]/div[1]/div[1]/div/div[2]/div[1]/button"));
	       item.click();
	       Thread.sleep(15000);
	    }

	    @And("^clicks on add button$")
	    public void clicks_on_add_button() throws Throwable {
	   WebElement add = driver.findElement(By.xpath("//*[@id=\"dialog\"]/div/div[1]/div/div[2]/div/div/div[1]"));
	   add.click();
	   Thread.sleep(15000);
	    }
	    
	    //cartitem
	    
	  
	    @And("^clicks on the screen$")
	    public void clicks_on_the_screen() throws Throwable {
	    	driver.navigate().refresh();
	        Thread.sleep(15000);
	    }

	    @And("^click on cart icon$")
	    public void click_on_cart_icon() throws Throwable {
	        WebElement cart = driver.findElement(By.xpath(" //span[normalize-space()='Cart']"));
	        cart.click();
	        Thread.sleep(15000);
	    }

	    @And("^check the item is added to cart$")
	    public void check_the_item_is_added_to_cart() throws Throwable {
	    Assert.assertEquals("SNACKS CORNER | Home delivery | Order online | Indiranagar Kodihalli Bangalore", driver.getTitle());
	    Thread.sleep(15000);
	            }
	    

	
	//filterstest


	    @Then("clicks on location drop down button")
	    public void clicks_on_location_drop_down_button() throws InterruptedException {
	 WebElement filter = driver.findElement(By.xpath("//span[@class='icon-downArrow kVKTT']"));
	 filter.click();
	    Thread.sleep(15000);
}


@And("user enters {string}")
public void user_enters(String string) throws InterruptedException {
	WebElement enterlocation = driver.findElement(By.xpath("//input[@placeholder='Search for area, street name..']"));
	enterlocation.click();
    enterlocation.sendKeys("T-Nagar");
    enterlocation.sendKeys(Keys.ENTER);
  		  Thread.sleep(15000);

}

@And("clicks on GPS location")
public void clicks_on_gps_location() {
	WebElement clickGPSlocation = driver.findElement(By.xpath("//div[normalize-space()='T. Nagar']"));
	clickGPSlocation.click();

}

//@signintest

@When("clicks sign in button")
public void clicks_sign_in_button() {
	WebElement signin = driver.findElement(By.xpath("//span[normalize-space()='Sign In']"));
	signin.click();
}

@When("the phone number entered")
public void the_phone_number_entered() throws InterruptedException {
	WebElement phonenumber = driver.findElement(By.xpath("//input[@id='mobile']"));
	phonenumber.click();
	phonenumber.sendKeys("9866677702");
	phonenumber.sendKeys(Keys.ENTER);
	System.out.println("user is able to login");
	  		  Thread.sleep(15000);
	  		  
    
}

}


	    
	    
	


	    
	    

	

	
	
	    
	
