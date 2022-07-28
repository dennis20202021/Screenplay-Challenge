package com.shopping.task;

import com.shopping.util.csv.Data;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import com.shopping.ui.PlazaVeaHomePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SearchItem {

    static Data data = new Data();
    static String path = "src/test/resources/data/item_to_search.csv";

    private SearchItem() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable inTheSearchBox(Integer item) {
        return Task.where("{0} type item to search",
                WaitUntil.the(PlazaVeaHomePage.SEARCH_FIELD, isClickable()),
                Click.on(PlazaVeaHomePage.SEARCH_FIELD),
                Enter.theValue(data.getData(0, item, path))
                        .into(PlazaVeaHomePage.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
