import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //1

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int sum = 0 ;
//
//        for(int i = 1 ; i <=n ; i++){
//            sum+=i ;
//        }
//        System.out.println(sum/n);

        //2

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        for(int i = 0 ; i<=n ; i++){
//
//            int x = (int) Math.pow(2 , i);
//
//
//            if(x*2 <= n ) {
//            continue;
//            }
//
//            else {
//                System.out.print(x + " ");
//
//                n = n-x ;
//
//                i=-1;
//                if(n==0){
//                    break;
//                }
//            }
//        }

        //3

//        for (int i = 1 ; i <=15 ; i+=2){
//            if(i == 5 || i == 7 || i == 11 ){
//                continue;
//            }
//            else {
//                System.out.print(i + " ");
//            }
//        }

        //4

//        Scanner scanner = new Scanner(System.in) ;
//
//        String binary = scanner.nextLine();
//
//        int decimal = 0 ;
//
//        int length = binary.length() ;
//
//        while( length > 0 ){
//            char bit = binary.charAt(length - 1 );
//            if(bit == '1'){
//                decimal += (int) Math.pow(2, binary.length() - length);
//            }
//            length -- ;
//        }
//        System.out.println(decimal);

        //5

//        Scanner scanner = new Scanner(System.in) ;
//
//        int number = scanner.nextInt();
//
//        String binary = "" ;
//
//
//
//        while (number > 0 ){
//
//                binary = (number % 2 ) + binary ;
//
//                number /= 2 ;
//
//        }
//        System.out.println("binary is " + binary );

        //6

        Random random = new Random();
        int x = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("let's play the game GUESS THE NUMBER");

        for(int i = 1 ; i<=100 ; i++){
            int n = scanner.nextInt();
            if(n<x){
                System.out.println("your number is lower than random");
            }
            else if (n>x){
                System.out.println("your number is higher than random number");
            }
            else{
                System.out.println("YOU GUESSED THE RIGHT NUMBER!!!");
            }
        }

    }
}