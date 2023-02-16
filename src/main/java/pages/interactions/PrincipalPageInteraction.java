package pages.interactions;

import pages.PrincipalPage;

public class PrincipalPageInteraction {
    PrincipalPage principalPage = new PrincipalPage();

    public boolean validarInicioSesionCorrecto(){

        principalPage.getImgAccount().click();
        return principalPage.getLblAccount().isDisplayed();
    }
}
