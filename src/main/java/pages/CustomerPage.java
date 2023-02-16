package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
@Getter
public class CustomerPage extends PageObject {
    //body/aside[@id='s-sidebar']/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]
    @FindBy(xpath = "//body/aside[@id='s-sidebar']/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    private WebElementFacade lblNorthwind;

    @FindBy(xpath = "//body/aside[@id='s-sidebar']/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
    private WebElementFacade lblCustomer;

    @FindBy(xpath = "//*[@id='GridDiv']/div[2]/div[1]/input")
    private WebElementFacade txtSearchCustomer;

    @FindBy(xpath = "//*[@id='GridDiv']/div[3]/div[5]/div/div/div[1]/a")
    private WebElementFacade txtFindCustomer;
}
