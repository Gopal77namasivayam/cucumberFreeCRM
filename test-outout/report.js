$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/GOPAL NAMASIVAYAM/Desktop/ecli/FreeCRMBddFramework/src/test/java/Features/delas.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Deals",
  "description": "",
  "id": "freecrm-deals",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Deals Create Scenrios",
  "description": "",
  "id": "freecrm-deals;deals-create-scenrios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 6
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicked delas links",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user created delas data",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_is_in_login_page()"
});
formatter.result({
  "duration": 14923493183,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.title_of_the_login_page_is_freecrm()"
});
formatter.result({
  "duration": 2138993102,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enter_usernameand_password(DataTable)"
});
formatter.result({
  "duration": 426665473,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 8310090427,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_in_home_page()"
});
formatter.result({
  "duration": 15944862,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicked_contacts_links()"
});
formatter.result({
  "duration": 8670292747,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 995207461,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 783542641,
  "status": "passed"
});
});