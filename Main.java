import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World");
        int menu = 0;

        while (menu != 3) {

            System.out.println("============MENU============");
            System.out.println("1. Jajar Genjang");
            System.out.println("2. Belah Ketupat");
            System.out.println("3. Lingkaran");
            System.out.println("4. Keluar");

            System.out.print("Masukan pilihan menu : ");
            menu = input.nextInt();

            if (menu == 1) {
                jajargenjang();
            } else if (menu == 2) {
                belahketupat();
            } else if (menu == 3) {
                lingkaran();
            } else if (menu == 4){

            }
        }
    }

    public static void belahketupat() {
        int menuPersegi = 0;
        while(menuPersegi !=3){
            System.out.println("\n\n==============Menu Persegi============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuPersegi = input.nextInt();

            if (menuPersegi == 1) {
                System.out.print("Masukan sisi Diagonal1 : ");
                double diagonal1 = input.nextDouble();
                System.out.print("Masukan sisi Diagonal2 : ");
                double diagonal2 = input.nextDouble();
                System.out.println("Luas Belah Ketupat adalah : " + hitungLuasBelahketupat(diagonal1,diagonal2));
                System.out.println("\n");
            } else if (menuPersegi == 2) {
                System.out.print("Masukkan sisi Belah Ketupat : ");
                double sisi = input.nextDouble();
                System.out.println("Keliling Belah Ketupat Adalah : "+ hitungKelilingBelahketupat(sisi));
                System.out.println("\n");
            }

        }
    }
    public static double hitungLuasBelahketupat(double d1, double d2){
        return d1 * d2  / 2 ;
    }
    public static double hitungKelilingBelahketupat(double s){
        return 4 * s;
    }
    public static void jajargenjang() {
        int menuJajargenjang= 0;
        while(menuJajargenjang !=3){
            System.out.println("\n\n==============Menu Persegi Panjang============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuJajargenjang = input.nextInt();

            if (menuJajargenjang == 1) {
                System.out.print("Masukan sisi Alas : ");
                double alas = input.nextDouble();
                System.out.print("Masukan sisi Tinggi: ");
                double tinggi = input.nextDouble();
                System.out.println("Luas persegi adalah : " + hitungLuasJajargenjang(alas,tinggi));
                System.out.println("\n");
            } else if (menuJajargenjang == 2) {
                System.out.print("Masukkan sisi Alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukan sisi miring : ");
                double miring = input.nextDouble();
                System.out.println("Keliling Persegi Adalah : "+ hitungKelilingJajargenjang(alas,miring));
                System.out.println("\n");
            }

        }
    }
    public static double hitungLuasJajargenjang(double a , double t){
        return a * t ;
    }
    public static double hitungKelilingJajargenjang(double a, double m){
        return 2 * (a + m);
    }
    public static void lingkaran() {
        int menuLingkaran = 0;
        while(menuLingkaran !=3){
            System.out.println("\n\n==============Menu Persegi Panjang============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuLingkaran = input.nextInt();

            if (menuLingkaran == 1) {
                System.out.print("Masukan Jari-jari : ");
                double jari = input.nextDouble();
                System.out.println("Luas persegi adalah : " + hitungLuasLingkaran(jari));
                System.out.println("\n");
            } else if (menuLingkaran == 2) {
                System.out.print("Masukkan Jari-jari : ");
                double jari = input.nextDouble();
                System.out.println("Keliling Persegi Adalah : "+ hitungKelilingLingkaran(jari));
                System.out.println("\n");
            }

        }
    }
    public static double hitungLuasLingkaran(double r){
        return 3.14 * r * r ;
    }
    public static double hitungKelilingLingkaran(double r){
        return 2 * 3.14 * r ;
    }
}
