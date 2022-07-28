package com.shopping.task;

import com.shopping.interaction.Scroll;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.shopping.ui.QueryPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddItem {

    private AddItem() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable toTheCart() {
        return Task.where("{0} add new item to the cart",
                Scroll.down(200),
                WaitUntil.the(QueryPage.ADD_ITEM_BUTTON, isClickable()),
                Click.on(QueryPage.ADD_ITEM_BUTTON)
        );
    }

}
