package Definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import Steps.DemoSerenityStep;

public class DemoSerenityDefinition {

    @Steps
    DemoSerenityStep demoSerenityStep;

    @Dado("que el usuario ingresa a la pagina")
    public void queElUsuarioIngresaALaPagina() {
        demoSerenityStep.abrirWeb();
    }

    @Cuando("el usuario se loguea con su {string} y su {string}")
    public void elUsuarioSeLogueaConSuYSu(String usuario, String contrasena){
        demoSerenityStep.loguearse(usuario.toString(), contrasena.toString());
    }
    @Entonces("se espera que el usuario sea redirigido a la pagina principal")
    public void seEsperaQueElUsuarioSeaRedirigidoALaPaginaPrincipal() {
        demoSerenityStep.validarInicioSesion();
    }

}
