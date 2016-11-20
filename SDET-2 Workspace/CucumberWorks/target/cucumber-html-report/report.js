$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Adding items to cart",
  "description": "",
  "id": "adding-items-to-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 377905,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingStep.Launch_the_browser()"
});
formatter.result({
  "duration": 221644318,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "No item selected in basket",
  "description": "",
  "id": "adding-items-to-cart;no-item-selected-in-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I start the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see a selection of product",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I browse \"without\" buying product",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "My basket \"should\" be empty",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I \"Cannot\" buy an item",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.I_start_the_application()"
});
formatter.result({
  "duration": 114105,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.I_should_see_a_selection_of_product()"
});
formatter.result({
  "duration": 77783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "without",
      "offset": 10
    }
  ],
  "location": "ShoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 4955319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "should",
      "offset": 11
    }
  ],
  "location": "ShoppingStep.My_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 137220,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cannot",
      "offset": 3
    }
  ],
  "location": "ShoppingStep.I_Cannot_buy_an_item(String)"
});
formatter.result({
  "duration": 117407,
  "status": "passed"
});
formatter.after({
  "duration": 117407,
  "status": "passed"
});
formatter.before({
  "duration": 97961,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingStep.Launch_the_browser()"
});
formatter.result({
  "duration": 96861,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Item select in basket",
  "description": "",
  "id": "adding-items-to-cart;item-select-in-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I start the application",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I should see a selection of product",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I browse \"with\" buying product",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "My basket \"should not\" be empty",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I \"can\" buy an item",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.I_start_the_application()"
});
formatter.result({
  "duration": 118875,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.I_should_see_a_selection_of_product()"
});
formatter.result({
  "duration": 121077,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "with",
      "offset": 10
    }
  ],
  "location": "ShoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 188219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "should not",
      "offset": 11
    }
  ],
  "location": "ShoppingStep.My_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 169140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "can",
      "offset": 3
    }
  ],
  "location": "ShoppingStep.I_Cannot_buy_an_item(String)"
});
formatter.result({
  "duration": 163637,
  "status": "passed"
});
formatter.after({
  "duration": 93926,
  "status": "passed"
});
formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "Signup for account",
  "description": "",
  "id": "signup-for-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 168406,
  "status": "passed"
});
formatter.before({
  "duration": 87321,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Signup",
  "description": "",
  "id": "signup-for-account;signup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Signup"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I want to signup for application",
  "keyword": "Given "
});
formatter.match({
  "location": "SignupStep.I_want_to_signup_for_application()"
});
formatter.result({
  "duration": 309662,
  "status": "passed"
});
formatter.after({
  "duration": 187485,
  "status": "passed"
});
});