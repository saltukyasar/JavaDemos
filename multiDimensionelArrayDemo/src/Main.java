public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "isstanbıl";
        sehirler[0][1] = "bursa";
        sehirler[0][2] = "balıkesir";
        sehirler[1][0] = "denizli";
        sehirler[1][1] = "izmir";
        sehirler[1][2] = "aydın";
        sehirler[2][0] = "antalya";
        sehirler[2][1] = "mersin";
        sehirler[2][2] = "adana";

        for (int i = 0; i < 3; i++) {
            System.out.println("-----------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
