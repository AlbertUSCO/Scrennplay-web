package co.com.sofka.userinterfaces.zonafit;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

import static org.openqa.selenium.By.*;



public class CarTaskInterface extends PageObject {

    public static final Target PRODUCTO = Target
            .the("Producto Disponible Seleccionado")
            .located(xpath("//*[contains(concat(\" \", @class, \" \"), \" primary is-small mb-0 button product_type_bundle add_to_cart_button ajax_add_to_cart is-flat \")]"));

     public static final Target MAS_PROD = Target
            .the("Producto Seleccionado")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div[1]/form/div/table/tbody/tr[1]/td[5]/div/input[3]"));

     public static final Target OFERTAS = Target
            .the("Entrar en ofertas")
            .located(xpath("//*[@id=\"mega-menu-item-198556\"]/a"));

     public static final Target CARRO = Target
            .the("Ir al carrito")
            .located(xpath("//*[@id=\"masthead\"]/div/div[4]/ul/li[5]/div/a/span/span/span/bdi"));


     public static final Target CARRO_OK = Target
            .the("Total")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div[2]/div/div[2]/h4"));


     public static final Target PEDIDO = Target
            .the("Finalizar")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div[2]/div/div[1]/div/a"));


     public static final Target SELEC = Target
            .the("Sroll")
            .located(xpath("//*[@id=\"customer_details\"]/div[1]/div/h3"));

    public static final Target NUMID = Target
            .the("Numero identificacion")
            .located(xpath("//*[@id=\"billing_myfield12\"]"));

    public static final Target NOMBRE = Target
            .the("Nombre")
            .located(xpath("//*[@id=\"billing_first_name\"]"));


     public static final Target APELLIDO = Target
            .the("Apellido")
            .located(xpath("//*[@id=\"billing_last_name\"]"));


     public static final Target EMAIL = Target
            .the("Emali")
            .located(xpath("//*[@id=\"billing_email\"]"));


     public static final Target DIRECCION = Target
            .the("Direccion")
            .located(xpath("//*[@id=\"billing_address_1\"]"));

     public static final Target DEPARTAMENTO = Target
            .the("DEPARTAMENTO")
            .located(xpath("//*[@id=\"select2-billing_state-container\"]"));


     public static final Target MUNICIPIO = Target
            .the("Municipio")
            .located(xpath("//*[@id=\"select2-billing_city-container\"]"));

     public static final Target NUM_CELULAR = Target
            .the("Numero de celular")
            .located(xpath("//*[@id=\"billing_phone\"]"));


     public static final Target ACEPTO = Target
            .the("Acepto")
            .located(xpath("//*[@id=\"payment\"]/div/div/p/label/span[1]"));

     public static final Target FINALIZAR = Target
            .the("Finalizar")
            .located(xpath("//*[@id=\"place_order\"]"));

     public static final Target DEPRTAMENTOS= Target
            .the("DEPARTAMENTOS")
            .located(cssSelector("#select2-billing_state-results li"));

     public static final Target ESCRIBIR= Target
            .the("Escribir")
            .located(xpath("/html/body/span/span/span[1]/input"));

     public static final Target MUNICIPIOS= Target
            .the("Municipios")
            .located(xpath("//*[@id=\"select2-billing_city-results\"]"));

     public static final Target VALIDACION= Target
            .the("Validacion")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div/div[2]/div/p/strong"));


    }
