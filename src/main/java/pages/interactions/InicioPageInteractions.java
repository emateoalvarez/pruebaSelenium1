package pages.interactions;

import pages.GeneralPage;
import pages.InicioPage;

public class InicioPageInteractions extends GeneralPage {
    InicioPage inicioPage= new InicioPage();

    public void ingresarDatosUsuario(String usuario){
        //inicioPage.getTxtUser().clear();
        //inicioPage.getTxtUser().sendKeys(usuario);
        if (inicioPage.getTxtUser() != null) {
            inicioPage.getTxtUser().clear();
            inicioPage.getTxtUser().sendKeys(usuario);
        } else {
            System.out.println("Elemento "+ inicioPage.getTxtUser() + "  no encontrado");
        }
    }

    public void ingresarDatosContrasena(String contrasena){
        inicioPage.getTxtPassword().clear();
        inicioPage.getTxtPassword().sendKeys(contrasena);
    }

    public void clickIniciarSesion(){
        inicioPage.getBtnSignIn().click();
    }
}
