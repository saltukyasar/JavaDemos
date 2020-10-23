package soru3_B;

public class Temizlikci extends Personel {
    public Temizlikci(String isim,String soyisim){
        super(isim,soyisim);
    }

    @Override
    public void ekranayaz() {
        super.ekranayaz();
        System.out.println("//"+kadro+"//");
    }
}
