package co.com.sofka.tasks.zonafit;

import co.com.sofka.utils.Numeros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.sofka.interactions.ProductRandon.productRandon;
import static co.com.sofka.userinterfaces.zonafit.CarTaskInterface.*;

public class Compra implements Task  {

    private String numIdentificacion;

    private String email;

    private String nombre;

    private String apellido;

    private String direccioon;

    private String numCelular;

    private String departamento;

    private String municipio;

    public Compra uningDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public Compra uningMunicipio(String municipio) {
        this.municipio = municipio;
        return this;
    }

    public Compra uningNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
        return this;
    }

    public Compra usingEmail(String email) {
        this.email = email;
        return this;
    }

    public Compra usingNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Compra usingApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public Compra usingDireccioon(String direccioon) {
        this.direccioon = direccioon;
        return this;
    }

    public Compra usingNumCelular(String numCelular) {
        this.numCelular = numCelular;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Scroll.to(OFERTAS),
                    DoubleClick.on(OFERTAS),
                    productRandon(PRODUCTO),
                    Scroll.to(CARRO),
                    DoubleClick.on(CARRO),
                    DoubleClick.on(CARRO),
                    Scroll.to(MAS_PROD),
                    DoubleClick.on(MAS_PROD),
                    DoubleClick.on(MAS_PROD),
                    WaitUntil.the(PEDIDO, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(Numeros.TIME.getValues()).seconds(),
                    Scroll.to(PEDIDO),
                    DoubleClick.on(PEDIDO),
                    WaitUntil.the(SELEC, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(Numeros.TIME.getValues()).seconds(),
                    Scroll.to(SELEC),
                    Clear.field(NUMID),
                    Enter.theValue(numIdentificacion).into(NUMID),
                    Clear.field(EMAIL),
                    Enter.theValue(email).into(EMAIL),
                    Clear.field(NOMBRE),
                    Enter.theValue(nombre).into(NOMBRE),
                    Clear.field(APELLIDO),
                    Enter.theValue(apellido).into(APELLIDO),
                    WaitUntil.the(DEPARTAMENTO, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(Numeros.TIME.getValues()).seconds(),
                    Click.on(DEPARTAMENTO),
                    Click.on(ESCRIBIR),
                    Enter.theValue(departamento).into(ESCRIBIR),
                    Hit.the(Keys.ENTER).into(DEPRTAMENTOS),
                    Click.on(MUNICIPIO),
                    WaitUntil.the(MUNICIPIO, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(Numeros.TIME.getValues()).seconds(),
                    Click.on(ESCRIBIR),
                    Enter.theValue(municipio).into(ESCRIBIR),
                    Hit.the(Keys.ENTER).into(MUNICIPIOS),
                    Clear.field(DIRECCION),
                    Enter.theValue(direccioon).into(DIRECCION),
                    Clear.field(NUM_CELULAR),
                    Enter.theValue(numCelular).into(NUM_CELULAR),
                    WaitUntil.the(ACEPTO, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(Numeros.TIME.getValues()).seconds(),
                    Scroll.to(ACEPTO),
                    Click.on(ACEPTO),
                    WaitUntil.the(FINALIZAR, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(Numeros.TIME.getValues()).seconds(),
                    Click.on(FINALIZAR),
                    WaitUntil.the(VALIDACION, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(Numeros.TIME.getValues()).seconds()

                    );
    }

    public static Compra compra(){
        return new Compra();
    }
}
