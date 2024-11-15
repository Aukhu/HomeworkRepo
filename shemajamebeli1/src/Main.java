import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        //sum ის მნიშვნელობა იქნება -3 ;
        //პასუხი b) -3 ;

        //2
        //არასწორი არის c ვარიანტი ;

        //3
        //  პასუხი: D

        //4
        // პასუხი: c : String ;

        //5
        //პასუხი: a) A ;

        //6
        //პასუხი: c) byte, short, int, long;

        //7
        //პასუხი: c)კომპილაციის ერორი ;

        //8
        //პასუხი: a)break;

        //9
        //პასუხი:a) აცხადებს 10 ინტიან მასივს და ყველას ანიჭებს მნიშვნელობას 0;

        //10
        //პასუხი: c) 24 ;

        //11
        //პასუხი: c)მასივს აქვს ფიქსირებული ზომა ;

        //12
        //პასუხი:c) git log ;

        //13
        //პასუხი:a) Remote რეპოზიტორის ასლს ქმნის ლოკალურად ;

        //14
        //პასუხი:a) 0 ;

        //15
        //პასუხი:b) მასივი არის ერთი ცვლადი, რომელსაც შეუძლია შეინახოს რამდენიმე ერთი და იმავე
        //ტიპის მნიშვნელობა;

        //16
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        int[] price = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            price[i] = scanner.nextInt();
//        }
//
//        int max = price[0];
//        int min = price[0];
//
//        int MaxIndex = 0 ;
//        int MinIndex = 0 ;
//
//        for(int i = 0 ; i<price.length ; i++){
//            if(price[i]>max){
//                max = price[i];
//                MaxIndex = i ;
//            }
//            else if (price[i]<min){
//                 min = price[i];
//                 MinIndex = i-1 ;
//
//            }
//        }
//        System.out.println(MaxIndex + " მაღაზიაში ყველაზე ძვირიანი წიგნია " + max);
//        System.out.println(MinIndex + " მაღაზიაში ყველაზე იაფიანი წიგნია " + min);

        //17
//        for (int i = 0; i < 100; i++) {
//            if (i == 0) {
//                System.out.println(i);
//            } else if (i % 5 == 0 && i % 7 == 0) {
//                System.out.println("HEYHOW");
//            } else if (i % 5 == 0) {
//                System.out.println("HEY");
//            } else if (i % 7 == 0) {
//                System.out.println("HOW");
//            } else {
//                System.out.println(i);
//            }
//        }

        //18
//        Scanner scanner = new Scanner(System.in);
//        int rows = scanner.nextInt();
//        int cols = scanner.nextInt();
//
//        int MaxIndex1 = 0 ;
//        int MaxIndex2 = 0 ;
//
//        int MinIndex1 = 0 ;
//        int MinIndex2 = 0 ;
//
//        int array [][] = new int[rows][cols];
//
//        Random random = new Random();
//
//
//        for (int i = 0 ; i < rows ; i++){
//            for (int j = 0; j< cols; j++){
//                array[i][j] = random.nextInt(100+1);
//            }
//        }
//        for (int i = 0 ; i < rows ; i++){
//            for (int j = 0; j< cols; j++){
//                System.out.print(array[i][j] + " ");
//                System.out.println();
//            }
//        }
//
//        int max = array[0][0];
//        int min = array[0][0];
//
//
//        for (int i = 0 ; i < rows ; i++) {
//            for (int j = 0; j < cols; j++) {
//                if(array[i][j]>max){
//                    max = array[i][j];
//                    MaxIndex1 = i ;
//                    MaxIndex2 = j ;
//                }
//                else if(array[i][j]<min){
//                    min = array[i][j];
//                    MinIndex1 = i ;
//                    MinIndex2 = j ;
//                }
//            }
//        }
//        System.out.println();
//        System.out.println("ყველაზე მეტია " + max +" ინდექსია " + MaxIndex1 + " " + MaxIndex2);
//        System.out.println("ყველაზე ნაკლებია "+min +" ინდექსია " + MinIndex1 + " " + MinIndex2);

        //20
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        int cols = scanner.nextInt();

        int array[][] = new int[rows][cols];

        Random random = new Random();

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ;   j++){
                array[i][j] = random.nextInt(100+1);
            }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ;   j++){
                System.out.println(array[i][j] + ", ");
            }
            System.out.println();
        }

        int array1 [][] = new int[rows][cols] ;

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ;   j++){
                array1[i][j] = array[rows-j-1] [i] ;
            }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ;   j++){
                System.out.println(array1[i][j] + ", ");
            }
            System.out.println();
        }

    }
}