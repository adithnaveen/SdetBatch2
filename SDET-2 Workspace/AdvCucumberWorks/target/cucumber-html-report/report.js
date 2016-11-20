$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to account",
  "description": "",
  "id": "login-to-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Valid UserName and Password",
  "description": "",
  "id": "login-to-account;valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter valid username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Take me to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.launch_the_application()"
});
formatter.result({
  "duration": 382108458,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enter_valid_username_and_password()"
});
formatter.result({
  "duration": 168406,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_submit_button()"
});
formatter.result({
  "duration": 139422,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.take_me_to_home_page()"
});
formatter.result({
  "duration": 139054,
  "status": "passed"
});
formatter.uri("shopping.feature");
formatter.feature({
  "line": 2,
  "name": "Adding items to cart",
  "description": "",
  "id": "adding-items-to-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "No item selected in basket",
  "description": "",
  "id": "adding-items-to-cart;no-item-selected-in-basket",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I start the application",
  "rows": [
    {
      "cells": [
        "Application_Name"
      ],
      "line": 6
    },
    {
      "cells": [
        "Amazon"
      ],
      "line": 7
    },
    {
      "cells": [
        "Ebay"
      ],
      "line": 8
    },
    {
      "cells": [
        "Craigslist"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see a selection of product",
  "rows": [
    {
      "cells": [
        "Product_Name",
        "Product_Category"
      ],
      "line": 11
    },
    {
      "cells": [
        "Laptop",
        "Electronics"
      ],
      "line": 12
    },
    {
      "cells": [
        "Pen",
        "Stationery"
      ],
      "line": 13
    },
    {
      "cells": [
        "Mobile",
        "Electronics"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I browse \"\u003cBrowsing_Product\u003e\" buying product",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "My basket \"\u003cBuying_Option\u003e\" be empty",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I \"\u003cBuying_Status\u003e\" buy an item",
  "keyword": "And "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "adding-items-to-cart;no-item-selected-in-basket;",
  "rows": [
    {
      "cells": [
        "Browsing_Product",
        "Buying_Option",
        "Buying_Status"
      ],
      "line": 22,
      "id": "adding-items-to-cart;no-item-selected-in-basket;;1"
    },
    {
      "cells": [
        "Without",
        "Should",
        "Cannot"
      ],
      "line": 23,
      "id": "adding-items-to-cart;no-item-selected-in-basket;;2"
    },
    {
      "cells": [
        "With",
        "Shouldnot",
        "Can"
      ],
      "line": 24,
      "id": "adding-items-to-cart;no-item-selected-in-basket;;3"
    },
    {
      "cells": [
        "xxx",
        "YYY",
        "zzz"
      ],
      "line": 25,
      "id": "adding-items-to-cart;no-item-selected-in-basket;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "No item selected in basket",
  "description": "",
  "id": "adding-items-to-cart;no-item-selected-in-basket;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I start the application",
  "rows": [
    {
      "cells": [
        "Application_Name"
      ],
      "line": 6
    },
    {
      "cells": [
        "Amazon"
      ],
      "line": 7
    },
    {
      "cells": [
        "Ebay"
      ],
      "line": 8
    },
    {
      "cells": [
        "Craigslist"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see a selection of product",
  "rows": [
    {
      "cells": [
        "Product_Name",
        "Product_Category"
      ],
      "line": 11
    },
    {
      "cells": [
        "Laptop",
        "Electronics"
      ],
      "line": 12
    },
    {
      "cells": [
        "Pen",
        "Stationery"
      ],
      "line": 13
    },
    {
      "cells": [
        "Mobile",
        "Electronics"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I browse \"Without\" buying product",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "My basket \"Should\" be empty",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I \"Cannot\" buy an item",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.I_start_the_application(DataTable)"
});
formatter.result({
  "duration": 26442678,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.I_should_see_a_selection_of_product(DataTable)"
});
formatter.result({
  "duration": 756176,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Without",
      "offset": 10
    }
  ],
  "location": "ShoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 2134977,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Should",
      "offset": 11
    }
  ],
  "location": "ShoppingStep.My_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 326172,
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
  "duration": 241052,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "No item selected in basket",
  "description": "",
  "id": "adding-items-to-cart;no-item-selected-in-basket;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I start the application",
  "rows": [
    {
      "cells": [
        "Application_Name"
      ],
      "line": 6
    },
    {
      "cells": [
        "Amazon"
      ],
      "line": 7
    },
    {
      "cells": [
        "Ebay"
      ],
      "line": 8
    },
    {
      "cells": [
        "Craigslist"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see a selection of product",
  "rows": [
    {
      "cells": [
        "Product_Name",
        "Product_Category"
      ],
      "line": 11
    },
    {
      "cells": [
        "Laptop",
        "Electronics"
      ],
      "line": 12
    },
    {
      "cells": [
        "Pen",
        "Stationery"
      ],
      "line": 13
    },
    {
      "cells": [
        "Mobile",
        "Electronics"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I browse \"With\" buying product",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "My basket \"Shouldnot\" be empty",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I \"Can\" buy an item",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.I_start_the_application(DataTable)"
});
formatter.result({
  "duration": 601345,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.I_should_see_a_selection_of_product(DataTable)"
});
formatter.result({
  "duration": 613453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "With",
      "offset": 10
    }
  ],
  "location": "ShoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 215002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shouldnot",
      "offset": 11
    }
  ],
  "location": "ShoppingStep.My_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 678393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Can",
      "offset": 3
    }
  ],
  "location": "ShoppingStep.I_Cannot_buy_an_item(String)"
});
formatter.result({
  "duration": 213167,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "No item selected in basket",
  "description": "",
  "id": "adding-items-to-cart;no-item-selected-in-basket;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I start the application",
  "rows": [
    {
      "cells": [
        "Application_Name"
      ],
      "line": 6
    },
    {
      "cells": [
        "Amazon"
      ],
      "line": 7
    },
    {
      "cells": [
        "Ebay"
      ],
      "line": 8
    },
    {
      "cells": [
        "Craigslist"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should see a selection of product",
  "rows": [
    {
      "cells": [
        "Product_Name",
        "Product_Category"
      ],
      "line": 11
    },
    {
      "cells": [
        "Laptop",
        "Electronics"
      ],
      "line": 12
    },
    {
      "cells": [
        "Pen",
        "Stationery"
      ],
      "line": 13
    },
    {
      "cells": [
        "Mobile",
        "Electronics"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I browse \"xxx\" buying product",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "My basket \"YYY\" be empty",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I \"zzz\" buy an item",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingStep.I_start_the_application(DataTable)"
});
formatter.result({
  "duration": 419731,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStep.I_should_see_a_selection_of_product(DataTable)"
});
formatter.result({
  "duration": 582634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxx",
      "offset": 10
    }
  ],
  "location": "ShoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 276641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "YYY",
      "offset": 11
    }
  ],
  "location": "ShoppingStep.My_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 247289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zzz",
      "offset": 3
    }
  ],
  "location": "ShoppingStep.I_Cannot_buy_an_item(String)"
});
formatter.result({
  "duration": 178679,
  "status": "passed"
});
});