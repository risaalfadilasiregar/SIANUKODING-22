package Tugas4;

public class DataSiswa {
    String nama;
    int umur;
    int nim;
    int nilaiUjian;

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public int getumur() {
        return umur;
    }

    public void setumur(int umur) {
        this.umur = umur;
    }

    public int getnim() {
        return nim;
    }

    public void setnim(int nim) {
        this.nim = nim;
    }

    public int getnilaiUjianAkhirSemester() {
        return nilaiUjian;
    }

    public void setnilaiUjianAkhirSemester(int nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }
}
