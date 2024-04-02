Feature: Checkout

  Scenario: Checkout banana
    Given cena "bananu" je 15kc
    When uzivatel nakoupi 5 "bananu"
    Then celkova cena je 75kc

  Scenario: Checkout apple
    Given cena "jablek" je 20kc
    When uzivatel nakoupi 10 "jablek"
    Then celkova cena je 200kc

  Scenario: Checkout banana and apple
    Given cena "bananu" je 15kc
    And cena "jablek" je 20kc
    When uzivatel nakoupi 5 "bananu"
    And uzivatel nakoupi 10 "jablek"
    Then celkova cena je 275kc

  Scenario Outline: Checkout banana and apple multiple scenarios
    Given cena "bananu" je <cenaBananu>kc
    And cena "jablek" je <cenaJablek>kc
    When uzivatel nakoupi <pocetBananu> "bananu"
    And uzivatel nakoupi <pocetJablek> "jablek"
    Then celkova cena je <celkovaCena>kc

    Examples:
      | pocetBananu | cenaBananu | pocetJablek | cenaJablek | celkovaCena |
      | 5           | 10         | 2           | 5          | 60          |
      | 10          | 30         | 5           | 50         | 551         |
      | 1000        | 5          | 1           | 500        | 5500        |
