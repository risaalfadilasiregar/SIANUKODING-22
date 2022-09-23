package SinauKoding;

public class Lingkaran  implements HitungBangunDatar{
    private float x;

    public Lingkaran(float x){
        this.x = x;
    }
    @Override
    public float keliling() {
        return (float) (2 * 3.14 * x);
    }

    @Override
    public float luas() {
        return (float) (3.14* x * x);
    }
}
