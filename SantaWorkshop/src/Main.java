import java.util.*;
public class Main {
    public static void main(String[] args) {




                Elf elf1 = new Elf("John", "Johnny", 25, 5, "ToyMaker");
                Elf elf2 = new Elf("Alice", "Ali", 22, 6, "GiftWrapper");

                elf1.makeToy();
                elf1.wrapGifts();
                elf2.makeToy();
                elf2.wrapGifts();


                Reindeer reindeer1 = new Reindeer("Dasher" , "dash", 5, 90 , "green");
                Reindeer reindeer2 = new Reindeer("Prancer", 7, 90, 100 , "red");

                reindeer1.fly();
                reindeer1.checkFitnessLevel();
                reindeer2.fly();
                reindeer2.checkFitnessLevel();

                // 3. Child ობიექტების შექმნა
                Child child1 = new Child("Tom", 6);
                child1.addWish("Toy Train");
                child1.addWish("Bicycle");

                Child child2 = new Child("Lily", 8);
                child2.addWish("Dollhouse");


                List<Child> childrenList = new ArrayList<>();
                childrenList.add(child1);
                childrenList.add(child2);

                Santa santa = new Santa("Santa Claus", "Saint Nick", 1000 );

                List<Child> niceList = santa.checkNaughtyOrNiceList();
                santa.deliverGifts();


                Snowman snowman = new Snowman(5.5, "Red", false);
                snowman.decorate("Scarf");
                snowman.melt();
                snowman.makeMagical();
    }
}


