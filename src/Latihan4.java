import java.util.Scanner;

 public static void main(String[] args) {
     Scanner input =  new Scanner (System.in);

     System.out.println("masukkan nilai: ");
     int inputnilai = input.nextInt();
     System.out.println("masukkan presentase kehadiran");
     int presentase = input.nextInt();

     String hasil = (inputnilai >= 75 && presentase > 80.0) ? "LULUS" : "tidak lulus";
     System.out.println(hasil);

     input.close();


}
