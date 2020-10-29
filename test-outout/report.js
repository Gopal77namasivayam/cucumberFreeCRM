$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/GOPAL NAMASIVAYAM/Desktop/ecli/FreeCRMBddFramework/src/test/java/Features/dealswithMAP.feature");
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
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicked delas links",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user created delas data",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 12
    },
    {
      "cells": [
        "test dealGopal",
        "1000",
        "50",
        "10"
      ],
      "line": 13
    },
    {
      "cells": [
        "test dealKumar",
        "2000",
        "60",
        "20"
      ],
      "line": 14
    },
    {
      "cells": [
        "test dealSubbu",
        "3000",
        "70",
        "30"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepsDefWithMap.user_is_in_login_page()"
});
formatter.result({
  "duration": 87126275182,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsDefWithMap.title_of_the_login_page_is_freecrm()"
});
formatter.result({
  "duration": 2051259587,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsDefWithMap.user_enter_usernameand_password(DataTable)"
});
formatter.result({
  "duration": 566292622,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsDefWithMap.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 7195718725,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsDefWithMap.user_in_home_page()"
});
formatter.result({
  "duration": 16897370,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsDefWithMap.user_clicked_contacts_links()"
});
formatter.result({
  "duration": 6200121714,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsDefWithMap.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 46076461616,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepsDefWithMap.close_the_browser()"
});
formatter.result({
  "duration": 851454281,
  "status": "passed"
});
});