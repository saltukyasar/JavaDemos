package com.company;

import java.util.ArrayList;

public class Otopark {
    public static int Parkyeri[]=new int [20];
    public static ArrayList<Integer> refOtobüs=new ArrayList<>();
    public static ArrayList<Integer> refAraba=new ArrayList<>();
    public static int fulledbus=0;
    public static int fulledcar=0;
    public static int enfazla=20;
    public static int muchbus=0;
    public static int muchcar=0;

    public static void dizidizi(){
        for (int i=0; i<soru5.numbersmin;i++){
            refOtobüs.add(i);
            refAraba.add(i);
        }
        public static void situationpark(){
            String wehicleexpedition="";
            for (int i=0;i<enfazla;i++){
                if(i<soru5.numbersmin)
                    wehicleexpedition="otobus";
                else
                    wehicleexpedition="araba";
                if (situationpark[i]==0)
                    System.out.println(wehicleexpedition+(i)+"index"+"emptty");
                else
                    System.out.println(wehicleexpedition+(i)+"indis"+"filled");
            }
        }


    }

}
