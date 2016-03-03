package step_definitions;

import cucumber.api.java.en.Given;

public class BabySitterStepDefs {

//    @Given("^I babysit from 17 to 28")
//    BabySitter b = new BabySitter();
//    public void
//    Given I babysit from 17 to 28

    private Belly belly;
    private int waitingTime;

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime) throws Throwable {
        this.waitingTime = waitingTime;
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_growl(String expectedSound) throws Throwable {
        String actualSound = belly.getSound(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }

}
