public class Human {
    private String firstName ;
    private String lastName ;
    private int age ;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Walk(){
        System.out.println(getfirstName() + " is walking :)");
    }

    public void HangOut(String secondPersonFirstName){
        System.out.println(firstName + " is hanging out with " + secondPersonFirstName);
    }
}
