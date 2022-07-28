package com.shopping.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("page:plaza.vea.online.shopping.url")
public class PlazaVeaHomePage extends PageObject {

    public static final Target SEARCH_FIELD = Target.the("Search field")
            .locatedBy("#search_box");

}
