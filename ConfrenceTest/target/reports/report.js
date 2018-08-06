$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/conference/ConfrenceTest/calculator.feature");
formatter.feature({
  "line": 2,
  "name": "calculator",
  "description": "I want calculator to perform addition",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "addition of two numbers",
  "description": "",
  "id": "calculator;addition-of-two-numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add \u003cnumber1\u003e and \u003cnumber2\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I get the result as  \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "calculator;addition-of-two-numbers;",
  "rows": [
    {
      "cells": [
        "number1",
        "number2",
        "result"
      ],
      "line": 11,
      "id": "calculator;addition-of-two-numbers;;1"
    },
    {
      "cells": [
        "12",
        "24",
        "36"
      ],
      "line": 12,
      "id": "calculator;addition-of-two-numbers;;2"
    },
    {
      "cells": [
        "5",
        "7",
        "12"
      ],
      "line": 13,
      "id": "calculator;addition-of-two-numbers;;3"
    },
    {
      "cells": [
        "9",
        "5",
        "14"
      ],
      "line": 14,
      "id": "calculator;addition-of-two-numbers;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4370042249,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "addition of two numbers",
  "description": "",
  "id": "calculator;addition-of-two-numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add 12 and 24",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I get the result as  36",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorTest.i_want_to_add_two_numbers()"
});
formatter.result({
  "duration": 104352101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 6
    },
    {
      "val": "24",
      "offset": 13
    }
  ],
  "location": "CalculatorTest.i_add_and(int,int)"
});
formatter.result({
  "duration": 1879210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "36",
      "offset": 21
    }
  ],
  "location": "CalculatorTest.i_get_the_result_as(int)"
});
formatter.result({
  "duration": 90317,
  "status": "passed"
});
formatter.before({
  "duration": 5072403475,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "addition of two numbers",
  "description": "",
  "id": "calculator;addition-of-two-numbers;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add 5 and 7",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I get the result as  12",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorTest.i_want_to_add_two_numbers()"
});
formatter.result({
  "duration": 47725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 6
    },
    {
      "val": "7",
      "offset": 12
    }
  ],
  "location": "CalculatorTest.i_add_and(int,int)"
});
formatter.result({
  "duration": 130344,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 21
    }
  ],
  "location": "CalculatorTest.i_get_the_result_as(int)"
});
formatter.result({
  "duration": 82620,
  "status": "passed"
});
formatter.before({
  "duration": 5051142023,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "addition of two numbers",
  "description": "",
  "id": "calculator;addition-of-two-numbers;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I want to add two numbers",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add 9 and 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I get the result as  14",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorTest.i_want_to_add_two_numbers()"
});
formatter.result({
  "duration": 106738,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 6
    },
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "CalculatorTest.i_add_and(int,int)"
});
formatter.result({
  "duration": 131884,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "14",
      "offset": 21
    }
  ],
  "location": "CalculatorTest.i_get_the_result_as(int)"
});
formatter.result({
  "duration": 101607,
  "status": "passed"
});
});