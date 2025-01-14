import java.util.Objects;

public abstract class WorkshopMember {
    private String name ;
    private String nickName ;
    private int age ;

    public WorkshopMember(String name,String nickName , int age ) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkshopMember that = (WorkshopMember) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(nickName, that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nickName, age);
    }

    @Override
    public String toString() {
        return "WorkshopMember{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }
}

