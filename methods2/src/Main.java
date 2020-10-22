public class Main {

    public static void main(String[] args) {
        String mesaj = "bugun hava cok guzel";
        String yeniMesaj = mesaj.substring(0, 3);
        System.out.println(yeniMesaj);
        int sayi=topla(12, 2);
        System.out.println(sayi);
        String kelime=sehirVer();
        System.out.println(kelime);
        int toplam=topla2(1,2,3,4,5,6);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void güncelle() {
        System.out.println("guncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int ...sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "ankaara";
    }
}

