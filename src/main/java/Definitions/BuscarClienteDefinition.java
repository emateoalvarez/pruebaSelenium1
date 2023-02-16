package Definitions;

import Steps.BuscarClienteStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BuscarClienteDefinition {
    @Steps
    BuscarClienteStep buscarClienteStep = new BuscarClienteStep();

    @Cuando("el usuario introduce un {string} de cliente en la barra de busqueda")
    public void elUsuarioIntroduceUnDeClienteEnLaBarraDeBusqueda(String id) {
        //buscarClienteStep.abrirNorthwindSection();
        //buscarClienteStep.abrirCustomerSection();
        buscarClienteStep.BuscarCliente(id);
    }

    @Entonces("se espera que se encuentre al cliente")
    public void seEsperaQueSeEncuentreAlCliente() {
        buscarClienteStep.validarCliente();
    }

}
