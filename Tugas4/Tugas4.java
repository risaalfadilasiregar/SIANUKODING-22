package Tugas4;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        ArrayList<DataSiswa> data = new ArrayList<>();
        System.out.println("silahkan masukan input jumlah siswa");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int j = 0; j < x; j++) {
            DataSiswa siswa = new DataSiswa();
            System.out.println("masukan nama siswa :");
            siswa.setnama(input.next());
            System.out.println("masukan umur siswa :");
            siswa.setumur(input.nextInt());
            System.out.println("masukan nim siswa :");
            siswa.setnim(input.nextInt());
            System.out.println("masukan nilai ujian akhir semester siswa :");
            siswa.setnilaiUjianAkhirSemester(input.nextInt());

            System.out.println("========================");

            data.add(siswa);
        }

        int no = 1;
        System.out.println("============== Daftar siswa ============");
        for (DataSiswa dt : data) {
            System.out.println("Data SISWA :" + no);
            System.out.println("Nama Siswa:" + dt.getnama());
            System.out.println("Umur Siswa:" + dt.getumur());
            System.out.println("Nim Siswa :" + dt.getnim());
            System.out.println("Nilai akhir semester :" + dt.getnilaiUjianAkhirSemester());

            if (dt.getnilaiUjianAkhirSemester() < 70) {
                System.out.println(dt.getnama() + " Dinyatakan tidak lulus");

            } else if (dt.getnilaiUjianAkhirSemester() <= 100) {
                System.out.println(dt.getnama() + " Dinyatakan lulus");

            } else {
                System.out.println(dt.getnama() + " Melebihi Batas");

            }
            System.out.println("--------------------------");

            no++;
        }
        System.out.println("===========================");

    }

}
