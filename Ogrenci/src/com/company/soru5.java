package com.company;

import java.util.Scanner;

public class soru5 {

    public static int ReservedNumbersofmin() {
        Scanner value1 =new Scanner(System.in);
        System.out.println("kaç yerin bileti alındı:");
        int numbersmin=value1.nextInt();
        return numbersmin;

    }
    public static int cameNumbersMin(){
        Scanner value2=new Scanner(System.in);
        System.out.println("gelicek olan minibüs sayısı:");
        int camemin=value2.nextInt();
        return camemin;
    }

    public static int cameNumberscar() {
        Scanner value3=new Scanner(System.in);
        System.out.println("gelicek olan araba sayisi : ");
        int camecar=value3.nextInt();
        return camecar;
    }
    public static int numbersmin=ReservedNumbersofmin();
    public static int camemin=cameNumbersMin();
    public static int camecar=cameNumberscar();
}

public static void main (String[] args){

}
