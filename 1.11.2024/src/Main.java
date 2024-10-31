import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        //1

//        int sum = 0 ;
//        for(int i = 10 ; i<=100 ; i+=5){
//            sum+=i;
//        }
//        System.out.println(sum);

        //2
//        int number = 8753;
//        int length = 0;
//
//        do{
//            number /= 10 ;
//            length++;
//        }while(number>0);
//
//
//        System.out.println("რიცხვი " + length + " ნიშნაა");

        //3
//        int number = 17;
//
//        boolean isPrime = true;
//
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//            if(number == 1 ){
//                System.out.println("რიცხვი ერთის ტოლია");
//            }
//            else if (isPrime == true && number > 1) {
//                System.out.println("მარტივია");
//            } else {
//                System.out.println("არ არის მარტივი");
//            }

        //4
//        int a = 240;
//        int b = 360;
//        int usg = 0;
//            for (int i = Math.min(a,b); i >= 1; i--) {
//                if (a % i == 0 && b % i == 0) {
//                    usg += i;
//                    break;
//                }
//            }
//        System.out.println(usg);


        //5

//        int sum = 0 ;
//        for (int i = 100 ; i<=999 ; i++){
//            sum = (i%10 + (i/10)%10 + i/100%10);
//            if( i%sum == 0){
//                System.out.println(i);
//            }
//        }

        //6
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for(int i = 0; i<8; i++){
            System.out.println(first+second);
            int next = first;

            first = second;
            second += next;

        }
    }
}