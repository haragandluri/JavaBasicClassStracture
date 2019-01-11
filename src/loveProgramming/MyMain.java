package loveProgramming;

public class MyMain {

    public static void main(String[] args){
        Person p4=new Person("Hari","Prasad",47);
        System.out.println("Constructor with three arguments");
        System.out.println("name ;"+p4.getFirstName());
        System.out.println("name ;"+p4.getLastName());
        System.out.println("name ;"+p4.getAge());

        System.out.println("new person");

        Person p3=new Person("Vijay","Yalamanchi");//default constructor
//        p3.setFirstName("Hara");
//        p3.setLastName("Prasad");
//        p3.setAge(47);
        Person p2=new Person( "Ashu");
//
        Person p1=new Person();
//        p1.setFirstName("Rahul");
//        p1.setLastName("Gandhi");
//        p1.setAge(15);

        System.out.println("Constructor with no Arguments");

        System.out.println("My Name is "+p1.getFirstName()+" "+p1.getLastName()+".");
        System.out.println("I am "+p1.getAge()+" Years old.");
        System.out.println("I want to be your PM in 2019");
//        p2.setLastName("Yalamanchi");
//        p2.setAge(40);
        System.out.println("Constructor with two arguments");

        System.out.println("My Name is "+p3.getFirstName()+" "+p3.getLastName()+".");
        System.out.println("I am "+p3.getAge()+" Years old.");
        System.out.println("I want to be your PM in 2019");
//        p2.setLastName("Yalamanchi");
//        p2.setAge(40);
        System.out.println("Constructor with one arguments");
        System.out.println("My Name is "+p2.getFirstName()+" "+p2.getLastName()+".");
        System.out.println("I am "+p2.getAge()+" Years old.");
        System.out.println("I want master java in 2019.");
    }
}
