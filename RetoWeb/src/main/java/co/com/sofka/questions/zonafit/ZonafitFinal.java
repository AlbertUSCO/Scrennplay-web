package co.com.sofka.questions.zonafit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.zonafit.CarTaskInterface.VALIDACION;

public class ZonafitFinal implements Question<Boolean> {

    private String actualizado;


    public ZonafitFinal verificarCarro(String actualizado) {
        this.actualizado = actualizado;
        return this;
    }


    public ZonafitFinal is(){
        return this;
    }


    @Override
    public Boolean answeredBy(Actor actor)
    {
        return (VALIDACION.resolveFor(actor).containsText(actualizado));
    }

    public static ZonafitFinal zonafitFinal(){
        return new ZonafitFinal();
    }

}
