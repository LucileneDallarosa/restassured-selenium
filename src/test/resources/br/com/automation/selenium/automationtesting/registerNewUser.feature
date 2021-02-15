Feature: Register new user process

  Scenario: Register a new user with all fields
    Given Access WebPage http://demo.automationtesting.in/Register.html
     When Enter First Name with Lucilene
      And Enter Last Name with Dallarosa
      And Enter Adress with Av. Pres. João Goulart, 551 - Centro Histórico, Porto Alegre
      And Enter Email Adress with teste@teste.com
      And Enter Phone with 5555555555
      And Select the Female Gender
      And Select the Cricket Hobbies
      And Select the Movies Hobbies
      And Select the APIs Skills
      And Select the Brazil Country
      And Select the Date Of Birth 9 - November - 1970
      And Enter Password with @Teste123
      And Enter Confirm Password with @Teste123
     Then Register the user
      And Close WebPage

  Scenario: Register a new user with only the required fields
    Given Access WebPage http://demo.automationtesting.in/Register.html
     When Enter First Name with Lucilene
      And Enter Last Name with Dallarosa
      And Enter Email Adress with teste@teste.com
      And Enter Phone with 5555555555
      And Select the Female Gender
      And Select the Brazil Country
      And Select the Date Of Birth 9 - November - 1970
      And Enter Password with @Teste123
      And Enter Confirm Password with @Teste123
     Then Register the user
      And Close WebPage

  Scenario: Invalidate registration of a new user when the Mandatory fields are empty
   Given Access WebPage http://demo.automationtesting.in/Register.html
    When Select the Cricket Hobbies
     And Select the Movies Hobbies
    Then Form is Invalid
     And First Name is Invalid
     And Last Name is Invalid
     And Email Adress is Invalid
     And Phone is Invalid
     And Country is Invalid
     And Date Of Birth is Invalid
     And Password is Invalid
     And CPassword is Invalid
     And Close WebPage

  Scenario: Invalidate registration of a new user when the E-mail is invalid
    Given Access WebPage http://demo.automationtesting.in/Register.html
     When Enter First Name with Lucilene
      And Enter Last Name with Dallarosa
      And Enter Adress with Av. Pres. João Goulart, 551 - Centro Histórico, Porto Alegre
      And Enter Email Adress with teste
      And Enter Phone with 5555555555
      And Select the Female Gender
      And Select the Cricket Hobbies
      And Select the Movies Hobbies
      And Select the APIs Skills
      And Select the Brazil Country
      And Select the Date Of Birth 9 - November - 1970
      And Enter Password with @Teste123
      And Enter Confirm Password with @Teste123
     Then Form is Invalid
      And Email Adress is Invalid
      And Close WebPage

  Scenario: Invalidate registration of a new user when the Phone is invalid
    Given Access WebPage http://demo.automationtesting.in/Register.html
     When Enter First Name with Lucilene
      And Enter Last Name with Dallarosa
      And Enter Adress with Av. Pres. João Goulart, 551 - Centro Histórico, Porto Alegre
      And Enter Email Adress with teste@teste.com
      And Enter Phone with +555195959595
      And Select the Female Gender
      And Select the Cricket Hobbies
      And Select the Movies Hobbies
      And Select the APIs Skills
      And Select the Brazil Country
      And Select the Date Of Birth 9 - November - 1970
      And Enter Password with @Teste123
      And Enter Confirm Password with @Teste123
     Then Form is Invalid
      And Phone is Invalid
      And Close WebPage

  Scenario: Invalidate registration of a new user when the Password is invalid
    Given Access WebPage http://demo.automationtesting.in/Register.html
     When Enter First Name with Lucilene
      And Enter Last Name with Dallarosa
      And Enter Adress with Av. Pres. João Goulart, 551 - Centro Histórico, Porto Alegre
      And Enter Email Adress with teste@teste.com
      And Enter Phone with 5555555555
      And Select the Female Gender
      And Select the Cricket Hobbies
      And Select the Movies Hobbies
      And Select the APIs Skills
      And Select the Brazil Country
      And Select the Date Of Birth 9 - November - 1970
      And Enter Password with teste
      And Enter Confirm Password with teste
     Then Form is Invalid
      And Password is Invalid
      And Close WebPage

  Scenario: Invalidate registration of a new user when the Date Of Birth is  February, 31th
    Given Access WebPage http://demo.automationtesting.in/Register.html
     When Enter First Name with Lucilene
      And Enter Last Name with Dallarosa
      And Enter Adress with Av. Pres. João Goulart, 551 - Centro Histórico, Porto Alegre
      And Enter Email Adress with teste@teste.com
      And Enter Phone with 5555555555
      And Select the Female Gender
      And Select the Cricket Hobbies
      And Select the Movies Hobbies
      And Select the APIs Skills
      And Select the Brazil Country
      And Select the Date Of Birth  February, 31th - 1970
      And Enter Password with @Teste123
      And Enter Confirm Password with @Teste123
     Then Form is Invalid
      And Close WebPage

