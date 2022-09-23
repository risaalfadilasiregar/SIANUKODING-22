package SinauKoding;

public class Jajargenjang implements HitungBangunDatar{
    private float alas, tinggi,sisiMiring;

    public void keliling(float alas, float sisiMiring){
        this.alas = alas;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public float keliling() {
        return 2* (alas + sisiMiring);
    }

    @Override
    public float luas() {
        return alas * tinggi;
    }

    public void luas(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

}
