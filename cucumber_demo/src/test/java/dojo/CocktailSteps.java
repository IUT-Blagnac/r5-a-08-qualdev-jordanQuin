package test.java.dojo;

import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(Cucumber.class)
public class CocktailSteps {

    private Order order;

    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String string) {
        order = new Order();
        order.declareOwner(string);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String string) {
        order.declareTarget(string);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_no_cocktail_in_the_order(int number) {
        List<String> cocktails = order.getCocktails();
        assertEquals(number, cocktails.size());
    }
}
