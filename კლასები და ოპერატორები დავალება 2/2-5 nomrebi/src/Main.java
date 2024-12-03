import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Recursion rec = new Recursion();

        // 2

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int k = scanner.nextInt();
//
//        System.out.println(rec.abkSum(a, b, k));

        //3
//        int n = scanner.nextInt();
//
//        System.out.println(rec.nSum(n));

        //4
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        System.out.println(rec.powXY(x ,  y));

        //5
        int n = scanner.nextInt();

        rec.oddOReven(n);
    }
}