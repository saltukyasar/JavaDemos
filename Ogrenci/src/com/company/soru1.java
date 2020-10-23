package com.company;

public class soru1 {
// soru 1 A)
    /* For döngüsü kullanarak

a) bir String dizinin tüm elemanlarını ekrana yazınız.

     */
    public static void main(String[] args) {

        String[] adSoyad= new String[]{"Muhammed Saltuk Yaşar"};


        String[] array = new String[] {"saltuk","fatih","mehmet","hasan"};
        for (int i=0;i<array.length;i++)
        {
            System.out.println("dizinin elemanlari " + array[i]);
        }

// soru 1 B)
        /*
        For döngüsü kullanarak
        b) bir double matrisinin elemanlarını ekrana yazınız.
         */

        double [][] sayilar = new double[][]{{1.1,1.2,1.3},{2.1,2.2,2.3},{3.1,3.2,3.3}};
        System.out.println();
        for(int i=0;i<sayilar.length;i++)
        {
            for(int j=0;j<sayilar.length;j++)
            {
                System.out.println("dizinin elemanlari " + sayilar[i][j]);
            }
        }
//soru 1 ikinci bolum A)
/*
While döngüsü kullanarak

a) bir String dizinin 5. elemanına kadar olan değerleri ekrana yazınız.
 */
        String[] array2 = new String[]{"I","S","T","A","N","B","U","L"};
        int i=0;
        System.out.println();
        while ( i<5)
        {
            System.out.println("dizinin 5. indise kadar elemanlari " + array2[i]);
            i++;
        }
//soru 2 ikinci bolum B)
        /*
        While döngüsü kullanarak

        b) bir double dizisinin ilk 4 elemanının toplamını ekrana yazınız.
         */

        double[] numbers = new double[]{1.0,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
        double sonuc=0.0;
        int k=0;
        while (k<4)
        {
            sonuc += numbers[k];
            k++;
        }
        System.out.println();
        System.out.println("ilk dort elemanin toplami " + sonuc);




    }

}
