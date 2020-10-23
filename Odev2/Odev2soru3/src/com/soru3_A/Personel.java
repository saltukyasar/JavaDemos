package com.soru3_A;

public class Personel {
    String isim ;
    String soyisim;
    String kadro;
    public Personel(String isim,String soyisim){
        this.isim=isim;
        this.soyisim=soyisim;
    }
    public Personel(String isim,String soyisim,String kadro){
        this.isim=isim;
        this.soyisim=soyisim;
        this.kadro=kadro;
    }
    public void ekranayaz(){
        System.out.println("Emekcinin İsmi ve Soyismi : "+ isim +" " +soyisim);
    }
    public void ekranayazWithoutOverride(){
        System.out.println("İsmi , Soyismi ve alanı "+isim+" "+soyisim+" "+kadro);
    }
}
