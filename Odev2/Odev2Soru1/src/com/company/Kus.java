package com.company;

import java.util.Scanner;

public class Kus {
    public int number;

    public Kus(){
        System.out.println("kus sayisini giriniz:");
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        System.out.println("kus sayisi "+ number);
    }
}
