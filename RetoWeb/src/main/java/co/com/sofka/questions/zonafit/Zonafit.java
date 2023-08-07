package co.com.sofka.questions.zonafit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.zonafit.CarTaskInterface.CARRO_OK;

public class Zonafit implements Question<Boolean> {

    private String actualizado;

    public Zonafit verificarCarro(String actualizado) {
        this.actualizado = actualizado;
        return this;
    }

    public Zonafit is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor)
    {
        return (CARRO_OK.resolveFor(actor).containsText(actualizado));
    }

    public static Zonafit zonafitValidacion(){
        return new Zonafit();
    }

}
