package soru3_B;

public class Hemsire extends Personel {
    public Hemsire(String isim,String soyisim){
        super(isim,soyisim);
    }

    @Override
    public void ekranayaz() {
        super.ekranayaz();
        System.out.println("//"+ kadro +"//");
    }
}
