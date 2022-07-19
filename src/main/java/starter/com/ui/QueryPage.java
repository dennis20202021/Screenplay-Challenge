package starter.com.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class QueryPage extends PageObject {

    public static final Target ADD_ITEM_BUTTON = Target.the("Add item button")
            .locatedBy("/descendant::div[text()='Agregar'][1]");

    public static final Target CART = Target.the("Cart")
            .locatedBy("/descendant::input[@type='text'][3]");
}
