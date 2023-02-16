package pages;

import net.serenitybdd.core.pages.PageObject;

public class GeneralPage extends PageObject {

    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }
}
