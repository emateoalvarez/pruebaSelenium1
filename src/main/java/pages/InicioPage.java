package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
@Getter
public class InicioPage extends PageObject {

    @FindBy(xpath = "//*[@id='LoginPanel0_Username']")
    private WebElementFacade txtUser;

    @FindBy(xpath = "//*[@id='LoginPanel0_Password']")
    private WebElementFacade txtPassword;

    @FindBy(xpath = "//*[@id='LoginPanel0_LoginButton']")
    private WebElementFacade btnSignIn;

}
