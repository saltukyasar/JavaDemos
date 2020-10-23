package com.company;

import java.util.Scanner;

public class Zebra {

    public int number;

    public Zebra(){
        System.out.println("zebra sayisini giriniz:");
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        System.out.println("zebra sayisi "+ number);
    }
}
