Feature: Create User Detail
  
 Scenario: Verify user creation using api
     Given post endpoint given in given file
     Then enter username1 and password1
     Then post the api url
     
    Scenario: Verify user creation using api method
    Given Authentication
    Then Pass Request
 	Then call api1
 
    Scenario:call account using id
    Given specific id
    Then data for that
    
  
