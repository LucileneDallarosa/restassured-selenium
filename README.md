# Automation Code Challenge 

##Test Selenium on Demo.automationtesting.in
This task aims to automate a user registration on the website http://demo.automationtesting.in/Register.html, using the concepts of BDD and testing UI.
On 2/15/2021, The form on the http://demo.automationtesting.in/Register.html page was returning the message: 
"Access to XMLHttpRequest at 'https://api.mlab.com/api/1/databases/userdetails/collections/newtable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X 'from origin' http://demo.automationtesting.in 'has been blocked by CORS policy: No' Access-Control-Allow-Origin 'header is present on the requested resource. " .
In a palatal measure, I carried out the asserts by the ng-valid itself.

###Scenario
* Register a new user with all fields
* Register a new user with only the required fields
* Invalidate registration of a new user when the Mandatory fields are empty
* Invalidate registration of a new user when the E-mail is invalid
* Invalidate registration of a new user when the Phone is invalid
* Invalidate registration of a new user when the Password is invalid
* Invalidate registration of a new user when the Date Of Birth is  February, 31th

###Bugs Found:
- Allows Birthday Date: February, 31th
- Date Of Birth, Password and Confirm Password fields are not "*" and are mandatory.
- The Format Brazilian Phone aren't accept
- Clicking Submit is returning an error: 400 on the Chrome console instead of going to another page.

##Test restAssured on Viacep.com.br/ws/{cep}/json/
This project aimed to automate the API result https://viacep.com.br/ws/{cep}/json/

###Scenario
* Get Correct Adress Information from ZipCode
* Get Invalid ZipCode

## Tools
* Maven
* Java

## Frameworks used
* Cucumber
* Junit
* Selenium
* NG Web Driver
* RestAssured
