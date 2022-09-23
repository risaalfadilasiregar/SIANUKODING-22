package SinauKoding;

public class BelahKetupat implements HitungBangunDatar {
    private float sisi,diagonal1,diagonal2;
    public void keliling(float sisi) {
        this.sisi= sisi;
    }

    public void luas(float diagonal1, float diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public float keliling() {
        return 4*sisi;
    }

    @Override
    public float luas() {
        return (diagonal1 * diagonal2)/2;
    }
}
