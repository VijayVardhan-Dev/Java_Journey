class Person{
    String name ;
    int age;

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name + "\n" + "age: " + age);
    }
}

class Student extends Person{
    String branch ;
    int marks;

    Student(String name , int age, String branch , int marks){
        super(name , age);
        this.branch = branch;
        this.marks = marks;
    }

    void displayStudent(){
        System.out.println("Name: " + name + "\n" + "age: " + age + "\n" + "branch: " + branch + "\n" + "marks: " + marks);
    }
}

class Teacher extends Person{
    String subject ;
    int salary;

    Teacher(String name , int age, String subject , int salary){
        super(name , age);
        this.subject = subject;
        this.salary = salary;
    }

    void displayTeacher(){
        System.out.println("Name: " + name + "\n" + "age: " + age + "\n" + "subject: " + subject + "\n" + "salary: " + salary);
    }
}

public class Hierarchical {
    public static void main(String[] args){
        Person p = new Person("Vardhan" , 19);
        p.display();
        Student s = new Student("Vijay" , 19 , "CSE" , 27);
        s.displayStudent();
        Teacher t = new Teacher("Dr Sridevi" , 30 , "CSE" , 157000);
        t.displayTeacher();
    }
}
