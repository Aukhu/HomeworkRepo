import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Choose product type: ");
            System.out.println("1. Milk");
            System.out.println("2. Cake");
            System.out.println("3. Sandwich");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("\nEnter price: ");
                    double price1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("\nEnter date: ");
                    String date1 = scanner.nextLine();
                    System.out.print("\nEnter volume: ");
                    double volume = scanner.nextDouble();
                    scanner.nextLine();

                    Milk milk = new Milk(price1, date1, volume);
                    products[i] = milk;

                    break;

                case 2:
                    System.out.print("\nEnter price: ");
                    double price2 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("\nEnter date: ");
                    String date2 = scanner.nextLine();
                    System.out.print("\nEnter weight: ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();

                    Cake cake = new Cake(price2, date2, weight);
                    products[i] = cake;

                    break;

                case 3:
                    System.out.print("\nEnter price: ");
                    double price3 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("\nEnter date: ");
                    String date3 = scanner.nextLine();
                    System.out.print("\nEnter size: ");
                    double size = scanner.nextDouble();
                    scanner.nextLine();

                    Sandwich sandwich = new Sandwich(price3, date3, size);
                    products[i] = sandwich;

                    break;

                default:
                    System.out.println("Enter correct choice!");
                    i--;

                    break;
            }
        }


        Market market = new Market(products);
    }
}