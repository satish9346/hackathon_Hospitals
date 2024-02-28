#Feature: SmokeScenarios
#
  #@smoke
  #Scenario: Navigate to practo.com.com
    #Given Browser should be opened and user navigates to practo.com site with url
    #Then validate the practo.com site title
#
  #@smoke
  #Scenario Outline: validation of location search bar
    #Given user is on practo.com home page
    #When user should clear the data present in home page location bar and  send the "<location>" name
    #Then navigate to doctor speciality search bar
#
    #Examples: 
      #| location |
      #| Chennai  |
#
  #@smoke
  #Scenario: validation of home page search bar
    #Given user is on practo.com home page
    #When user should clear the data present in search  bar and user send the doctor dentist name
    #Then doctor details are displayed for entered speciality
#
  #@smoke
  #Scenario: navigating to surgeries
    #Given user is on practo.com home page
    #When user click surgries
    #Then user should verify the page is navigated to surgaries page
#
  #@smoke
  #Scenario: verifying all popular surgaries are displayed
    #Given user is on surgeries page
    #When user scrolls until popular surgaries
    #Then user should verify surgaries areextracted and  displayed in the consol output
#
  #@smoke
  #Scenario: validating for corporate option
    #Given user is on home page
    #When user clicks for corporate option
    #And user clicks  health and wellness option
    #Then schedule a demo form should be opened
#
  #@smoke
  #Scenario: validating schedule a demo button
    #Given user is on form page
    #When user enters valid name valid email and valid details
    #Then schedule a demo button should be enabled
#
 #
#
  #@smoke
  #Scenario: validating Thank you message
    #Given user is on form page
    #When user enters valid name valid email and valid details
    #And user click schedule a demo button
    #Then Thank You message should be displayed confirming successful submission
