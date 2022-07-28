package com.shopping.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import com.shopping.ui.PlazaVeaHomePage;

public class NavigateTo {

    private NavigateTo() {
        throw new IllegalStateException("Utility class");
    }

    public static Performable thePlazaVeaHomePage() {
        return Task.where("{0} opens the PlazaVea home page",
                Open.browserOn().the(PlazaVeaHomePage.class)
        );
    }
}
