package soru3_D;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void sırala(){
        ArrayList<Personel> emekciler = new ArrayList<>();
        emekciler.add(new Personel("saltuk","yasar","doktor"));
        emekciler.add(new Personel("salih","yasar","doktor"));
        emekciler.add(new Personel("gülsüm","yasar","doktor"));
        emekciler.add(new Personel("irem","yasar","doktor"));
        emekciler.add(new Personel("vilda","yasar","doktor"));
        emekciler.add(new Personel("betül","yasar","doktor"));
        emekciler.add(new Personel("fatih","yasar","doktor"));
        emekciler.add(new Personel("furkan","yasar","doktor"));
        emekciler.add(new Personel("mehmet","yasar","doktor"));
        emekciler.add(new Personel("fatma","yasar","doktor"));
        System.out.println("*");
        emekciler.add(new Personel("hamza","yasar","temizlikci"));
        emekciler.add(new Personel("ali","yasar","temizlikci"));
        emekciler.add(new Personel("buse","yasar","temizlikci"));
        emekciler.add(new Personel("özge","yasar","temizlikci"));
        System.out.println("*");
        emekciler.add(new Personel("eda","yasar","hemsire"));
        emekciler.add(new Personel("alpaslan","yasar","hemsire"));
        emekciler.add(new Personel("can","yasar","hemsire"));
        emekciler.add(new Personel("tuna","yasar","hemsire"));
        emekciler.add(new Personel("serdar","yasar","hemsire"));
        emekciler.add(new Personel("bünyamin","yasar","hemsire"));
        emekciler.add(new Personel("gürel","yasar","hemsire"));
        emekciler.add(new Personel("mustafa","yasar","hemsire"));
        emekciler.add(new Personel("ahmet","yasar","hemsire"));
        emekciler.add(new Personel("sultan","yasar","hemsire"));
        emekciler.add(new Personel("hatice","yasar","hemsire"));
        emekciler.add(new Personel("nazlı","yasar","hemsire"));
        emekciler.add(new Personel("emine","yasar","hemsire"));
        emekciler.add(new Personel("zeynep","yasar","hemsire"));
        emekciler.add(new Personel("dilara","yasar","hemsire"));
        emekciler.add(new Personel("ilayda","yasar","hemsire"));
        emekciler.add(new Personel("alara","yasar","hemsire"));
        emekciler.add(new Personel("emin","yasar","hemsire"));
        emekciler.add(new Personel("murat","yasar","hemsire"));
        emekciler.add(new Personel("yeliz","yasar","hemsire"));

        Collections.sort(emekciler);
        for (Personel personel:emekciler){
            System.out.println(personel.personelYaz());
        }

    }
    public static void main(String[] args){

        sırala();


    }
}
