import java.util.Scanner;

public class THTM3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int stokVIP = 5;
        int stokFestival = 25;
        int stokTribune = 35;

        int hargaVIP = 1500000;
        int hargaFestival = 800000;
        int hargaTribune = 500000;

        while (true) {

            System.out.println("\n=== KIOSK TIKET SOUND FEST 2026 ===");
            System.out.println("Sisa Stok Tiket:");
            System.out.println("VIP : " + stokVIP);
            System.out.println("Festival : " + stokFestival);
            System.out.println("Tribune : " + stokTribune);

            System.out.println("\nMenu:");
            System.out.println("1. VIP");
            System.out.println("2. Festival");
            System.out.println("3. Tribune");
            System.out.println("4. Matikan Mesin");

            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Mesin dimatikan.");
                break;
            }

            int harga = 0;
            int stok = 0;
            int minimalUsia = 0;
            String kategori = "";

            if (pilihan == 1) {
                harga = hargaVIP;
                stok = stokVIP;
                minimalUsia = 18;
                kategori = "VIP";
            } else if (pilihan == 2) {
                harga = hargaFestival;
                stok = stokFestival;
                minimalUsia = 15;
                kategori = "Festival";
            } else if (pilihan == 3) {
                harga = hargaTribune;
                stok = stokTribune; 
                minimalUsia = 0;
                kategori = "Tribune";
            } else {
                System.out.println("Menu tidak tersedia.");
                continue;
            }

            System.out.print("Jumlah tiket yang ingin dibeli: ");
            int jumlah = input.nextInt();

            if (jumlah > stok) {
                System.out.println("Stok tidak mencukupi!");
                continue;
            }

            int totalBayar = 0;
            int tiketBerhasil = 0;
            boolean batal = false;

            for (int i = 1; i <= jumlah; i++) {

                System.out.print("Masukkan usia untuk tiket ke-" + i + ": ");
                int usia = input.nextInt();

                if (usia == -1) {
                    System.out.println("Pembelian dibatalkan!");
                    batal = true;
                    break;
                }

                while (usia <= 0 || usia > 120) {
                    System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                    usia = input.nextInt();
                }

                if (usia >= minimalUsia) {
                    System.out.println("Tiket ke-" + i + " berhasil diproses.");
                    tiketBerhasil++;
                    totalBayar += harga;

                    if (pilihan == 1) stokVIP--;
                    if (pilihan == 2) stokFestival--;
                    if (pilihan == 3) stokTribune--;

                } else {
                    System.out.println("Tiket ke-" + i + " gagal. Usia tidak memenuhi syarat.");
                }
            }

            if (!batal) {
                System.out.println("\n===== NOTA PEMBELIAN =====");
                System.out.println("Kategori tiket : " + kategori);
                System.out.println("Tiket berhasil : " + tiketBerhasil);
                System.out.println("Total bayar : Rp " + totalBayar);
            }
        }

        input.close();
    }
}