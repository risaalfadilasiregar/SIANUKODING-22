package SinauKoding;
import java.util.Scanner;


public class Tugas3 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("<=============================================>");
                System.out.println("<===========Tugas 3 Sinau Koding 22===========>");
                System.out.println("|=============================================|");
                System.out.println("|===Menghitung Luas & Keliling Bangun Datar===|");
                System.out.println("|=============================================|");
                System.out.println("1. Jajar Genjang");
                System.out.println("3. Belah Ketupat");
                System.out.println("4. Lingkaran");
                System.out.println("5. Exit");
                System.out.println("|=============================================|");
                System.out.println("| Masukkan Pilihan : ");
                int object = scan.nextInt();
                selectObject bd = new selectObject();
                bd.select(object);
            }
        }
    }

    class selectObject {
        void select(int x) {
            if (x == 5) {
                System.exit(0);
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("|---------------------------------------------|");
            System.out.println("|Pilih perhitungan Object : ");
            System.out.println("|   1. Keliling");
            System.out.println("|   2. Luas");
            System.out.println("|---------------------------------------------|");
            System.out.print("| Masukkan  pilihan : ");
            int selectPerhitungan = scan.nextInt();

            switch (x) {
                case 1:
                    Jajargenjang jajargenjang = new Jajargenjang();
                    switch (selectPerhitungan) {
                        case 1:
                            System.out.print("| Masukkan  sisi miring Jajar Genjang(cm) : ");
                            float sisi1 = scan.nextFloat();
                            System.out.print("| Masukkan sisi alas Layang-layang (cm) : ");
                            float sisi2 = scan.nextFloat();
                            jajargenjang.keliling(sisi1, sisi2);
                            System.out.println(jajargenjang.keliling() + "| Keliling Jajar Genjang");
                            System.out.println("|---------------------------------------------|");
                            break;
                        case 2:
                            System.out.print("| Masukkan sisi alas Jajar genajng (cm) : ");
                            float diagonal1 = scan.nextFloat();
                            System.out.print("| Masukkan tinggi jajargenjang(cm) : ");
                            float diagonal2 = scan.nextFloat();
                            jajargenjang.luas(diagonal1, diagonal2);
                            System.out.println(jajargenjang.luas() + "| Luas Jajar Genjang");
                            System.out.println("|---------------------------------------------|");
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;

                case 2:
                    BelahKetupat belahketupat = new BelahKetupat();
                    switch (selectPerhitungan) {
                        case 1:
                            System.out.print("| Masukkan sisi Belah Ketupat (cm) : ");
                            float sisi1 = scan.nextFloat();
                            belahketupat.keliling(sisi1);
                            System.out.println(belahketupat.keliling() + "| Keliling Belah Ketupat ");
                            System.out.println("|---------------------------------------------|");
                            break;
                        case 2:
                            System.out.print("| Masukkan diagonal1 Belah Ketupat (cm) : ");
                            float diagonal1 = scan.nextFloat();
                            System.out.print("| Masukkan diagonal2 Belah Ketupat (cm) : ");
                            float diagonal2 = scan.nextFloat();
                            belahketupat.luas(diagonal1, diagonal2);
                            System.out.println(belahketupat.luas() + "| Luas Belah Ketupat ");
                            System.out.println("|---------------------------------------------|");
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("| Masukkan jari-jari Lingkaran (cm) : ");
                    float jari = scan.nextFloat();
                    Lingkaran lingkaran = new Lingkaran(jari);
                    switch (selectPerhitungan) {
                        case 1:
                            System.out.println( lingkaran.keliling() + "|Keliling Lingkaran  ");
                            System.out.println("|---------------------------------------------|");
                            break;
                        case 2:
                            System.out.println( lingkaran.luas() + "| Luas Lingkaran  ");
                            System.out.println("|---------------------------------------------|");
                            break;
                        default:
                            System.out.println("Invalid Input");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }
    }


