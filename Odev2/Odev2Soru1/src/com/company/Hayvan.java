package com.company;

import java.util.Scanner;

public class Hayvan {
    public String hayvanIsmi;
    public int number;
    public String ses;

    public Hayvan(){
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        System.out.println(" sayisi "+ number);
    }
}
