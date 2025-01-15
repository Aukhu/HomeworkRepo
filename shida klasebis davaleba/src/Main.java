public class Main {
    public static void main(String[] args) {
//        n1
//        University university = new University("Tbilisi State University", true, 15);
//
//        University.Student student = university.new Student("Giorgi", "Papunashvili", 22, "123456789", 8.5, 3);
//
//        university.printUniversityInfo();
//
//        student.printStudentInfo();

//        n2
//        Car[] cars = new Car[3];
//
//        cars[0] = new Car("Toyota", "Corolla", "AB123CD", "Petrol", 4, 300000);
//        cars[1] = new Car("Ford", "Focus", "XY987ZT", "Diesel", 6, 350000);
//        cars[2] = new Car("Honda", "Civic", "LM456OP", "Hybrid", 4, 280000);
//
//        // Find the car with the engine that has the maximum mileage (resource)
//        Car maxMileageCar = cars[0];
//        for (Car car : cars) {
//            if (car.getEngine().getResource() > maxMileageCar.getEngine().getResource()) {
//                maxMileageCar = car;
//            }
//        }
//
//        System.out.println("\nCar with the Maximum Engine Resource:");
//        maxMileageCar.printInfo();

        //3

//        Computer computer = new Computer("USA", "Dell", 1200.00, true);
//
//        Computer.Monitor monitor = computer.new Monitor(27, "2560x1440", 144);
//        Computer.Motherboard motherboard = computer.new Motherboard(4, "DDR4", 3200);
//
//        System.out.println("Computer Information:");
//        computer.printComputerInfo();
//
//        System.out.println("\nMonitor Information:");
//        monitor.printMonitorInfo();
//
//        System.out.println("\nMotherboard Information:");
//        motherboard.printMotherboardInfo();

        //4
//        Notification smsNotification = new Notification("John", "Alice", "Hello, this is an SMS message!") {
//            @Override
//            public void send() {
//                System.out.println("Sending SMS from " + sender + " to " + receiver + ": " + messageText);
//            }
//
//            @Override
//            public void receive() {
//                System.out.println("Receiving SMS at " + receiver + " from " + sender + ": " + messageText);
//            }
//        };
//
//        smsNotification.send();
//        smsNotification.receive();

        //5
        Library library = new Library(131, "City Library");

        library.PrintInfo();
    }
}