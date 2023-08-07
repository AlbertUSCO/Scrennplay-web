package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.security.SecureRandom;
import java.util.Random;

import static co.com.sofka.userinterfaces.zonafit.CarTaskInterface.PRODUCTO;

public class ProductRandon implements Interaction {

    private Target target;

    private ProductRandon(Target target){
        this.target=target;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new SecureRandom();

        int position = random.nextInt(target.resolveAllFor(actor).size());
        Scroll.to(target.resolveAllFor(actor).get(position));
        target.resolveAllFor(actor).get(position).click();
    }

    public static ProductRandon productRandon(Target target){
        return new ProductRandon(target);
    }
}
