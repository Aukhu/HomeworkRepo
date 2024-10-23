public class Main {
    public static void main(String[] args) {
        //1
//        int a = 5 ;
//        int b = 15 ;
//        int number = 0 ;
//         number = a ;
//        a = b ;
//        b = number ;
//        System.out.println(a);
//        System.out.println(b);

        //2
//        float f = 10.234F ;
//
//        int a = (int)f ;
//
//        float x = f - a ;
//
//        System.out.println(x);

        //3
//        int n =67 ;
//        if(n/10>=10){
//            System.out.println("სამნიშნაა");
//        }
//        else{
//            System.out.println("არაა სამნიშნა ");
//        }

        //4
//        char c = 'a' ;
//        char s = Character.toUpperCase(c);
//        System.out.println(s);

        //5
//        double n = 19.7094 ;
//        int a = (int)n ;
//        if(n%1>0.5){
//            System.out.println(a+1);
//        } else if (n%1<0.5) {
//            System.out.println(a);
//        }

        //6
//        int a = 4 ;
//        int b = 4 ;
//        int AB = a*b ;
//        int k = 3 ;
//        int KK = k * k;
//        if(AB<=KK){
//            System.out.println("1");
//        }
//        else if(AB>KK && AB%KK==0){
//            System.out.println(AB/KK);
//        }
//        else{
//            System.out.println(AB/KK+1);
//        }

//        //7
        int t = 4665 ;
        int hours = t/3600 ;
        int mins = (t - hours*3600) / 60  ;
        int sec =  t - (hours*3600) - (mins*60) ;
        System.out.println(t);
        System.out.println("hours = " +hours);
        System.out.println("mins = " +mins);
        System.out.println("sec = " +sec);

    }
}