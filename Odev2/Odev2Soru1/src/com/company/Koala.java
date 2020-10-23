package com.company;

        import java.util.Scanner;

public class Koala {
    public int number;

    public Koala(){
        System.out.println("koala sayisini giriniz:");
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();
        System.out.println("koala sayisi "+ number);
    }
}
