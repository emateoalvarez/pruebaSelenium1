package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class PrincipalPage extends PageObject {
    @FindBy(xpath = "//body/aside[@id='s-sidebar']/div[1]/ul[2]/li[3]/div[1]/a[1]/i[1]")
    private WebElementFacade imgAccount;

    @FindBy(xpath = "//body/aside[@id='s-sidebar']/div[1]/ul[2]/li[3]/div[1]/div[1]/div[1]/p[1]")
    private WebElementFacade lblAccount;
}
