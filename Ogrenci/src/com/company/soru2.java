package com.company;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        String[] adSoyad= new String[]{"Muhammed Saltuk Yaşar"};

        /*
        SORU 2: For döngüsü kullanarak bir integer matrisinin elemanlarını tek satırlar için 1 çift sayıya
        karşılık gelen satırlar için -1 yapan fonksiyonu yazınız. Bu matrisin tüm elemanlarını (değerleri)
        bulundukları satır ve sütün ile birlikte ekrana yazan fonksiyonu yazınız.
         */
        System.out.println();
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("matrisin satır sayisini giriniz :");
        x=scan.nextInt();
        System.out.println("matrisin sütun sayisini giriniz :");
        y=scan.nextInt();
        int array[][] = new int[x][y];

        for (int i=0;i<x;i++){

            if (i%2 ==0){
                for (int j=0;j<y;j++)
                {
                    array[i][j]=1;
                }
            }
            else
                {
                    for (int j=0;j<y;j++)
                    {
                        array[i][j]=-1;
                    }
                }
        }
        for (int a=0;a<x;a++)
        {
            for(int b=0;b<y;b++)
            {
                System.out.println((a+1)+","+(b+1)+" matrisinin degeri "+array[a][b]);

            }
            System.out.println();
        }






    }
}
