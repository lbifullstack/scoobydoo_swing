package scoobydoo;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import cucumber.table.DataTable;

public class StockManagementStepdefs {

    @Given("^we have a warehouse full of stock:$")
    public void we_have_a_warehouse_full_of_stock(DataTable arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        // For automatic conversion, change DataTable to List<YourType>
        throw new PendingException();
    }

    @When("^I visit the stock page$")
    public void I_visit_the_stock_page() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should see all the available stock$")
    public void I_should_see_all_the_available_stock() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
