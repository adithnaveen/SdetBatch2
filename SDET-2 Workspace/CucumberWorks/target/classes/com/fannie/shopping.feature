Feature: Adding items to cart 

Background:
Given Launch the browser 

Scenario: No item selected in basket 
Given I start the application 
Then I should see a selection of product 
When I browse "without" buying product 
Then My basket "should" be empty 
And I "Cannot" buy an item


Scenario: Item select in basket 
Given I start the application 
Then I should see a selection of product
When I browse "with" buying product 
Then My basket "should not" be empty
And I "can" buy an item 
