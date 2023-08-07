package co.com.sofka.runners.zonafit;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/zonafit/zonafit.feature"},
        glue = {"co.com.sofka.stepdefinitions.zonafit"},
        tags = "not @ignore"
)
public class ZonafitRunner {
}
