#Feature: Regression Scenarios for finding hospitals
#
  #@regression
  #Scenario Outline: Display doctor details
    #Given user prsent in practo.com home page
    #When user searches doctor details in particular "<location>"
    #Then the top five doctor details should be displayed
#
    #Examples: 
      #| location |
      #| Chennai  |
#
  #@regression
  #Scenario Outline: validating "<gender>" dropdown
    #Given user is on dentists  page
    #Then user clicks on genderdropdown and able to select male doctors from gender dropdown
#
    #Examples: 
      #| gender      |
      #| Male Doctor |
#
  #@regression
  #Scenario Outline: validating sortby dropdown
    #Given user is on dentists  page
    #Then user clicks on "<sortBy>" dropdown and select Experience - High to Low from sort by dropdown
#
    #Examples: 
      #| sortBy                   |
      #| Experience - High to Low |
#
  #@regression
  #Scenario Outline: validating experience dropdown
    #Given user is on dentists  page
    #Then user clicks on "<experience>" dropdown and select ten plus years experience  from experience dropdown
#
    #Examples: 
      #| experience              |
      #| 10+ Years of experience |
#
  #@regression
  #Scenario: surgeries extraction
    #Given user is on practo website
    #When use navigates to surgaries section
    #Then all surgeries listed in the page are extracted and stored in a list
#
  #@regression
  #Scenario: validate the schedule a demo button
    #Given user is on health and wellness form page
    #When user fills out the form with valid email and valid details
    #Then user should able to click the schedule a demo button
#
  #@regression
  #Scenario: validating captcha
    #Given user is on form page
    #When user enters valid name valid organization and valid details
    #And user click schedule a demo button
    #Then Thank You message should be displayed
#
  #@regression
  #Scenario: validate the health and wellness form feilds before submission
    #Given user is on health and wellness form page
    #When user fills out the form with valid and invalid details
    #Then user should see the error messages for invalid data
