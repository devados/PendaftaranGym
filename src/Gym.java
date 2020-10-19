
import java.util.Scanner;

abstract class tipe {
    public static void genderstatus() {
        System.out.println("Silahkan pilih gender/status anda");
        System.out.println("------------------------------");
        System.out.println("1. Pria");
        System.out.println("2. Wanita");
        System.out.println("3. Pelajar");

    }
}

class pria extends tipe{
    public static void genderstatus() {}
    public static void priaharga(){
        System.out.println("1. Pria Terpilih");
        System.out.println("Harga untuk 1 bulan: 240.000");
    }
}

class wanita extends tipe{
    public static void genderstatus() {}
    public static void wanitaharga(){
        System.out.println("2. Wanita Terpilih");
        System.out.println("Harga untuk 1 bulan: 200.000");
    }
}

class pelajar extends tipe{
    public static void genderstatus() {}
    public static void pelajarharga(){
        System.out.println("3. Pelajar Terpilih");
        System.out.println("Harga untuk 1 bulan: 180.000");
    }
}

public class Gym {
    static Fungsi sah = new Fungsi();
    public int harga;
    public static void main (String[] args) {
        int option, i, member, bulanan = 0;

        tipe.genderstatus();
            System.out.println("------------------------------");
            System.out.println("Ketik 0 untuk berhenti");
            System.out.println("------------------------------");

            System.out.print("Pilihan anda: ");
            Scanner in = new Scanner(System.in);
            option = in.nextInt();

            while (option != 1  && option != 2 && option != 3 && option != 0) {
            System.out.println("INPUT SALAH!!!");
            System.out.print("Masukkan angka yang sesuai:");
            option = in.nextInt();
        }

        for(i=0; i<1; i++) {
            if(option == 0) {
                return;
            }else if (option == 1) {
                pria.priaharga();
                bulanan = 240000;
            }else if (option == 2) {
                wanita.wanitaharga();
                bulanan = 200000;
            }else if (option == 3) {
                pelajar.pelajarharga();
                bulanan = 180000;
            }
        }



        System.out.println("------------------------------");
        System.out.println("Apakah anda tertarik dengan paket membership?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilihan anda: ");

        Scanner m = new Scanner(System.in);
        member = m.nextInt();

        while (member != 1 && member != 2) {
            System.out.println("INPUT SALAH!!!");
            System.out.print("Masukkan angka yang sesuai:");
            member = m.nextInt();
        }

        System.out.println("------------------------------");

        if(member == 1){
            sah.setHarga(sah.harga);
            if(option == 2){
                System.out.print("Harga setelah diskon wanita: ");
                sah.diskonWanita();
            }
            else if(option == 3){
                System.out.print("Harga setelah diskon pelajar: ");
                sah.diskonPelajar();
            }
            else{
                System.out.println("Harga sesuai yang tertulis");
            }

        }
        else{
            System.out.println("Ingin tambah durasi membership?");
            System.out.println("Ketik 1 untuk iya, Ketik 2 untuk tidak");
            System.out.print("Pilihan anda: ");

            Scanner p = new Scanner(System.in);
            int pilih = p.nextInt();

            while (pilih != 1 && pilih != 2) {
                System.out.println("INPUT SALAH!!!");
                System.out.print("Masukkan angka yang sesuai:");
                pilih = p.nextInt();
            }

            System.out.println("------------------------------");

            if(pilih==1)
            {

                    if(option == 1) {
                        System.out.print("Pria Terpilih,ketik 1 untuk melanjutkan: ");
                    }
                    else if(option == 2){
                        System.out.print("Wanita Terpilih,ketik 2 untuk melanjutkan: ");
                    }
                    else{
                        System.out.print("Pelajar Terpilih,ketik 3 untuk melanjutkan: ");
                    }

                    int z = p.nextInt();

                    while (z != option) {
                        System.out.println("INPUT SALAH!!!");
                        System.out.print("Masukkan angka yang sesuai:");
                        z = p.nextInt();
                    }

                while(pilih!=2)
                {
                        System.out.print("Masukkan jumlah bulan yang ingin ditambah: ");
                        int tambah = p.nextInt();
                        tambah = tambah+1;
                        System.out.println("------------------------------");
                        System.out.println("Harga menjadi "+bulanan*tambah+" untuk: "+tambah+ " bulan");

                    System.out.println("Apakah ingin mengulang penambahan bulan kembali?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak ");
                    System.out.print("Pilihan Anda: ");
                    pilih = p.nextInt();

                }
                System.out.println("------------------------------");
                System.out.println("Terima Kasih");
            }
            else{
                System.out.println("Biaya bulanan yang harus dibayar: "+bulanan);
            }
        }
    }
}
