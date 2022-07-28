package com.shopping.question;

import com.shopping.ui.QueryPage;
import net.serenitybdd.screenplay.Question;

public class Item {

    private Item() {
        throw new IllegalStateException("Utility class");
    }

    public static Question<String> addedToTheCart() {
        return actor -> QueryPage.CART.resolveFor(actor).waitUntilVisible().getAttribute("value");
    }

}
