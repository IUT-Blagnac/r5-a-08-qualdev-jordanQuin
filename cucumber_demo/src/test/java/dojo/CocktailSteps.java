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

    @Given("Romeo who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink() {
        order = new Order();
        order.declareOwner("Romeo");
    }

    @When("an order is declared for Juliette")
    public void an_order_is_declared_for_juliette() {
        order.declareTarget("Juliette");
    }

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        List<String> cocktails = order.getCocktails();
        assertEquals(0, cocktails.size());
    }
}
