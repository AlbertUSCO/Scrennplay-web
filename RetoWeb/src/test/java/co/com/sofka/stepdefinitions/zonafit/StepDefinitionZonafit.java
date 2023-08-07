package co.com.sofka.stepdefinitions.zonafit;

import co.com.sofka.setup.ui.Setup;
import co.com.sofka.utils.HackCode;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.com.sofka.questions.zonafit.Zonafit.zonafitValidacion;
import static co.com.sofka.questions.zonafit.ZonafitFinal.zonafitFinal;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.zonafit.CarTask.carTask;
import static co.com.sofka.tasks.zonafit.Compra.compra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitionZonafit extends Setup {

    Faker faker= new Faker();
    private static final Logger LOGGER = Logger.getLogger(StepDefinitionZonafit.class);
    private static final String ACTOR_NAME = HackCode.ACTOR.getValues();
    @Dado("que el usuario se encuentra en el sitio web de ofertas")
    public void queElUsuarioSeEncuentraEnElSitioWebDeOfertas() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );

        } catch (Exception e){
            Assertions.fail(e.getMessage());
            LOGGER.warn(e.getMessage(), e);
        }
    }
    @Cuando("El cliente agrega los productos al carrito")
    public void elClienteAgregaLosProductosAlCarrito() {
        try { theActorInTheSpotlight().attemptsTo(
                carTask()
        );

        } catch (Exception e){
            Assertions.fail(e.getMessage());
            LOGGER.warn(e.getMessage(), e);
        }

    }
    @Entonces("El cliente podra visualizar los products en el carrito")
    public void elClientePodraVisualizarLosProductsEnElCarrito() {
        try { theActorInTheSpotlight().should(
               seeThat(zonafitValidacion().verificarCarro(HackCode.CARRO_OK.getValues()).is(), equalTo(true))
        );
        } catch (Exception e){
            Assertions.fail(e.getMessage());
            LOGGER.warn(e.getMessage(), e);
        }
    }



    @Cuando("El cliente selecciona los productos y finaliza la compra")
    public void elClienteSeleccionaLosProductosYFinalizaLaCompra() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    compra()
                            .uningNumIdentificacion(faker.idNumber().valid().replaceAll("\\D+",""))
                            .usingEmail(faker.internet().emailAddress())
                            .usingNombre(faker.name().firstName())
                            .usingApellido(faker.name().lastName())
                            .uningDepartamento(HackCode.HUILA.getValues())
                            .uningMunicipio(HackCode.NEIVA.getValues())
                            .usingDireccioon(faker.address().fullAddress())
                            .usingNumCelular(faker.phoneNumber().phoneNumber().replaceAll("\\D+",""))
            );
        } catch (Exception e){
            Assertions.fail(e.getMessage());
            LOGGER.warn(e.getMessage(), e);
        }

    }
    @Entonces("llenara el formulario, aceptara los terminos y tendra un numero de pedido")
    public void llenaraElFormularioAceptaraLosTerminosYTendraUnNumeroDePedido() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(zonafitFinal().verificarCarro(HackCode.VALIDACION.getValues())
                            .is(), equalTo(true))
            );
        } catch (Exception e){
            Assertions.fail(e.getMessage());
            LOGGER.warn(e.getMessage(), e);
        }

    }

}
