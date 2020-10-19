import java.util.Scanner;

public class Fungsi
{

    Scanner in = new Scanner(System.in);
    int harga;

    Gym bin = new Gym();

    public int setHarga(int harga) {
        System.out.println("Pilih Tipe Membership: ");
        System.out.println("1. Copper = 2 bulan sekaligus");
        System.out.println("2. Silver = 6 bulan sekaligus");
        System.out.println("3. Gold = 12 bulan sekaligus");
        System.out.print("Pilihan Anda: ");

        int pilih = in.nextInt();

        if(pilih==1)
        {
            System.out.println("Copper");
            System.out.println("Harga untuk 2 bulan: 450.000");
            harga += 450.000;
        }
        else if(pilih == 2)
        {
            System.out.println("Silver");
            System.out.println("Harga untuk 6 bulan: 1.260.000");
            harga += 1260000;
        }
        else if(pilih == 3)
        {
            System.out.println("Gold");
            System.out.println("Harga untuk 12 bulan: 2.400.000");
            harga += 2400000;
        }
        System.out.println("------------------------------");
        this.harga = harga;
        return harga;
    }

    public void diskonWanita()
    {
        bin.harga -= (harga*-0.8);
        System.out.println(bin.harga);
    }
    public void diskonPelajar()
    {
        bin.harga -= (harga*-0.7);
        System.out.println(bin.harga);
    }
}