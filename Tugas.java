import java.util.Scanner;

public class Tugas {
    public static void tambahKRS() {
        Scanner input = new Scanner(System.in);

        String tambah = "y";
        int total = 0, sks = 0;

        System.out.print("Masukkan nim: ");
        int nim = input.nextInt();

        System.out.print("Masukkan nama: ");
        String nama = input.next();

        while (true) {
            while (true) {
            System.out.print("Kode Mata Kuliah: ");
            String kode = input.next();

            System.out.print("Nama Mata Kuliah: ");
            String matkul = input.next();

                System.out.print("Jumlah SKS (1-3): ");
                sks = input.nextInt();

                if (sks < 1 || sks > 3) {
                    System.out.println("Jumlah SKS tidak valid! SKS harus antara 1 dan 3");
                    continue;
                } else {
                    break;
                }
            }

            if (total + sks > 24) {
                System.out.println("SKS tidak boleh lebih dari 24, Masukkan kembali!");
                continue;
            } else if (total + sks == 24){
                total += sks;
                System.out.println("SKS sudah mencapai maksimal!");
                break;
            } else {
                total += sks;
            }

            System.out.println("Data mata kuliah berhasil ditambahkan.");

            while (true) {
                System.out.println("Tambah mata kuliah lain? (y/t): ");
                tambah = input.next();
                if (!tambah.equalsIgnoreCase("y") && !tambah.equalsIgnoreCase("t")) {
                    System.out.println("Maaf, masukkan kembali yang benar!");
                    continue;
                } else {
                    break;
                }
            }
            
            if (tambah.equalsIgnoreCase("t")) {
                break;
            }

        }
        System.out.println("Total SKS yang diambil: " + total);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu = 0;

        while (menu != 4){
        System.out.println("== Sistem Pemantauan KRS Mahasiswa ==");
        System.out.println("1. Tambah Data KRS");
        System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
        System.out.println("3. Analisis Data KRS");
        System.out.println("4. Keluar");
        System.out.println();
        System.out.print("Pilih menu: ");
        
        while (true){
            menu = input.nextInt();
            if (menu == 1 || menu == 2 || menu == 3 || menu == 4){
                break;
            } else {
                System.out.println("Input tidak valid, masukkan ulang! ");
                continue;
            }
        }

        switch (menu){
            case 1:
                System.out.println();
                tambahKRS();
                System.out.println();
                break;
        
            case 2:
                System.out.println();
                System.out.println();
                break;

            case 3:
                System.out.println();
                System.out.println();
                break;

            default:
                System.out.println("Terima kasih!");
                break;
        }
        }
    }
}