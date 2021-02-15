# Automation Code Challenge 

##Test Selenium on Demo.automationtesting.in
This task aims to automate a user registration on the website http://demo.automationtesting.in/Register.html, using the concepts of BDD and UI testing. On 2/15/2021, the page form http://demo.automationtesting.in/Register.html was returning the message: 
"Access to XMLHttpRequest at 'https://api.mlab.com/api/1/databases/userdetails/collections/newtable?apiKey=YEX0M2QMPd7JWJw_ipMB3a5gDddt4B_X' from origin 'http://demo.automationtesting.in' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.".
In a palliative measure, I executed the statements by ng-valid itself.

###Test Scenarios
* Register a new user with all fields
* Register a new user with the required fields only
* Invalidate the registration of a new user when the Mandatory fields are empty
* Invalidate the registration of a new user when the E-mail is invalid
* Invalidate the registration of a new user when the Phone is invalid
* Invalidate the registration of a new user when the Password is invalid
* Invalidate the registration of a new user when the Date Of Birth is invalid (February, 31th)

###Bugs Found:
- Allows Birthday Date: February, 31th
- The Date of Birth, Password and Confirm Password fields are not marked with "*" but are mandatory
- The Brazilian phone format is not supported
- Clicking "Submit" is returning error 400 on the Chrome console instead of going to another page

##Test RestAssured on Viacep.com.br/ws/{cep}/json/
This project aims to automate the API result https://viacep.com.br/ws/{cep}/json/

###Test Scenarios
* Get Correct Postal Code address information
* Get Invalid ZipCode

## Tools
* Maven
* Java

## Frameworks used
* Cucumber
* Junit
* Selenium
* NG WebDriver
* RestAssured
