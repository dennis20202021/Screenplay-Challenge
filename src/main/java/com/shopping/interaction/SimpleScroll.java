package com.shopping.interaction;

import net.serenitybdd.screenplay.Actor;

public class SimpleScroll extends ScrollPage {

    private final int y;

    public SimpleScroll(int y) {
        this.y = y;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        performScrollBy(actor, y);
    }

}
