package com.shopping.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import com.shopping.exception.ElementNotFoundException;
import com.shopping.task.AddItem;
import com.shopping.task.NavigateTo;
import com.shopping.task.SearchItem;
import com.shopping.task.ValidateItem;
import com.shopping.ui.PlazaVeaHomePage;
import com.shopping.ui.QueryPage;

public class SearchAndAddItem {

    String ELEMENT_TARGET = "Element target";

    @Given("{actor} navigates to PlazaVea home page")
    public void onlineUserNavigatesToPlazaVeaHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.thePlazaVeaHomePage()
        );
    }

    @When("{actor} look for a new {int}")
    public void theyLookForANewItem(Actor actor, Integer item) {
        try {
            actor.attemptsTo(
                    SearchItem.inTheSearchBox(item)
            );
        } catch (Exception e) {
            throw new ElementNotFoundException(ELEMENT_TARGET, PlazaVeaHomePage.SEARCH_FIELD.getName(), e);
        }
    }

    @And("{actor} add new item to the cart")
    public void theyAddNewItemToTheCart(Actor actor) {
        try {
            actor.attemptsTo(
                    AddItem.toTheCart()
            );
        } catch (Exception e) {
            throw new ElementNotFoundException(ELEMENT_TARGET, QueryPage.ADD_ITEM_BUTTON.getName(), e);
        }
    }

    @Then("{actor} validate item stored in the cart")
    public void theyValidateItemStoredInTheCart(Actor actor) {
        try {
            actor.attemptsTo(
                    ValidateItem.storedInTheCart()
            );
        } catch (Exception e) {
            throw new ElementNotFoundException(ELEMENT_TARGET, QueryPage.CART.getName(), e);
        }
    }
}
