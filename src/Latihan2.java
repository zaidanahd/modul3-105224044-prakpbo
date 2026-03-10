import java.util.Scanner;

public class Latihan2 {
     public static void main(String[] args) {
     Scanner input =  new Scanner (System.in);
     int pinbenar = 123456, i = 0;

     System.out.println("masukkan PIN: ");
     int inputpin = input.nextInt();

     while(i < 4){
          if (inputpin == pinbenar ){
          System.out.println("pin benar ");
          break;
          }
          if(i == 3) {
          System.out.println("diblokir ");
          break;
          }
          i++;
          System.out.println(" PIN salah ");
          System.out.println("masukkan pin: ");
          inputpin = input.nextInt();
     }
     
      input.close();
     }


     }