import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException; 

public class Main {
    public static ArrayList<karyawan> daftarKaryawan = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        tampilanUtama();
    }
    public static void tampilanUtama(){
        char pilihan;
        do {
            System.out.println("\nData karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");

            System.out.print("Pilih opsi (a-c): ");
            pilihan = input.next().charAt(0);

            switch (pilihan) {
                case 'a':
                    tambahDataKaryawan();
                    break;
                case 'b':
                    tampilkanDataKaryawan();
                    break;
                case 'c':
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid!");
            }
        } while (pilihan != 'c');
    }

    public static void tambahDataKaryawan(){
        try{
            System.out.println("\nTambah Data Karyawan");
            System.out.print("Masukkan nama : ");
            input.nextLine();
            String nama = input.nextLine();
            
            System.out.print("Masukkan umur : ");
            int umur = input.nextInt();
            input.nextLine();

            System.out.println("Pengalaman sebelumnya : ");
            System.out.println("1. Freelancer");
            System.out.println("2. Magang");
            System.out.println("3. Pekerja Tetap");
            System.out.println("4. Tidak ada");
            System.out.print("Input: ");
            int pengalaman = input.nextInt();
            input.nextLine();
            if(pengalaman == 4){
                System.out.println("Ketua Osis");
            }else{ 
            }

            // input.nextLine();
            System.out.print("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            String pendidikan = input.nextLine();

            System.out.println("Projek IT: ");
            System.out.println("1. Minimal 4");
            System.out.println("2. Minimal 8");
            System.out.println("3. Minimal 12");
            System.out.println("4. Lebih dari 15");
            System.out.print("Input: ");
            int projek = input.nextInt();

            input.nextLine();
            System.out.print("Status saya di keluarga : ");
            String anak = input.nextLine();

            karyawan karyawan = new karyawan(anak, nama, umur);
            pendidikan pendidikan1 = new pendidikan(pendidikan);
            
            if(pendidikan.equalsIgnoreCase("SD") || pendidikan.equalsIgnoreCase("SMP") || projek == 1 || umur < 18){
                System.out.println("Karyawan tidak memenuhi syarat");
                Audio.playAudioLose("typical.wav");
            }else{
                System.out.println("Pengalaman sedang diproses");
                daftarKaryawan.add(karyawan);
                pendidikan1.pendidikanKaryawan();
                System.out.println("===============================");
                System.out.println("Selamat, karyawan diterima");
                System.out.println("===============================");
                Audio.playAudio("cinematic.wav");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa integer");
            input.nextLine(); }
        }
    

    public static void tampilkanDataKaryawan(){
        if(daftarKaryawan.isEmpty()){
            System.out.println("Belum ada data karyawan");
            return;
        }

        for(karyawan karyawan : daftarKaryawan){
            System.out.println(karyawan.getName());
            karyawan.display();
        }
    } 
} 
