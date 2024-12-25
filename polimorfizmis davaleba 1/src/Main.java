//import nomeri1.Shape ;
//import nomeri1.Triangle ;
//import nomeri1.Square;
//import nomeri2.Shape;
//import nomeri2.Triangle;
//import nomeri2.Rectangle;
//import nomeri3.Car;
import nomeri3.Dolly;
import nomeri3.ToyFactory;
import nomeri4.DailyWageWorkers;
import nomeri4.Employee;
import nomeri4.SalariedEmployee;
import nomeri5.Car;

public class Main {


    public static void main(String[] args) {
        //1
//        Shape shape = new Shape() ;
//        Square square = new Square() ;
//        Triangle triangle = new Triangle() ;
//
//        shape.setLength(7);
//        shape.setSideNum(6);
//
//        square.setSideNum(4);
//        triangle.setSideNum(3);
//
//        square.Perimeter();
//        triangle.Perimeter() ;

        //2
//        Shape shape = new Shape() ;
//        Triangle triangle = new Triangle() ;
//        Rectangle rectangle = new Rectangle();
//
//        shape.setX(5);
//        shape.setY(4);
//        triangle.setZ(3);
//
//        triangle.Perimeter() ;
//        triangle.NameData();
//
//        rectangle.Perimeter() ;
//        rectangle.NameData();

        //3
//        ToyFactory toy = new ToyFactory();
//        Dolly dolly = new Dolly();
//        Car car = new Car();
//
//        dolly.setHairCost(4.5);
//        dolly.setClothesCost(6.7);
//        dolly.setAnotherExpenses(2.3);
//
//        car.setInterior(2.4);
//        car.setWheel(1.2);
//        car.setWheelCounter(4) ;
//        car.setAnotherExpenses(2.4);
//
//        dolly.Price() ;
//        car.Price();

        //4
//        Employee employee = new Employee();
//        SalariedEmployee salariedEmployee = new SalariedEmployee("გიორგი", "ამაღლობელი", " 541-141-234" , 1500) ;
//        DailyWageWorkers dailyWageWorkers = new DailyWageWorkers("ლიზი" , "ლობჟანიძე" , "4051-123-151" , 50 , 20 ) ;
//
//        salariedEmployee.Salary();
//        dailyWageWorkers.Salary();

        //5
        Car car = new Car();

        car.start();
        car.right();
        car.left();
        car.stop();

    }
}