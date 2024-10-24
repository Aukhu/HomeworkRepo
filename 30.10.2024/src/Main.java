import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //1

//        int a = 5 ;
//        int b = 6 ;
//        int c = 7 ;
//        double avarage = (a+b+c) / 3.0 ;
//        System.out.println(avarage);

        //2

//        double a = 8.5; // შეცვალეთ რიცხვი საჭიროების მიხედვით
//        String result =  (a % 2 < 1) ? "ლუწი" : "კენტი"  ;
//
//        System.out.println(result);


        //3
//        int a = -176;
//        int b = 153 ;
//
//        String result = (a>b) ? "a > b  " : "b > a " ;
//        System.out.println(result);

        //4
//        int a = 3458 ;
//        int sum = (a/1000) + ((a%1000)/100) + ((a%100)/10) + a%10 ;
//        System.out.println(sum);

        //5

        int a = 134 ;
        int b = 6 ;
        int c = 10 ;

        String result = (a+b>=c) && (a+c>=b) && (b+c>=a) ? "შესაძლებელია" : "შეუძლებელია" ;
        System.out.println(result);

    }
}









