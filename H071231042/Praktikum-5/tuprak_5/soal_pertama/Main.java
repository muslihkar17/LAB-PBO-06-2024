package soal_pertama;
import java.util.*;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    BangunDatar bd = new BangunDatar();
    BangunRuang br;
    public static void main(String[] args) {
        printBarriers();
        runApp();
        printBarriers();
    }

    public static void runApp(){
        System.out.println("=========BANGUN RUANG=======");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("\n=========BANGUN DATAR=======");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        //MENGINPUT PILIHAN MENU
        printBarriers();
        System.out.print("Masukkan Pilihan anda: ");
        int opsi = 0;
        try {
            opsi = scan.nextInt();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println(e + "Diluar Pilihan yang tersedia");
        }
        printBarriers();
        switch (opsi){
            case 1:
                System.out.print("masukkan sisi kubus: ");
                int sisi = scan.nextInt();
                Kubus kubus = new Kubus(sisi);
                kubus.showKubus();
                break;
            case 2:
                System.out.print("panjang balok: ");
                int panjang = scan.nextInt();
                System.out.print("lebar balok: ");
                int lebar = scan.nextInt();
                System.out.print("tinggi balok: ");
                int tinggi = scan.nextInt();
                Balok balok = new Balok(panjang, lebar, tinggi);
                balok.showBalok();
                break;
            case 3:
                System.out.print("jari-jari bola: ");
                double jariJari = scan.nextDouble();
                Bola bola = new Bola(jariJari);
                bola.showBola();
                break;
            case 4:
                System.out.print("jari-jari tabung: ");
                double jariJariTabung = scan.nextDouble();
                System.out.print("tinggi tabung: ");
                int tinggiTabung = scan.nextInt();
                Tabung tabung = new Tabung(tinggiTabung, jariJariTabung);
                tabung.showTabung();
                break;
            case 5:
                System.out.print("sisi persegi: ");
                int sisiPersegi = scan.nextInt();
                Persegi persegi = new Persegi(sisiPersegi);
                persegi.showPersegi();
                break;
            case 6:
                System.out.print("panjang persegi: ");
                int panjangpersegi = scan.nextInt();
                System.out.print("lebar persegi: ");
                int lebarpersegi = scan.nextInt();
                PersegiPanjang pp = new PersegiPanjang(panjangpersegi, lebarpersegi);
                pp.showPersegiPanjang();
                break;
            case 7:
                System.out.print("jari-jari lingkaran: ");
                double r = scan.nextDouble();
                Lingkaran lingkaran = new Lingkaran(r);
                lingkaran.showLingkaran();
                break;
            case 8:
                System.out.print("sisi 1 trapesium: ");
                int sisi1 = scan.nextInt();
                System.out.print("sisi 2 trapesium: ");
                int sisi2 = scan.nextInt();
                System.out.print("sisi 3 trapesium: ");
                int sisi3 = scan.nextInt();
                System.out.print("sisi 4 trapesium: ");
                int sisi4 = scan.nextInt();
                System.out.print("tinggi trapesium: ");
                int tinggitrapesium = scan.nextInt();
                Trapesium trap = new Trapesium(tinggitrapesium, sisi1, sisi2, sisi3, sisi4);
                trap.showTrapesium();
                break;
        }
        scan.close();
    }

    public static void printBarriers() {
        System.out.println("--------------------------------------------------------");
    }
}