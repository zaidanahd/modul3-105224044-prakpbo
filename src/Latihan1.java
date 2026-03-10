import java.util.Scanner;

public class Latihan1 {
     public static void main(String[] args) {
     Scanner input =  new Scanner (System.in);

     System.out.println("masukkan angka pertama: ");
     double a = input.nextDouble();
     System.out.println("masukkan angka kedua: ");
     double b = input.nextDouble();
     System.out.println("masukkan karakter operator(+,-,x,/): ");
     char operator = input.next().charAt(0);

    switch (operator){
        case '+':
        System.out.println("hasil penjumlahan: " + (a+b));
        break;
        case '-':
        System.out.println("hasil pengurangan: " + (a-b));
        break;
        case 'x':
        System.out.println("hasil perkalian: " + (a*b));
        break;
        case '/':
        System.out.println("hasil pembagian: " + (a/b));
        break;

        default:
            System.out.println("tidak valid");
    }
    input.close();

     
     }
}     