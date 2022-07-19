package starter.com.question;

import net.serenitybdd.screenplay.Question;
import starter.com.ui.QueryPage;

public class Item {

    private Item() {
        throw new IllegalStateException("Utility class");
    }

    public static Question<String> addedToTheCart() {
        return actor -> QueryPage.CART.resolveFor(actor).waitUntilVisible().getAttribute("value");
    }

}
