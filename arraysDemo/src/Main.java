public class Main {

    public static void main(String[] args) {
        String ogrenci1="arif";
        String ogrenci2="meryem";
        String ogrenci3="furkan";
        String ogrenci4="salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="aybike";
        ogrenciler[1]="melike";
        ogrenciler[2]="hilal";
        ogrenciler[3]="vildan";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------");

        

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
