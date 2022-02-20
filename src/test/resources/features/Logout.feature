@SYMU-985
Feature: Log out Functionality


	Background:
		#@SYMU-982 PRE-CONDITION
		Given the user is on the login page 
		And the user enters username "Employee101" and password "Employee123"    
		

	#*User Story :*SYMU-952
	#
	#As a user, I should be able to log out.
	#
	#*SYMU-952
	#
	#*_Acceptance Criteria:_*
	#
	#*1-User can log out and ends up in login page*
	#2-User can not go to home page again by clicking step back button after successfully logged out.
	@SYMU-983
	Scenario: Verify that user can log out and ends up in log in page(Automation)
		Given the user on the dasboard page
		And the user opens the user avatar on the top right-hand corner and clicks on logout button
		And verify that the user ends up in the login page	

	#*User Story :*SYMU-952
	#
	#As a user, I should be able to log out.
	#
	#*SYMU-952
	#
	#*_Acceptance Criteria:_*
	#
	#1-User can log out and ends up in login page
	#*2-User can not go to home page again by clicking step back button after successfully logged out.*
	@SYMU-984
	Scenario: Verify that user can not go to home page again by clicking step back button after successfully logged out.(Automation)
		Given the user on the dasboard page 
		And the user opens the user avatar on the top right-hand corner and clicks on logout button
		And verify that the user ends up in the login page
		When the user navigates back to the homepage
		Then verify that user can not go to home page again after logged out