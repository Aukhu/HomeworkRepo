public class Recursion {
    //2
    int abkSum(int a, int b, int k) {
        if (a > b) return 0;
        return a%k == 0 ? a+abkSum(a+1 , b , k) : abkSum( a+1 , b , k);
    }

    //3
    int nSum(int n ){
        if (n == 1 ) return 1 ;

        return n + nSum(n-1 );
    }

    //4
    int powXY(int x, int y){
        if(y==1) return x;

        return x*powXY(x, y-1);
    }

    //5
    int sumNull(int n  ){
        if (n<=0) return 0;

        return n%10 == 0 ? 1+sumNull(n/10) : sumNull(n/10) ;
    }

    void oddOReven(int n ){
        System.out.println( sumNull(n) );
        System.out.println(sumNull(n)%2 !=0 ? "Odd" : "Even" ) ;
    }

}


