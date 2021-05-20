Feature: Feature to test Login  functionality

    Scenario Outline: Verify all possible Login Scenarios
    Given User is on Application landing page
    When  User clicks on Login Button
    Then  User views logins screen 
    When  User enters "<username>" in the username field
    When  User enters "<password>" in the password field
    And   User clicks on Login Button
    Then  User gets login failed error message
    
   
    Examples:
    
 	 		| username          | password     |
			| standard_user     | secret_sauce |
			| standard_user123  | password$    |
			| standard_user$    | secret_sauce |
			| standard_user$    | password$    |
			|                   |              |
	    
	
    
    
    
   
 