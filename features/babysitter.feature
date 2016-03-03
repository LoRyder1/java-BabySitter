#Feature:
#As a babysitter
#In order to get paid for 1 night of work
#I want to calculate my nightly charge
#
#  Scenario: Calculate pay for 1 night of work
#  Given I babysit from 17 to 28
#  Then I get paid 140


Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl