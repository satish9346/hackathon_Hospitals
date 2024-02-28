Feature: Finding Hospitals

  Scenario: Navigate to practo.com
    Given user should open the browser and navigates to practo.com site with url
    Then verify the title of practo.com site

  Scenario Outline: searching for dentists in enterd location
    Given user is on practo.com home page
    Then user should clear the location and send the "<location>" name
    When user searches for doctor "<speciality>" in home page search bar
    And user selects male from "<gender>" dropdown
    And user selects thirty plus Patient Stories from "<patient stories>" dropdown
    And user selects ten plus years   from "<experience>" dropdown
    And user selects experience high-low from "<sortby>" dropdown
    And user selects "<fees>" from allFilters
    And user selects "<availability>" from dropdown
    Then validate top 5 doctor details are displayed in experience order
    And user should navigate back to home page by clicking practo icon

    Examples: 
      | location  | speciality         | gender       | patient stories     | experience              | sortby                   | fees      | availability    |
      | Chennai   | ophthalmologist    | Male Doctor  | 30+ Patient Stories | 10+ Years of experience | Experience - High to Low | Above ₹500 | Available Today |

  Scenario: Extracting surgery names
    Given user should be in practo.com home page
    When user should click on surgeries
    Then user should store the all the surgeries in list and display in consol output
    And user should navigate back to home page by clicking practo icon

  Scenario: validation of for corporate option
    Given user should be on practo.com home page
    When user selects for corporate element
    And user clicks Health and wellness plan
    And user enters valid email and valid details
    Then validate the demo button
    And capture the thank you message
    When user enters invalid email and valid remaining details
    Then validate the demo button
    And navigate directly to to the home page
