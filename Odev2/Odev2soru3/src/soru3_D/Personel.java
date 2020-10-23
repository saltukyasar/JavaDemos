package soru3_D;

public class Personel implements Comparable<Personel> {
    String isim;
    String soyisim;
    String kadro;

    public Personel(String isim,String soyisim){

    }
    public Personel(String isim ,String soyisim ,String kadro){
        this.isim=isim;
        this.soyisim=soyisim;
        this.kadro=kadro;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getKadro() {
        return kadro;
    }

    public void setKadro(String kadro) {
        this.kadro = kadro;
    }
    public String personelYaz(){
        return "Emekcinin ismi "+this.isim+" Emekcinin soyismi "+this.soyisim+" Emekcinin kadrosu "+this.kadro;
    }

    @Override
    public int compareTo(Personel o) {
        return (this.isim).compareTo(o.getIsim());
    }
}
