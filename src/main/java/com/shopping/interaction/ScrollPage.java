package com.shopping.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public abstract class ScrollPage implements Interaction {

    protected void performScrollBy(Actor actor, int y) {
        BrowseTheWeb.as(actor).evaluateJavascript("window.scrollBy(0," + y + ")", "");
    }

}
