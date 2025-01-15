public class University {
    private String name ;
    private boolean status ;
    private int numberOfFaculties;

    public University(String name, boolean status, int numberOfFaculties) {
        this.name = name;
        this.status = status;
        this.numberOfFaculties = numberOfFaculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public void printUniversityInfo(){
        System.out.println("Name of the university is: " + getName() );
        System.out.println("Is it state university : " + (isStatus() ? "Yes" : "No")  );
        System.out.println("Number of faculties: " + getNumberOfFaculties());
    }

    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String personalID;
        private double averageGrade;
        private int year;

        public Student(String firstName, String lastName, int age, String personalID, double averageGrade, int year) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personalID = personalID;
            this.averageGrade = averageGrade;
            this.year = year;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
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

        public String getPersonalID() {
            return personalID;
        }

        public void setPersonalID(String personalID) {
            this.personalID = personalID;
        }

        public double getAverageGrade() {
            return averageGrade;
        }

        public void setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void printStudentInfo() {
            System.out.println("Student First Name: " + firstName);
            System.out.println("Student Last Name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Personal ID: " + personalID);
            System.out.println("Average Grade: " + averageGrade);
            System.out.println("Year: " + year);
        }


    }
}
