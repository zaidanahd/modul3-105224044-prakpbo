import java.util.Scanner;

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double saldoAwal = 500000.0;

    int menu = 1;

    System.out.println("simulasi menu ATM");
    do{
        System.out.println("1. cek saldo");
        System.out.println("2. setor tunai");
        System.out.println("3. tarik tunai");
        System.out.println("4. keluar");
        System.out.println(" masukan pilihan: ");
        menu = input.nextInt();

        if (menu == 4){
            break;
        }
        switch (menu){
            case 1:
                System.out.println("saldo sekarang: " + saldoAwal);
            case 2:
                System.out.println("masukan jumlah yang disetor: ");
                double setoran = input.nextDouble();
                saldoAwal += setoran ;
                System.out.println("sudah berhasil, saldo saat ini:" + saldoAwal);
            case 3:
                System.out.println("masukkan jumlah penarikan: ");
                double penarikan = input.nextDouble();
                if (penarikan >= 50000.0){
                    saldoAwal -= penarikan;
                    System.out.println("penarikan berhasil, saldo saat ini: " + saldoAwal);
                } else {
                    System.out.println("penarikan gagal, saldo minimal hanya Rp50.000");
                }
                break;
            default:
                break;
        } 
          
    }while (true);
    input.close();
 }