package com.shopping.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import com.shopping.question.Item;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ValidateItem {

    static String expectedCondition = "1 un";

    private ValidateItem() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable storedInTheCart() {
        return Task.where("{0} validate item added to the cart",
                (actor -> actor.should(seeThat(Item.addedToTheCart(), equalToIgnoringCase(expectedCondition))))
        );
    }

}
