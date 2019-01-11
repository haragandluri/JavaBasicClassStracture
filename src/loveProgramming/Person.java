package loveProgramming;

public class Person {
    public Person() { }



    public Person(String Fname) {
        this.firstName = Fname;
    }

    public Person(String Fname, String Sname) {
        this.firstName = Fname;
        this.lastName = Sname;
    }

    public Person(String Fname, String Sname, int Age) {
        this.firstName = Fname;
        this.lastName = Sname;
        this.age = Age;
    }

    private String firstName;
    private String lastName;
    private int age;


    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
