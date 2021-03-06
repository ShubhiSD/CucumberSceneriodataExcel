$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cal.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator",
  "description": "As a user\r\nI want to use a calculator to add numbers\r\nSo that I don\u0027t need to add myself",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Add two numbers \u003cnum1\u003e \u0026 \u003cnum2\u003e",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add \u003cnum1\u003e and \u003cnum2\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be \u003ctotal\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;",
  "rows": [
    {
      "cells": [
        "num1",
        "num2",
        "total"
      ],
      "line": 12,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;1"
    },
    {
      "cells": [
        "-2",
        "3",
        "1"
      ],
      "line": 13,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;2"
    },
    {
      "cells": [
        "10",
        "15",
        "25"
      ],
      "line": 14,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;3"
    },
    {
      "cells": [
        "99",
        "-99",
        "0"
      ],
      "line": 15,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;4"
    },
    {
      "cells": [
        "-1",
        "-10",
        "-11"
      ],
      "line": 16,
      "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Add two numbers -2 \u0026 3",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add -2 and 3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be 1",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.initailizeCalculator()"
});
formatter.result({
  "duration": 70654743,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "StepDefinitions.printTotal(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Add two numbers 10 \u0026 15",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add 10 and 15",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be 25",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.initailizeCalculator()"
});
formatter.result({
  "duration": 82330507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 6
    },
    {
      "val": "15",
      "offset": 13
    }
  ],
  "location": "StepDefinitions.addNumber(int,int)"
});
formatter.result({
  "duration": 320336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 21
    }
  ],
  "location": "StepDefinitions.printTotal(int)"
});
formatter.result({
  "duration": 535332,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Add two numbers 99 \u0026 -99",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add 99 and -99",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be 0",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.initailizeCalculator()"
});
formatter.result({
  "duration": 49948006,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 21
    }
  ],
  "location": "StepDefinitions.printTotal(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Add two numbers -1 \u0026 -10",
  "description": "",
  "id": "calculator;add-two-numbers-\u003cnum1\u003e-\u0026-\u003cnum2\u003e;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add -1 and -10",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be -11",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.initailizeCalculator()"
});
formatter.result({
  "duration": 22993920,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Multiply two numbers num1 \u0026 num2",
  "description": "",
  "id": "calculator;multiply-two-numbers-num1-\u0026-num2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I multiply num1 and num2",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the result should be multiplication",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.initailizeCalculator()"
});
formatter.result({
  "duration": 43659602,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.multiplyNumber()"
});
formatter.result({
  "duration": 2721500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.printMultiplication()"
});
formatter.result({
  "duration": 190335920,
  "status": "passed"
});
       });