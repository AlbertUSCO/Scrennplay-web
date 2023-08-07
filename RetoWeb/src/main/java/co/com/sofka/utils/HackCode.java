package co.com.sofka.utils;

public enum HackCode {

    ACTOR("Samuel"),
    CARRO_OK("Recuerda"),
    VALIDACION("Gracias. Tu pedido ha sido recibido."),

    HUILA("Huila"),
    NEIVA("Neiva - 410005")

    ;
    private final String values;

    HackCode(String values){
        this.values=values;
    }
    public String getValues(){
        return values;
    }

}
