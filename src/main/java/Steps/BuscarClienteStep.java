package Steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CustomerPage;
import pages.InicioPage;

public class BuscarClienteStep {

    CustomerPage customerPage = new CustomerPage();
    InicioPage inicioPage= new InicioPage();
    WebDriver driver = new ChromeDriver();

    @Step
    public void customerSection(){
        driver.get("https://demo.serenity.is/Northwind/Customer");
    }

    @Step
    public void abrirNorthwindSection(){
        customerPage.getLblNorthwind().click();
    }

    @Step
    public void abrirCustomerSection(){
        customerPage.getLblCustomer().click();
    }

    @Step
    public void BuscarCliente(String id){
        inicioPage.getTxtUser().clear();
        inicioPage.getTxtUser().sendKeys("admin");
        inicioPage.getTxtPassword().clear();
        inicioPage.getTxtPassword().sendKeys("serenity");
        inicioPage.getBtnSignIn().click();
        customerPage.getTxtSearchCustomer().sendKeys(id);
    }

    @Step
    public boolean validarCliente(){
        return customerPage.getTxtFindCustomer().isDisplayed();
    }
}
