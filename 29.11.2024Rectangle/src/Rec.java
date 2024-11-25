import static java.lang.Math.sqrt;

public class Rec {
    double length ;
    double width ;

    public Rec(){
        this.length = length ;
        this.width = width ;
    }

    void perimeter(){
        double perimeter =  (width+length)*2 ;
        System.out.println("მართკუთხედის პერიმეტრი = " + perimeter );
    }

    void area(){
        double area =  width*length ;
        System.out.println("მართკუთხედის ფართობი = " + area );
    }

    void diagoanl(){
        double diagonal = sqrt(width*width + length*length) ;
        System.out.println("მართკუთხედის დიაგონალი = " + diagonal);
    }

    void isSqueare(){
        if(width == length){
            System.out.println("მოცემული მართკუთხედი კვადრატია");
        }
        else {
            System.out.println("მოცემული მართკუთხედი არ არის კვადრატი");
        }


    }

}
