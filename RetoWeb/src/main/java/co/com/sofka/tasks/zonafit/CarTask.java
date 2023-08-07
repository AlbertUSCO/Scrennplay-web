package co.com.sofka.tasks.zonafit;

import co.com.sofka.utils.Numeros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.interactions.ProductRandon.productRandon;
import static co.com.sofka.userinterfaces.zonafit.CarTaskInterface.*;

public class CarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

         int fnCount=Numeros.FN_COUNT.getValues();

        while (fnCount != Numeros.COUNT.getValues()){
            actor.attemptsTo(
                    Scroll.to(OFERTAS),
                    DoubleClick.on(OFERTAS),
                    productRandon(PRODUCTO),
                    Scroll.to(CARRO),
                    DoubleClick.on(CARRO),
                    Scroll.to(OFERTAS),
                    DoubleClick.on(OFERTAS),
                    Scroll.to(CARRO),
                    DoubleClick.on(CARRO));

            fnCount++;
        }
        actor.attemptsTo(
                Scroll.to(MAS_PROD),
                DoubleClick.on(MAS_PROD),

                WaitUntil.the(CARRO_OK, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(Numeros.TIME.getValues())
                        .seconds(),
                Scroll.to(CARRO_OK));


    }

    public static CarTask carTask(){
        return new CarTask();
    }
}
