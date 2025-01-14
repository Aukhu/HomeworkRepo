import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void addChild(Child child){
        childrenList.add(child);
    }

    public void deliverGifts(){
        System.out.println("Santa has delivered gifts to those who had good behavior ");
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> goodChildren = new ArrayList<>();
        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                goodChildren.add(child);
            }
        }
        return goodChildren;
    }

    @Override
    public String spreadJoy() {
        return "Santa is spreading the joy";
    }

    @Override
    public String singCarols() {
        return "Santa is singing";
    }

    @Override
    public String decorateTree() {
        return "the tree has been decorated";
    }

}
