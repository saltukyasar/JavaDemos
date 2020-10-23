package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> hayvanlar =new ArrayList<>();

        Kus kus = new Kus();
        Zebra zebra = new Zebra();
        Koala koala = new Koala();

        hayvanlar.add(kus);
        hayvanlar.add(zebra);
        hayvanlar.add(koala);
        System.out.println(kus.number + " adet kuş , " +zebra.number + " adet zebra ve "+koala.number+" adet koala bulunduran hayvanat bahçesi");

        HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi(10,4,8);
        hayvanatBahcesi.sesCikart();
    }
}
