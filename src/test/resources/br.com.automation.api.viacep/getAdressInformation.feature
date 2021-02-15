Feature: Get Adress Information from ZipCode

  Scenario: Get Correct Adress Information from ZipCode
    Given Want zip code information 01001000 from uri https://viacep.com.br and path /ws/{cep}/json/
    When Make the request
    Then The HttpStatus is 200
    And The Response Body is valid
    And The Reponse is cep: 01001-000, logradouro: Praça da Sé, complemento: lado ímpar, bairro: Sé, localidade: São Paulo, uf: SP, ibge: 3550308

  Scenario: Get Invalid ZipCode
    Given Want zip code information 9999 from uri https://viacep.com.br and path /ws/{cep}/json/
    When Make the request
    Then The HttpStatus is 400
