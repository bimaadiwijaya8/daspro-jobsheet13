import java.util.Scanner;

public class Tugas {

    static String[][] data = new String [28][5];
    static int jumlah = 0;

    public static void tambahKRS() {
        
        Scanner input = new Scanner(System.in);

        String tambah = "y";
        int total = 0, sks = 0;

        System.out.print("Masukkan nim: ");
        String nim = input.next();

        System.out.print("Masukkan nama: ");
        String nama = input.next();

        while (true) {
            System.out.print("Kode Mata Kuliah: ");
            String kode = input.next();

            System.out.print("Nama Mata Kuliah: ");
            String matkul = input.next();

            while (true) {
                System.out.print("Jumlah SKS (1-3): ");
                sks = input.nextInt();

                if (sks < 1 || sks > 3) {
                    System.out.println("Jumlah SKS tidak valid! SKS harus antara 1 dan 3.");
                } else {
                    break;
                }
            }

            if (total + sks > 24) {
                System.out.println("Total SKS tidak boleh lebih dari 24.");
                continue;
            }

            data[jumlah][0] = nim;       
            data[jumlah][1] = nama;    
            data[jumlah][2] = kode;    
            data[jumlah][3] = matkul;    
            data[jumlah][4] = String.valueOf(sks); 
            jumlah++; 
            total += sks;

            System.out.println("Data mata kuliah berhasil ditambahkan.");

            System.out.print("Tambah mata kuliah lain? (y/t): ");
            tambah = input.next();
            if (tambah.equalsIgnoreCase("t")) {
                break;
            }
        }

        System.out.println("Total SKS yang diambil: " + total);
    }

    public static void tampilKRS() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan NIM: ");
        String nim = input.next();

        int totalSKS = 0;
        boolean found = false;

        System.out.println("\nDaftar KRS untuk NIM: " + nim);
        System.out.println("===========================================");
        System.out.println("Kode Mata Kuliah | Nama Mata Kuliah | SKS");
        System.out.println("===========================================");

        for (int i = 0; i < jumlah; i++) {
            if (data[i][0].equals(nim)) { 
                System.out.printf(data[i][2], data[i][3], data[i][4]); 
                totalSKS += Integer.parseInt(data[i][4]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Data KRS tidak ditemukan untuk NIM tersebut.");
        } else {
            System.out.println("===========================================");
            System.out.println("Total SKS: " + totalSKS);
        }
    }

    public static void analisisKRS(){
        System.out.println("Jumlah mahasiswa yang mengambil SKS kurang dari 20: 0");
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
                tampilKRS();
                System.out.println();
                break;

            case 3:
                System.out.println();
                analisisKRS();
                System.out.println();
                break;

            default:
                System.out.println("Terima kasih!");
                break;
        }
        }
    }
}