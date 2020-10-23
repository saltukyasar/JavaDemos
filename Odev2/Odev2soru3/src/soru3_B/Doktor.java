package soru3_B;

public class Doktor extends Personel {
    public Doktor(String isim,String soyisim){
        super(isim,soyisim);
    }

    @Override
    public void ekranayaz() {
        super.ekranayaz();
        System.out.println("//"+kadro+"//");
    }
}
