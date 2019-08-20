Feature: UpdateUserInformation
User is filling Information to be updated

Scenario: Get Page Title
Given user is on 'update customer' page
When get page title
Then displays 'Page title verified'

Scenario: Invalid email Id
Given user is on 'update customer' page
When user enters invalid email Id
Then displays 'Email Id Should Be Filled'

Scenario: Invalid first name
Given user is on 'update customer' page
When user enters invalid first name
Then displays 'First Name Should Be Filled'


Scenario: Invalid last name
Given user is on 'update customer' page
When user enters invalid last name
Then displays 'Last Name '


Scenario: Invalid mobile number 
Given user is on 'update customer' page
When user enters invalid date of birth 
Then displays 'Mobile Number Should Be Filled'

Scenario: Invalid address
Given user is on 'update Customer' page
When user enters address
Then displays 'Address Should Be Filled'

Scenario: Invalid photo file 
Given user is on 'update customer' page
When user selects invalid photo file
Then displays 'Select a valid photo file'


Scenario: Valid Information
Given user is on 'update customer' page
When user enters valid information
Then update button gets enabled and user can update his information