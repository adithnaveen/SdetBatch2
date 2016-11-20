@Smoke
Feature: Adding items to cart 

Scenario Outline: No item selected in basket 
Given I start the application 
|Application_Name|
|Amazon|
|Ebay|
|Craigslist|
Then I should see a selection of product 
|Product_Name|Product_Category|
|Laptop	|Electronics|
|Pen	|Stationery	|
|Mobile	|Electronics|

When I browse "<Browsing_Product>" buying product 
Then My basket "<Buying_Option>" be empty 
And I "<Buying_Status>" buy an item


Examples: 
|Browsing_Product   |Buying_Option   |Buying_Status    |
|Without            |Should          |Cannot           | 
|With               |Shouldnot       |Can              | 
|xxx                |YYY             |zzz              |
# multiple examples here 