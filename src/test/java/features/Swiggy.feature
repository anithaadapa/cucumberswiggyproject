Feature: Home Page Test cases

Background:
    Given The application is launched and in home page
    When user Enter the delivery location "Bangalore"
    And clicks on Bangalore,Karanataka,India

@Deliverylocationtest
Scenario: Verify if the user is able to enter the delivery location
When user Enter the delivery location "Bangalore"
And clicks on Bangalore,Karanataka,India
And the Restuarants should be displayed to the user


@Searchicontest
Scenario: Verify if the search icon is visibile on the page
When the user hover over search icon
And click on search icon


@searchtest
Scenario: Verify if the user is able to search for a product
When user clicks on search icon
And user Enter "Pizza"
And pizza list is seen

@offers
Scenario: Verify if the user is able to search for offers
When user clicks on offers button
And user can see Restaurant offers and Payment offers/Coupons
And user is able to click on Payment offers/Coupons

@help
Scenario: Verify if user is able to click on help
When user clicks on help link
And user taken to partner onboarding
And user clicks on the first link
And user can see the send an email button

@Searchsnacks
Scenario: Verify if user is able to click on search
When user clicks on search icon
And enters snacks
And see the list of snacks

@Additem
Scenario: Verify item is added to cart
When user clicks on search icon
And enters snacks
And clicks on snacks corner
And clicks on item
And clicks on add button

@Cartitem
Scenario: Verify cart is having the item added
When user clicks on search icon
And enters snacks
And clicks on snacks corner
And clicks on item
And clicks on add button
And clicks on the screen
And click on cart icon
And check the item is added to cart

 
@filterstest
Scenario: Verify user is able to use filters
Then clicks on location drop down button
And user enters "T-Nagar"
And clicks on GPS location

@signin
Scenario: Verify user is able to sign in
And clicks sign in button
And the phone number entered



