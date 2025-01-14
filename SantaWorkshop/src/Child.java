import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Child {
    private String name ;
    private double behaviorScore ;
    private List<String> wishList ;

    public Child(String name, double behaviorScore ) {
        this.name = name;
        this.behaviorScore = behaviorScore;
        wishList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBehaviorScore() {
        return behaviorScore;
    }

    public void setBehaviorScore(double behaviorScore) {
        this.behaviorScore = behaviorScore;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishlist(List<String> wishList) {
        wishList = wishList;
    }

    public void addWish(String wish){
        wishList.add(wish);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return behaviorScore == child.behaviorScore && Objects.equals(name, child.name) && Objects.equals(wishList, child.wishList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, behaviorScore, wishList);
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", behaviorScore=" + behaviorScore +
                ", wishList=" + wishList +
                '}';
    }
}

