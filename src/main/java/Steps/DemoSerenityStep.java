package Steps;

import net.thucydides.core.annotations.Step;
import pages.GeneralPage;
import pages.InicioPage;
import pages.PrincipalPage;

public class DemoSerenityStep {
    GeneralPage generalPage = new GeneralPage();

    PrincipalPage principalPage = new PrincipalPage();
    InicioPage inicioPage= new InicioPage();

    @Step
    public void abrirWeb(){
        generalPage.open();
    }
    @Step
    public void loguearse(String usuario, String contrasena){
        inicioPage.getTxtUser().clear();
        inicioPage.getTxtUser().sendKeys(usuario);
        inicioPage.getTxtPassword().clear();
        inicioPage.getTxtPassword().sendKeys(contrasena);
        inicioPage.getBtnSignIn().click();
    }

    @Step
    public boolean validarInicioSesion(){
        principalPage.getImgAccount().click();
        return principalPage.getLblAccount().isDisplayed();
    }
}
