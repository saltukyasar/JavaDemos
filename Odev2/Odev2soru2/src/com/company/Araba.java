package com.company;

public class Araba {

    private static Araba arabaOrnek;

    private Araba(){}

    static {
        try {
            arabaOrnek = new Araba();
        }catch (Exception e){
            throw new RuntimeException("Exception occurs");
        }
    }

    public static Araba yarat(){
        return arabaOrnek;
    }

}
