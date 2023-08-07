package co.com.sofka.utils;

public enum Numeros {

    COUNT(3),
    TIME(12),

    FN_COUNT(0);

    private final int values;

    Numeros(int values){
        this.values=values;
    }
    public int getValues(){
        return values;
    }

}
