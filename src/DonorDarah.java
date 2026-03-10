import java.util.Scanner;

public class DonorDarah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM SELEKSI DONOR DARAH ===");
        
        System.out.print("Masukkan Usia (tahun): ");
        int usia = input.nextInt();
       
        System.out.print("Masukkan Berat Badan: ");
            double beratBadan = input.nextDouble();

        System.out.print("Masukkan Kadar Hemoglobin (g/dL): ");
                double hb = input.nextDouble();
        if (usia >= 17 && usia <= 60) {

            if (beratBadan >= 30) {

                if (hb >= 10.5 && hb <= 18.0) {

                    System.out.println("\nMemenuhi kriteria pendonor darah.");
                } else {
                    System.out.println("\nDitolak: Karena kadar hemoglobin tidak normal (Normal: 10.5 - 18.0 g/dL).");
                }

            } else {
                System.out.println("\nDitolak: Berat badan minimal 30 kg.");
            }

        } else {
            System.out.println("\nDitolak: Usia harus di rentang 17 - 60 tahun.");
        }

        input.close();
    }
}