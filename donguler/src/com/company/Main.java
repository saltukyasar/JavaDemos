package com.company;

import java.util.Scanner;

public class Main {
    public static void faktoriyel ()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi griniz:");
        int sayi = scan.nextInt();
        int facto=1;

        while ( sayi>0 )
        {
            facto*=sayi;
            sayi--;

        }
        System.out.println("faktoriyeli : " + facto );

    }
    public static void main(String[] args) {
        faktoriyel();


       }
}
